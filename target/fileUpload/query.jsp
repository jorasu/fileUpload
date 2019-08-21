<%--
  Created by IntelliJ IDEA.
  User: jora
  Date: 2019/8/15
  Time: 14:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>查询</title>
</head>
<body>
    <table>
        <tr>
            <th>商品ID</th>
            <th>商品名称</th>
            <th>订单状态</th>
            <th>区域</th>
            <th>商品价格</th>
            <th>商品数量</th>
            <th>订单日期</th>
            <th>文件</th>
        </tr>

        <c:forEach var="g" items="${goods}">
            <tr>
                <td>${g.id}</td>
                <td>${g.goodsName}</td>
                <td>
                    <c:if test="${g.billStatus eq 0}">待处理</c:if>
                    <c:if test="${g.billStatus eq 1}">处理中</c:if>
                    <c:if test="${g.billStatus eq 2}">已处理</c:if>
                </td>
                <td>
                    <c:if test="${g.goodsDistrict eq 1}">朝阳</c:if>
                    <c:if test="${g.goodsDistrict eq 2}">海淀</c:if>
                    <c:if test="${g.goodsDistrict eq 3}">丰台</c:if>
                    <c:if test="${g.goodsDistrict eq 4}">西城</c:if>
                    <c:if test="${g.goodsDistrict eq 5}">昌平</c:if>
                </td>
                <td>${g.goodsPrice}</td>
                <td>${g.goodsCount}</td>
                <td>${g.creationTime}</td>
                <td>
                    <a href="${g.file}">
                        <img src="${g.file}" alt="pic" width="50px" height="50px"/>
                    </a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
