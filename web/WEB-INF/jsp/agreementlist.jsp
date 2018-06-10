<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: noaha
  Date: 2018/6/4
  Time: 0:21
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

    <title>历史合同</title>
</head>
<body align="center">
<jsp:include page="navbar.jsp"></jsp:include>

<div class="row clearfix">
    <div class="col-md-12 column">
        <div class="page-header">
            <h1>历史合同信息</h1>
        </div>
    </div>
</div>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>租客姓名</th>
                    <th>租客联系方式</th>
                    <th>合同生效日期</th>
                    <th>合同有效期</th>
                    <th>约定押金</th>
                    <th>平均月租金</th>
                    <th colspan="2"></th>
                </tr>
                </thead>
                <tbody>

                <c:forEach var="agreement" items="${requestScope.get('list')}" varStatus="status">
                    <tr>
                        <td>${agreement.tenantName}</td>
                        <td>${agreement.tenantPhone}</td>
                        <td>${agreement.startDate}</td>
                        <td>${agreement.period}</td>
                        <td>${agreement.deposit}</td>
                        <td>${agreement.rent}</td>
                        <td><a role="button" class="btn btn-primary" href="/agreement/updateagreement/${agreement.id}">编辑合同</a></td>
                        <td><a role="button" class="btn btn-primary" href="/agreement/delete/${agreement.id}">删除合同</a></td>

                    </tr>
                </c:forEach>


                </tbody>
            </table>
        </div>
    </div>

</div>


</body>
</html>
