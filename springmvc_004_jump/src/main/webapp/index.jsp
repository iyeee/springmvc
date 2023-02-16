<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2023/2/15
  Time: 20:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/one.action">1.请求转发页面(默认)</a><br><br>
<a href="${pageContext.request.contextPath}/two.action">2.请求转发action</a><br><br>
<a href="${pageContext.request.contextPath}/three.action">3.重定向页面</a><br><br>
<a href="${pageContext.request.contextPath}/four.action">4.重定向action</a><br><br>
<a href="${pageContext.request.contextPath}/five.action">5.随便跳页面</a><br><br>

<br><br><br>

<a href="${pageContext.request.contextPath}/data.action?name=zar">访问服务器，进行数据携带跳转</a>

<form action="${pageContext.request.contextPath}/mydate.action">
    日期：<input type="date" name="mydate"><br>
        <input type="submit" value="提交">
</form>

<a href="${pageContext.request.contextPath}/list.action">显示集合中对象的日期成员</a>

</body>
</html>
