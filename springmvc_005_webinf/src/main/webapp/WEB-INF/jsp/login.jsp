<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2023/2/16
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<br><br><br>
<h2>登录</h2>
<form action="${pageContext.request.contextPath}/login">
    姓名：<input name="name"><br>
    密码:<input name="pwd"><br>
    <input type="submit" value="登录">
</form><br><br>
${msg}
</body>
</html>
