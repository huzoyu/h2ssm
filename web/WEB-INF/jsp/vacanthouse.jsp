<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: noaha
  Date: 2018/5/29
  Time: 5:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>待租房源</title>
</head>
<body>
<jsp:include page="navbar.jsp"></jsp:include>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    待租房源列表
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
                        <td><a role="button" class="btn btn-primary" href="/agreement/newagreement/${house.id}">添加合同</a></td>
                        <td><a role="button" class="btn btn-primary" href="/house/checkin/${house.id}">登记入住</a></td>
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
</body>
</html>
