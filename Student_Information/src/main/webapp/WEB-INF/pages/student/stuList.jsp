<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<title>学生信息管理系统</title>
	<script src="/js/jquery-1.12.3.min.js"></script>
	<link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="stylesheet" href="/css/jquery.bootgrid.min.css">
	<script src="//cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="/js/jquery.bootgrid.min.js"></script>
	<script type="text/javascript" src="/js/bootstrap-datetimepicker.min.js"></script>
	<link rel="stylesheet" href="/css/bootstrap-datetimepicker.min.css" type="text/css"></link>
	<!-- 要使用模态框需要加入下面这三个 -->
	<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<!-- DataTables JavaScript -->
	<script src="<%=basePath%>js/jquery.dataTables.min.js"></script>
	<script src="<%=basePath%>js/dataTables.bootstrap.min.js"></script>
	<!-- Custom Theme JavaScript -->
	<script src="<%=basePath%>js/sb-admin-2.js"></script>
	<!-- Metis Menu Plugin JavaScript -->
	<script src="<%=basePath%>js/metisMenu.min.js"></script>
	
	<!-- MetisMenu CSS -->
	<link href="<%=basePath%>css/metisMenu.min.css" rel="stylesheet">
	
	<!-- DataTables CSS -->
	<link href="<%=basePath%>css/dataTables.bootstrap.css" rel="stylesheet">
	
	<!-- Custom CSS -->
	<link href="<%=basePath%>css/sb-admin-2.css" rel="stylesheet">
	
	<!-- Custom Fonts -->
	<link href="<%=basePath%>css/font-awesome.min.css" rel="stylesheet"
		type="text/css">
	<link href="<%=basePath%>css/boot-crm.css" rel="stylesheet"
		type="text/css">
</head>
<body>
<div class="container">
	<div class="row">
		<div class="col-md-12">
			<nav class="navbar navbar-inverse">
				<div class="container-fluid">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
							<span class="sr-only">Toggle navigation</span>
							<span class="icon-bar">*****</span>
						</button>
						<a class="navbar-brand" href="#">学生信息管理系统</a>
					</div>
					<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
						<ul class="nav navbar-nav">
							<li><a href="/user/logout">logout</a></li>
						</ul>
					</div>
				</div>
			</nav>
		</div>
	</div>
	<div class="row">
		<div class="col-md-12">
			<h2>student信息</h2>
			<a class="btn btn-primary" href="${pageContext.request.contextPath}/stu/exportStu">导出数据为excel</a>
			<a class="btn btn-primary" href="#"  id="add">添加学生</a> 
			<!-- <button class="btn btn-primary" data-toggle="modal" data-target="#myModal">点击我显示模态框</button> -->
			<div class="btn-group">
				<button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
					查看接口数据 <span class="caret"></span>
				</button>
				<ul class="dropdown-menu">
					<li><a href="${pageContext.request.contextPath }/stu/stulistxml?current=1&rowCount=10&sort[sender]=asc&searchPhrase=&id=b0df282a-0d67-40e5-8558-c9e93b7befed" target="_blank">XML</a></li>
					<li><a href="${pageContext.request.contextPath }/stu/getStuInfo?stuId=1&sort[sender]=asc&searchPhrase=&id=b0df282a-0d67-40e5-8558-c9e93b7befed" target="_blank">JSON</a></li>
				</ul>
			</div>
			<table id="grid-data" class="table table-condensed table-hover table-striped">
				<thead>
				<tr>
					<th data-column-id="stuId"  data-identifier="true" data-type="numeric">stuId</th>
					<th data-column-id="stuName">stuName</th>
					<th data-column-id="stuAge">stuAge</th>
					<th data-column-id="stuMajor" data-order="desc">stuMajor</th>
					<th data-column-id="commands" data-formatter="commands" data-sortable="false">Commands</th>
				</tr>
				<c:forEach items="${list}" var="list">
				<tr >
					<th data-column-id="stuId"  data-identifier="true" data-type="numeric">${list.stuId}</th>
					<th data-column-id="stuName">${list.stuName}</th>
					<th data-column-id="stuAge">${list.stuAge}</th>
					<th data-column-id="stuMajor" data-order="desc">${list.stuMajor}</th>
					<th data-column-id="commands" data-formatter="commands" data-sortable="true">
					<a  class="btn btn-primary btn-xs" href="#" data-toggle="modal"  data-target="#stumodal" onclick="editStudent(${list.stuId})">编辑</a>
					<a class="btn btn-primary btn-xs" href="#">删除</a></th>
				</tr>
			 	</c:forEach>
				</thead>
			</table>
		</div>
	</div>
</div>
<script type="text/javascript">

function editStudent(stuId) {
	alert(stuId);
	$.ajax({
		type:"get",
		url:"<%=basePath%>stu/getStuInfo",
		data:{"stuId":stuId},
		success:function(data) {
			alert(data.stuId);//这个id值要和请求方法的命名方式一样
			$("#stuId2").val(data.stuId);
			$("#stuName2").val(data.stuName);
			$("#stuAge2").val(data.stuAge);
			$("#stuMajor2").val(data.stuMajor);
		}
	});
}


	$(document).ready(function(){
	    $("#add").click(function(){
	        $(".addmodal").modal();
	    });
	});
	
	/* $(document).ready(function(){
	    $("#update").click(function(){
	        $(".stumodal").modal();
	    });
	}); */

    $(document).ready(function(){
        var grid = $("#grid-data").bootgrid({
            ajax:true,
            post: function ()
            {
                return {
                    id: "b0df282a-0d67-40e5-8558-c9e93b7befed"
                };
                alert(id);
            },
            url:"<%=basePath%>stu/stuList?current=1&rowCount=10&sort[sender]=asc&searchPhrase=&id=b0df282a-0d67-40e5-8558-c9e93b7befed",
            formatters: {
                "commands": function(column, row)
                {
                    return "<button type=\"button\" class=\"btn btn-xs btn-default command-edit\" data-row-id=\"" + row.stuId + "\">编辑<span class=\"fa fa-pencil\"></span></button> " +
                        "<button type=\"button\" class=\"btn btn-xs btn-default command-delete\" data-row-id=\"" + row.stuId + "\">删除<span class=\"fa fa-trash-o\"></span></button>";
                }
            }
        }).on("loaded.rs.jquery.bootgrid", function()
		{
            grid.find(".command-edit").on("click", function(e)
            {
                $(".stumodal").modal();
                $.post("<%=basePath%>stu/getStuInfo",{stuId:$(this).data("row-id")},function(str){
                    $("#stuId2").val(str.stuId);
                    $("#stuName2").val(str.stuName);
                    $("#stuAge2").val(str.stuAge);
                    $("#stuMajor2").val(str.stuMajor);
                });
            }).end().find(".command-delete").on("click", function(e)
            {
                alert("You pressed delete on row: " + $(this).data("row-id"));
                $.post("<%=basePath%>stu/delStu",{stuId:$(this).data("row-id")},function(){
                    alert("删除成功");
                    $("#grid-data").bootgrid("reload");
                });
            });
        });
    });

	
    

</script>
<!-- id="stumodal" -->
<div class="modal fade" id="stumodal   tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
	<div class="modal-dialog modal-sm" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
				<h4 class="modal-title">update Stu</h4>
			</div>
			<form action="${pageContext.request.contextPath }/stu/updateStu" method="post">
				<div class="modal-body">
					<div class="form-group">
						<label for="stuId2">stuId</label>
						<input type="text" name="stuId" class="form-control" id="stuId2" readonly="true">
					</div>
					<div class="form-group">
						<label for="stuName2">stuName</label>
						<input type="text" name="stuName" class="form-control" id="stuName2">
					</div>
					<div class="form-group">
						<label for="stuAge2">stuAge</label>
						<input type="text" name="stuAge" class="form-control" id="stuAge2">
					</div>
					<div class="form-group">
						<label for="stuMajor2">stuMajor</label>
						<input type="text" name="stuMajor" class="form-control" id="stuMajor2">
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					<button type="submit" class="btn btn-primary">Save changes</button>
				</div>
			</form>
		</div>
	</div>
</div>

<div class="modal fade addmodal"  tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel">
	<div class="modal-dialog modal-sm">
		<div class="modal-content"  >
			<div class="modal-header" >
				<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
				<h4 class="modal-title">add stu</h4>
			</div>
			<form action="${pageContext.request.contextPath }/stu/addStu" method="post">
				<div class="modal-body"  >
					<div class="form-group">
						<label for="stuName1">stuName</label>
						<input type="text" name="stuName" class="form-control" id="stuName1">
					</div>
					<div class="form-group">
						<label for="stuAge1">stuAge</label>
						<input type="text" name="stuAge" class="form-control" id="stuAge1">
					</div>
					<div class="form-group">
						<label for="stuMajor1">stuMajor</label>
						<input type="text" name="stuMajor" class="form-control" id="stuMajor1">
					</div>
					<div class="form-group">
						<input type="hidden" name="Id" class="form-control" id="Id">
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					<button type="submit" class="btn btn-primary">Add Stu</button>
				</div>
			</form>
		</div>
	</div>
</div>
</body>
</html>