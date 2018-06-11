<%--
  Created by IntelliJ IDEA.
  User: noaha
  Date: 2018/5/17
  Time: 23:12
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

    <title>用户注册</title>

    <!-- Bootstrap core CSS -->
    <link href="${appPath}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="../../assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="/static/css/signup.css" rel="stylesheet">

</head>
<body>

<div class="container">

    <form class="form-signup" action="/login/btnsignup" method="post">
        <h2 class="form-signup-heading">用户注册</h2>
        <label for="name" class="sr-only">用户名</label>
        <input type="text" id="name" class="form-control" placeholder="请输入用户名" required autofocus name="name">
        <label for="password" class="sr-only">Password</label>
        <input type="password" id="password" class="form-control" placeholder="请输入密码" required name="password">
        <button class="btn btn-lg btn-primary btn-block" type="submit">确认注册</button>
        <a href="/login/login" class="btn btn-lg btn-default btn-block" role="button" >返回登录</a>
    </form>

</div> <!-- /container -->
<%--
用户表单：<a href="<%=appPath%>/user/list" class="btn btn-primary btn-lg active" role="button">点击前往</a>
--%>

<script src="${appPath}/static/js/jquery-3.3.1.min.js"></script>
<script src="${appPath}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"></script>



</body>
<script>
    //对应后台返回的提示
    if ('${result}' != '') {
        if ('${result}' == 0) {
            alert('注册成功，将跳转到登录页面！')
            location.href = '/login/login'
        }
        if ('${result}' == 1) {
            alert('该账号已有人注册！')
        }
    }
</script>
</html>