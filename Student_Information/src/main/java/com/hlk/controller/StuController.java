package com.hlk.controller;

import com.hlk.pojo.Stu;
import com.hlk.pojo.StuGrid;
import com.hlk.pojo.User;
import com.hlk.service.StuService;
import com.hlk.service.UserService;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import com.alibaba.fastjson.JSON;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.util.List;

/**
 * Created by lenovo on 2017/4/26.
 */
@Controller
@RequestMapping(value = "/stu")
public class StuController {
    @Autowired
    private StuService stuService;
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/student/stuList",method = RequestMethod.GET)
    public String stuList(User user,Stu stu,Model model) {
    	//根据登录用户的id去查询他所属stu的信息
    	int id=user.getId();
    	List<Stu> list=stuService.getAllStuInfoById(id);
    	System.out.println(list);
    	model.addAttribute("list", list);
        return "/student/stuList";
    }

    @RequestMapping(value = "/addStu",method = RequestMethod.POST)
    public String add(@RequestParam("stuName") String stuName,
                      @RequestParam("stuAge") int stuAge,@RequestParam("stuMajor") String stuMajor){
        Stu stu = new Stu();
        stu.setStuName(stuName);
        stu.setStuAge(stuAge);
        stu.setStuMajor(stuMajor);
        stuService.addStu(stu);
        return "redirect:student/stuList?id="+stu.getUser().getId();
    }

    @RequestMapping(value="/delStu",method = RequestMethod.GET)
    public String delete(@RequestParam("stuId") int stuId){
        System.out.println("stuId:"+stuId);
        stuService.delStu(stuId);
        return "redirect:student/stuList";
    }

    @RequestMapping(value="/updateStu",method = RequestMethod.POST)
    public String update(@RequestParam("stuAge") int stuId,@RequestParam("stuName") String stuName,
                         @RequestParam("stuAge") int stuAge,@RequestParam("stuMajor") String stuMajor){
        Stu stu = new Stu();
        stu.setStuId(stuId);
        stu.setStuName(stuName);
        stu.setStuAge(stuAge);
        stu.setStuMajor(stuMajor);
        stuService.updateStu(stu);
        return "redirect:student/stuList";
    }

    @RequestMapping(value="/getStuInfo",produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Stu getStuById(@RequestParam("stuId") int stuId){
    	
        Stu stu = stuService.getStuById(stuId);
        System.out.println(stu+"-----------");
		/*
		 * User user = userService.getUserByUserName("hlk1135"); stu.setUser(user);
		 */
        System.out.println("hello=====================================");
        return stu;
    }

	
	  @RequestMapping(value = "/stuList",produces ={"application/json;charset=UTF-8"})
	  @ResponseBody public StuGrid getStuList(@RequestParam("current") int current,@RequestParam("rowCount") int rowCount) {
		 System.out.println("==========="+current+":"+rowCount+"--------"); 
		 int total= stuService.getStuNum(); 
		 List<Stu> list =stuService.getPageStu(current,rowCount); 
		 StuGrid stuGrid = new StuGrid();
		 stuGrid.setCurrent(current); 
		 stuGrid.setRowCount(rowCount);
		 stuGrid.setRows(list); 
		 stuGrid.setTotal(total); 
		 return stuGrid; 
	 }
	
	  /**
	     * 查找所有学生信息
	     * @param current
	     * @param rowCount
	     * @param searchValue
	     * @return
	     */
//	    @RequestMapping(value = "/stuList",produces = {"application/json;charset=UTF-8"})
//	    @ResponseBody
//	    public String getStuList(@RequestParam("current") int current,@RequestParam("rowCount") int rowCount,
//	                             @RequestParam("searchPhrase") String searchValue,HttpServletRequest request) {
//	    	System.out.println("==================="+rowCount+"-");
//	        String sort="";         //排序
//	        String sortId = request.getParameter("sort[stuId]");
//	        String sortName = request.getParameter("sort[stuName]");
//	        String sortAge = request.getParameter("sort[stuAge]");
//	        if(!StringUtils.isEmpty(sortId)){
//	            sort=" order by stuId "+sortId;
//	        }
//	        if(!StringUtils.isEmpty(sortName)){
//	            sort=" order by stuName "+sortName;
//	        }
//	        if(!StringUtils.isEmpty(sortAge)){
//	            sort=" order by stuAge "+sortAge;
//	        }
//	        //创建学生查询对象
//	        StuGrid stuGrid = new StuGrid();
//	        //获取所有学生
//	        if(rowCount<0){
//	            stuGrid.setRows(stuService.getAllStu(searchValue,sort));
//	            return JSON.toJSONString(stuGrid);
//	        }
//	        int total = stuService.getStuNum(searchValue,sort);//获取总记录
//	        //根据条件查询出相关的学生集合
//	        List<Stu>  list = stuService.getPageStu(current,rowCount,searchValue,sort);
//	        stuGrid.setCurrent(current);
//	        stuGrid.setRowCount(rowCount);
//	        stuGrid.setRows(list);
//	        stuGrid.setTotal(total);
//	        String json = JSON.toJSONString(stuGrid);
//	        System.out.println(json);
//	        return json;
//	    }

    
    
    @RequestMapping(value="/stulistxml",produces = {"application/xml;charset=UTF-8"})
    @ResponseBody
    public StuGrid getstulistxml(@RequestParam("current") int current,@RequestParam("rowCount") int rowCount){
        int total = stuService.getStuNum();
        List<Stu>  list = stuService.getPageStu(current,rowCount);
        StuGrid stuGrid = new StuGrid();
        stuGrid.setCurrent(current);
        stuGrid.setRowCount(rowCount);
        stuGrid.setRows(list);
        stuGrid.setTotal(total);
        return stuGrid;
    }

    @RequestMapping("/exportStu")
    public void export(HttpServletResponse response) throws Exception{
        InputStream is=stuService.getInputStream();
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("contentDisposition", "attachment;filename=AllUsers.xls");
        ServletOutputStream output = response.getOutputStream();
        IOUtils.copy(is,output);
    }
}
