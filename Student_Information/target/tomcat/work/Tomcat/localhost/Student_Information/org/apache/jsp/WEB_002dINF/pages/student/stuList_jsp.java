/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-12-08 08:07:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages.student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class stuList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>学生信息管理系统</title>\n");
      out.write("\t<script src=\"/js/jquery-1.12.3.min.js\"></script>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"//cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"/css/jquery.bootgrid.min.css\">\n");
      out.write("\t<script src=\"//cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"/js/jquery.bootgrid.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"/js/bootstrap-datetimepicker.min.js\"></script>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"/css/bootstrap-datetimepicker.min.css\" type=\"text/css\"></link>\n");
      out.write("\t<!-- 要使用模态框需要加入下面这三个 -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\t<script src=\"https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js\"></script>\n");
      out.write("\t<script src=\"https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\t<!-- DataTables JavaScript -->\n");
      out.write("\t<script src=\"");
      out.print(basePath);
      out.write("js/jquery.dataTables.min.js\"></script>\n");
      out.write("\t<script src=\"");
      out.print(basePath);
      out.write("js/dataTables.bootstrap.min.js\"></script>\n");
      out.write("\t<!-- Custom Theme JavaScript -->\n");
      out.write("\t<script src=\"");
      out.print(basePath);
      out.write("js/sb-admin-2.js\"></script>\n");
      out.write("\t<!-- Metis Menu Plugin JavaScript -->\n");
      out.write("\t<script src=\"");
      out.print(basePath);
      out.write("js/metisMenu.min.js\"></script>\n");
      out.write("\t\n");
      out.write("\t<!-- MetisMenu CSS -->\n");
      out.write("\t<link href=\"");
      out.print(basePath);
      out.write("css/metisMenu.min.css\" rel=\"stylesheet\">\n");
      out.write("\t\n");
      out.write("\t<!-- DataTables CSS -->\n");
      out.write("\t<link href=\"");
      out.print(basePath);
      out.write("css/dataTables.bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("\t\n");
      out.write("\t<!-- Custom CSS -->\n");
      out.write("\t<link href=\"");
      out.print(basePath);
      out.write("css/sb-admin-2.css\" rel=\"stylesheet\">\n");
      out.write("\t\n");
      out.write("\t<!-- Custom Fonts -->\n");
      out.write("\t<link href=\"");
      out.print(basePath);
      out.write("css/font-awesome.min.css\" rel=\"stylesheet\"\n");
      out.write("\t\ttype=\"text/css\">\n");
      out.write("\t<link href=\"");
      out.print(basePath);
      out.write("css/boot-crm.css\" rel=\"stylesheet\"\n");
      out.write("\t\ttype=\"text/css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"container\">\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t<nav class=\"navbar navbar-inverse\">\n");
      out.write("\t\t\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon-bar\">*****</span>\n");
      out.write("\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t<a class=\"navbar-brand\" href=\"#\">学生信息管理系统</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"/user/logout\">logout</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</nav>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t<h2>student信息</h2>\n");
      out.write("\t\t\t<a class=\"btn btn-primary\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/stu/exportStu\">导出数据为excel</a>\n");
      out.write("\t\t\t<a class=\"btn btn-primary\" href=\"#\"  id=\"add\">添加学生</a> \n");
      out.write("\t\t\t<!-- <button class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#myModal\">点击我显示模态框</button> -->\n");
      out.write("\t\t\t<div class=\"btn-group\">\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-primary dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("\t\t\t\t\t查看接口数据 <span class=\"caret\"></span>\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/stu/stulistxml?current=1&rowCount=10&sort[sender]=asc&searchPhrase=&id=b0df282a-0d67-40e5-8558-c9e93b7befed\" target=\"_blank\">XML</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/stu/getStuInfo?stuId=1&sort[sender]=asc&searchPhrase=&id=b0df282a-0d67-40e5-8558-c9e93b7befed\" target=\"_blank\">JSON</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<table id=\"grid-data\" class=\"table table-condensed table-hover table-striped\">\n");
      out.write("\t\t\t\t<thead>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<th data-column-id=\"stuId\"  data-identifier=\"true\" data-type=\"numeric\">stuId</th>\n");
      out.write("\t\t\t\t\t<th data-column-id=\"stuName\">stuName</th>\n");
      out.write("\t\t\t\t\t<th data-column-id=\"stuAge\">stuAge</th>\n");
      out.write("\t\t\t\t\t<th data-column-id=\"stuMajor\" data-order=\"desc\">stuMajor</th>\n");
      out.write("\t\t\t\t\t<th data-column-id=\"commands\" data-formatter=\"commands\" data-sortable=\"false\">Commands</th>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t</thead>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("function editStudent(stuId) {\n");
      out.write("\talert(stuId);\n");
      out.write("\t$.ajax({\n");
      out.write("\t\ttype:\"get\",\n");
      out.write("\t\turl:\"");
      out.print(basePath);
      out.write("stu/getStuInfo\",\n");
      out.write("\t\tdata:{\"stuId\":stuId},\n");
      out.write("\t\tsuccess:function(data) {\n");
      out.write("\t\t\talert(data.stuId);//这个id值要和请求方法的命名方式一样\n");
      out.write("\t\t\t$(\"#stuId2\").val(data.stuId);\n");
      out.write("\t\t\t$(\"#stuName2\").val(data.stuName);\n");
      out.write("\t\t\t$(\"#stuAge2\").val(data.stuAge);\n");
      out.write("\t\t\t$(\"#stuMajor2\").val(data.stuMajor);\n");
      out.write("\t\t}\n");
      out.write("\t});\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\t$(document).ready(function(){\n");
      out.write("\t    $(\"#add\").click(function(){\n");
      out.write("\t        $(\".addmodal\").modal();\n");
      out.write("\t    });\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t/* $(document).ready(function(){\n");
      out.write("\t    $(\"#update\").click(function(){\n");
      out.write("\t        $(\".stumodal\").modal();\n");
      out.write("\t    });\n");
      out.write("\t}); */\n");
      out.write("\n");
      out.write("    $(document).ready(function(){\n");
      out.write("        var grid = $(\"#grid-data\").bootgrid({\n");
      out.write("            ajax:true,\n");
      out.write("            post: function ()\n");
      out.write("            {\n");
      out.write("                return {\n");
      out.write("                    id: \"b0df282a-0d67-40e5-8558-c9e93b7befed\"\n");
      out.write("                };\n");
      out.write("                alert(id);\n");
      out.write("            },\n");
      out.write("            url:\"");
      out.print(basePath);
      out.write("stu/stuList?current=1&rowCount=10&sort[sender]=asc&searchPhrase=&id=b0df282a-0d67-40e5-8558-c9e93b7befed\",\n");
      out.write("            formatters: {\n");
      out.write("                \"commands\": function(column, row)\n");
      out.write("                {\n");
      out.write("                    return \"<button type=\\\"button\\\" class=\\\"btn btn-xs btn-default command-edit\\\" data-row-id=\\\"\" + row.stuId + \"\\\">编辑<span class=\\\"fa fa-pencil\\\"></span></button> \" +\n");
      out.write("                        \"<button type=\\\"button\\\" class=\\\"btn btn-xs btn-default command-delete\\\" data-row-id=\\\"\" + row.stuId + \"\\\">删除<span class=\\\"fa fa-trash-o\\\"></span></button>\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        }).on(\"loaded.rs.jquery.bootgrid\", function()\n");
      out.write("\t\t{\n");
      out.write("            grid.find(\".command-edit\").on(\"click\", function(e)\n");
      out.write("            {\n");
      out.write("                $(\".stumodal\").modal();\n");
      out.write("                $.post(\"");
      out.print(basePath);
      out.write("stu/getStuInfo\",{stuId:$(this).data(\"row-id\")},function(str){\n");
      out.write("                    $(\"#stuId2\").val(str.stuId);\n");
      out.write("                    $(\"#stuName2\").val(str.stuName);\n");
      out.write("                    $(\"#stuAge2\").val(str.stuAge);\n");
      out.write("                    $(\"#stuMajor2\").val(str.stuMajor);\n");
      out.write("                });\n");
      out.write("            }).end().find(\".command-delete\").on(\"click\", function(e)\n");
      out.write("            {\n");
      out.write("                alert(\"You pressed delete on row: \" + $(this).data(\"row-id\"));\n");
      out.write("                $.post(\"");
      out.print(basePath);
      out.write("stu/delStu\",{stuId:$(this).data(\"row-id\")},function(){\n");
      out.write("                    alert(\"删除成功\");\n");
      out.write("                    $(\"#grid-data\").bootgrid(\"reload\");\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("\n");
      out.write("\t\n");
      out.write("    \n");
      out.write("\n");
      out.write("</script>\n");
      out.write("<!-- id=\"stumodal\" -->\n");
      out.write("<div class=\"modal fade stumodal\"   tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"mySmallModalLabel\">\n");
      out.write("\t<div class=\"modal-dialog modal-sm\" role=\"document\">\n");
      out.write("\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("\t\t\t\t<h4 class=\"modal-title\">update Stu</h4>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/stu/updateStu\" method=\"post\">\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<label for=\"stuId2\">stuId</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"stuId\" class=\"form-control\" id=\"stuId2\" readonly=\"true\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<label for=\"stuName2\">stuName</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"stuName\" class=\"form-control\" id=\"stuName2\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<label for=\"stuAge2\">stuAge</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"stuAge\" class=\"form-control\" id=\"stuAge2\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<label for=\"stuMajor2\">stuMajor</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"stuMajor\" class=\"form-control\" id=\"stuMajor2\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">Save changes</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"modal fade addmodal\"  tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"mySmallModalLabel\">\n");
      out.write("\t<div class=\"modal-dialog modal-sm\">\n");
      out.write("\t\t<div class=\"modal-content\"  >\n");
      out.write("\t\t\t<div class=\"modal-header\" >\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("\t\t\t\t<h4 class=\"modal-title\">add stu</h4>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/stu/addStu\" method=\"post\">\n");
      out.write("\t\t\t\t<div class=\"modal-body\"  >\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<label for=\"stuName1\">stuName</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"stuName\" class=\"form-control\" id=\"stuName1\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<label for=\"stuAge1\">stuAge</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"stuAge\" class=\"form-control\" id=\"stuAge1\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<label for=\"stuMajor1\">stuMajor</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"stuMajor\" class=\"form-control\" id=\"stuMajor1\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"Id\" class=\"form-control\" id=\"Id\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">Add Stu</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
