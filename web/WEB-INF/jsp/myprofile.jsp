<%--
  Created by IntelliJ IDEA.
  User: noaha
  Date: 2018/6/4
  Time: 1:39
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

    <title>我的资料</title>
</head>
<body align="center">
<jsp:include page="navbar.jsp"></jsp:include>

<div class="row clearfix">
    <div class="col-md-12 column">
        <div class="page-header">
            <h1>我的资料</h1>
        </div>
    </div>
</div>

<div class="container">
    <form class="form-horizontal" method="post" action="/user/updateuser">
        <div class="form-group">
            <label for="inputId" class="col-sm-2 control-label">用户id</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputId" name="id" placeholder="${user.id}" disabled="true">
            </div>
        </div>
        <div class="form-group">
            <label for="inputName" class="col-sm-2 control-label">密码</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputName" name="name" placeholder="${user.name}" disabled="true">
            </div>
        </div>
        <div class="form-group">
            <label for="inputPassword" class="col-sm-2 control-label">用户名</label>
            <div class="col-sm-10">
                <input type="password" class="form-control" id="inputPassword" name="password" placeholder="${user.password}" >
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">修改信息</button>
                <a href="/home/rate" role="button" class="btn btn-primary">返回首页</a>
            </div>
        </div>
    </form>

</div>


</body>
</html>
