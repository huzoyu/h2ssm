<%--
  Created by IntelliJ IDEA.
  User: noaha
  Date: 2018/5/27
  Time: 3:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String appPath = request.getContextPath(); %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href=".${appPath}/static/bootstrap-3.3.7-dist/docs/favicon.ico">

    <title>用户登录</title>

    <!-- Bootstrap core CSS -->
    <link href="${appPath}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="../../assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${appPath}/static/css/login.css" rel="stylesheet">

</head>
<body>

<div class="container">

    <form class="form-signin" action="/login/logincheck" method="post">
        <h2 class="form-signin-heading">登录系统</h2>
        <label for="name" class="sr-only">用户名</label>
        <input type="text" id="name" class="form-control" placeholder="请输入用户名" required autofocus name="name">
        <label for="password" class="sr-only">Password</label>
        <input type="password" id="password" class="form-control" placeholder="请输入密码" required name="password">
        <div class="checkbox">
            <label>
                <input type="checkbox" value="remember-me"> 记住我
            </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
        <a href="/login/signup" class="btn btn-lg btn-default btn-block" role="button" >注册</a>
    </form>

</div> <!-- /container -->
<%--
用户表单：<a href="<%=appPath%>/user/list" class="btn btn-primary btn-lg active" role="button">点击前往</a>
--%>
<script src="${appPath}/static/js/jquery-3.3.1.min.js"></script>
<script src="${appPath}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"></script>



</body>
</html>