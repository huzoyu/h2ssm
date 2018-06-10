
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: noaha
  Date: 2018/5/29
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String appPath = request.getContextPath(); %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="${appPath}/static/bootstrap-3.3.7-dist/docs/favicon.ico">

    <title>已租房源</title>

    <!-- Bootstrap core CSS -->
    <link href="${appPath}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="${appPath}/static/bootstrap-3.3.7-dist/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${appPath}/static/css/navbar-fixed-top.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="${appPath}/static/bootstrap-3.3.7-dist/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="${appPath}/static/bootstrap-3.3.7-dist/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

<jsp:include page="navbar.jsp"></jsp:include>

<%-- 内容 --%>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    已租房源列表
                </h1>
            </div>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>列表 <small>显示当前列表信息</small></h1>
            </div>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>房源名称</th>
                    <th>所在城市</th>
                    <th>所在小区</th>
                    <th>单元楼室</th>
                    <th>房源面积</th>
                    <th>房源类型</th>
                    <th colspan="6"></th>
                </tr>
                </thead>
                <tbody>

                <c:forEach var="house" items="${requestScope.get('list')}" varStatus="status">
                    <tr>
                        <td>${house.name}</td>
                        <td>${house.city}</td>
                        <td>${house.community}</td>
                        <td>${house.room}</td>
                        <td>${house.area}</td>
                        <td>${house.type}</td>
                        <td><a role="button" class="btn btn-primary" href="/house/checkout/${house.id}">退租管理</a></td>
                        <td><a role="button" class="btn btn-primary" href="/agreement/history/${house.id}">历史合同</a></td>
                        <td><a role="button" class="btn btn-primary" href="/agreement/citytrend/${house.id}">同城租金趋势</a></td>
                        <td><a role="button" class="btn btn-primary" href="/agreement/communitytrend/${house.id}">同小区趋势</a></td>
                        <td><a role="button" class="btn btn-danger" href="/house/updatehouse/${house.id}">编辑房源</a></td>
                        <td><a role="button" class="btn btn-danger" href="/house/delete/${house.id}">删除房源</a></td>
                    </tr>
                </c:forEach>


                </tbody>
            </table>
        </div>
    </div>
</div>


<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->

</body>
</html>
