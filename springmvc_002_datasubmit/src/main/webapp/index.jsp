<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2023/2/15
  Time: 16:30
  To change this template use File | Settings | File Templates.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<br><br><br>
<h2>测试不同请求提交方式</h2>
<form action="${pageContext.request.contextPath}/req.action" method="get">
    <input type="submit" value="提交">
</form>


<h2>1.单个数据提交</h2>
    <form action="${pageContext.request.contextPath}/one.action">
        姓名：<input name="myname"><br>
        年龄：<input name="age"><br>
        <input type="submit" value="提交">
    </form>


<%--public class Users {--%>
<%--private String name;--%>
<%--private Integer age;--%>
<h2>2.对象封装提交</h2>
<form action="${pageContext.request.contextPath}/two.action" method="post">
    姓名：<input name="name"><br>
    年龄：<input name="age"><br>
    <input type="submit" value="提交">
</form>
<h2>3.动态占位符提交</h2>
<br>
    <a href="${pageContext.request.contextPath}/three/张三/22.action">动态提交</a>
</body>

<h2>4.参数名称不一致</h2>
<br>
<form action="${pageContext.request.contextPath}/four.action" method="post">
    姓名：<input name="name"><br>
    年龄：<input name="age"><br>
    <input type="submit" value="提交">
</form>

<h2>5.手工提取</h2>
<br>
<form action="${pageContext.request.contextPath}/five.action" method="post">
    姓名：<input name="name"><br>
    年龄：<input name="age"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
