<%--
  Created by IntelliJ IDEA.
  User: jora
  Date: 2019/8/15
  Time: 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
    <form action="register.do" method="post" enctype="multipart/form-data">
        <table>
            <tr>
                <th>商品名称</th>
                <td><input type="text" id="goodsName" name="goodsName"></td>
            </tr>

            <tr>
                <th>订单状态</th>
                <td>
                    <select name="billStatus" >
                        <option value="-1">请选择：</option>
                        <option value="0">待处理</option>
                        <option value="1">处理中</option>
                        <option value="2">已处理</option>
                    </select>
                </td>
            </tr>

            <tr>
                <th>区域</th>
                <td>
                    <select name="goodsDistrict">
                        <option value="-1">请选择：</option>
                        <option value="0">朝阳</option>
                        <option value="1">海淀</option>
                        <option value="2">丰台</option>
                        <option value="2">西城</option>
                        <option value="2">昌平</option>
                    </select>
                </td>
            </tr>
            <tr>
                <th>商品价格</th>
                <td><input type="text" id="goodsPrice" name="goodsPrice" /></td>
            </tr>

            <tr>
                <th>商品数量</th>
                <td><input type="text" id="goodsCount" name="goodsCount" /></td>
            </tr>

            <tr>
                <th>订单日期</th>
                <td><input type="date" id="creationTime" name="creationTime" /></td>
            </tr>

            <tr>
                <th>文件</th>
                <td><input type="file" id="fileInfo" name="fileInfo" /></td>
            </tr>

            <tr>
                <input type="submit" value="提交"/>
            </tr>

        </table>
    </form>
</body>
</html>
