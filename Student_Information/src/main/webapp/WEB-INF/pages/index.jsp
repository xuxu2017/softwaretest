<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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

	<link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">

	<link rel="stylesheet" href="/css/jquery.bootgrid.min.css">

	<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

	<script src="/js/jquery.bootgrid.min.js"></script>

	<script type="text/javascript" src="/js/bootstrap-datetimepicker.min.js"></script>

	<link rel="stylesheet" href="/css/bootstrap-datetimepicker.min.css" type="text/css"></link>
	<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>

<div class="container">

		<table id="grid-data" class="table table-condensed table-hover table-striped">
               <thead>
	               <tr>
	                   <th data-column-id="stuId"  align="center" data-type="numeric">stuId</th>
	                   <th data-column-id="stuName"  align="center">stuName</th>
	                   <th data-column-id="stuAge" align="center">stuAge</th>
	                   <th data-column-id="stuMajor"  align="center">stuMajor</th>
	                   <th data-column-id="commands" data-formatter="commands" align="center" data-sortable="false">Commands</th>
	               </tr>
               </thead>
               <tbody>

               </tbody>
        </table>
	
	<script type="text/javascript">
    $(document).ready(function () {
        var grid = $("#grid-data").bootgrid({
            ajax: true,
            url: "<%=basePath%>stu/stuList?current=1&rowCount=10&sort[sender]=asc&searchPhrase=&id=b0df282a-0d67-40e5-8558-c9e93b7befed",
            formatters: {
                "commands": function (column, row) {
                    return "<button type=\"button\" class=\"btn btn-info btn-xs command-edit\" data-row-id=\"" + row.stuId + "\">编辑<span class=\"fa fa-pencil\"></span></button> " +
                        "<button type=\"button\" class=\"btn btn-danger btn-xs command-delete\" data-row-id=\"" + row.stuId + "\">删除<span class=\"fa fa-trash-o\"></span></button>";
                }
            }
        }).on("loaded.rs.jquery.bootgrid", function (e) {
            grid.find(".command-edit").on("click", function (e) {
                $(".stumodal").modal();
                $.post("<%=basePath%>stu/getStuInfo", {stuId: $(this).data("row-id")}, function (str) {
                    $("#stuId2").val(str.stuId);
                    $("#stuName2").val(str.stuName);
                    $("#stuAge2").val(str.stuAge);
                    $("#stuMajor2").val(str.stuMajor);
                });
            }).end().find(".command-delete").on("click", function (e) {
                //alert("You pressed delete on row: " + $(this).data("row-id"));
                var r = confirm("你确定要删除编号为 " + $(this).data("row-id") + " 的学生信息吗?");
                if (r) {
                    $.post("/stu/delStu", {stuId: $(this).data("row-id")}, function (str) {
                        if (str > 0) {
                            alert("删除成功");
                            $("#grid-data").bootgrid("reload");
                        } else {
                            alert("删除失败");
                            $("#grid-data").bootgrid("reload");
                        }
                    });
                }
            });
        });
    });
    </script>
</body>

</html>