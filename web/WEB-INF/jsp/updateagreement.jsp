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

    <title>更新合同信息</title>
</head>
<body align="center">
<jsp:include page="navbar.jsp"></jsp:include>

<div class="row clearfix">
    <div class="col-md-12 column">
        <div class="page-header">
            <h1>修改合同信息</h1>
        </div>
    </div>
</div>

<div class="container">
    <form class="form-horizontal" method="post" action="/agreement/update" style="max-width: 500px;margin:  0 auto;">
        <div class="form-group">
            <label for="inputId" class="col-sm-2 control-label">合同编号</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputId" name="id" placeholder="${agreement.id}" required>
            </div>
        </div>
        <div class="form-group">
            <label for="inputName" class="col-sm-2 control-label">租客姓名</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="inputName" name="tenantName" placeholder="${agreement.tenantName}" required>
            </div>
        </div>
        <div class="form-group">
            <label for="inputPhone" class="col-sm-2 control-label">联系方式</label>
            <div class="col-sm-10">
                <input type="number" class="form-control" id="inputPhone" name="tenantPhone" placeholder="${agreement.tenantPhone}" required>
            </div>
        </div>
        <div class="form-group">
            <label for="inputDate" class="col-sm-2 control-label">开始日期</label>
            <div class="col-sm-10">
                <input type="text" onfocus="(this.type='date')" class="form-control" id="inputDate" name="startDate" placeholder="${agreement.startDate}" required>
            </div>
        </div>
        <div class="form-group">
            <label for="inputPeriod" class="col-sm-2 control-label">租用月数</label>
            <div class="col-sm-10">
                <input type="number" class="form-control" id="inputPeriod" name="period" placeholder="${agreement.period}" required>
            </div>
        </div>
        <div class="form-group">
            <label for="inputDeposit" class="col-sm-2 control-label">合同押金</label>
            <div class="col-sm-10">
                <input type="number" class="form-control" id="inputDeposit" name="deposit" placeholder="${agreement.deposit}" required>
            </div>
        </div>
        <div class="form-group">
            <label for="inputRent" class="col-sm-2 control-label">每月租金</label>
            <div class="col-sm-10">
                <input type="number" class="form-control" id="inputRent" name="rent" placeholder="${agreement.rent}" required>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">确认修改</button>
                <a href="/home/rate" role="button" class="btn btn-primary">返回首页</a>
            </div>
        </div>
    </form>

</div>


</body>
</html>
