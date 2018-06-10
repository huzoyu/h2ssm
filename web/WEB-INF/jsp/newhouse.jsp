<%--
  Created by IntelliJ IDEA.
  User: noaha
  Date: 2018/5/29
  Time: 5:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="${appPath}/static/bootstrap-3.3.7-dist/docs/favicon.ico">

    <title>添加房源</title>
</head>
<body>
<jsp:include page="navbar.jsp"></jsp:include>

<div class="row clearfix">
    <div class="col-md-12 column">
        <div class="page-header">
            <h1>添加房源信息</h1>
        </div>
    </div>
</div>

<form class="form-horizontal" method="post" action="/house/addhouse">
    <div class="form-group">
        <label for="inputName" class="col-sm-2 control-label">房源名称</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="inputName" name="name" placeholder="房源名称">
        </div>
    </div>
    <div class="form-group">
        <label for="inputCity" class="col-sm-2 control-label">所在城市</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="inputCity" name="city" placeholder="所在城市，如“北京”、“成都”。">
        </div>
    </div>
    <div class="form-group">
        <label for="inputCommunity" class="col-sm-2 control-label">所在小区</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="inputCommunity" name="community" placeholder="所在小区，如“安翔南里”。">
        </div>
    </div>
    <div class="form-group">
        <label for="inputRoom" class="col-sm-2 control-label">单位楼室</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="inputRoom" name="room" placeholder="单位楼室，如“1单元101室”。">
        </div>
    </div>
    <div class="form-group">
        <label for="inputArea" class="col-sm-2 control-label">居住面积</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="inputArea" name="area" placeholder="居住面积，单位平方米。">
        </div>
    </div>
    <div class="form-group">
        <label for="inputType" class="col-sm-2 control-label">房源类型</label>
        <div class="col-sm-10">
            <select class="form-control" id="inputType" name="type">
                <option>单间</option>
                <option>一室一厅</option>
                <option>两室一厅</option>
                <option>三室一厅</option>
                <option>三室两厅</option>
                <option>四室两厅</option>
            </select>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default">确认添加</button>
            <a href="/home/rate" role="button" class="btn btn-primary">返回首页</a>
        </div>
    </div>
</form>

</body>
</html>
