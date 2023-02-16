<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2023/2/15
  Time: 18:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>main...</h2>

<%--request.setAttribute("requestUsers",users);--%>
<%--session.setAttribute("sessionUsers",users);--%>
<%--model.addAttribute("modelUsers",users);--%>
<%--map.put("mapUsers",users);--%>
<%--modelMap.addAttribute("modelMapUsers",users);--%>

requestUsers: ${requestUsers}<br>
sessionUsers: ${sessionUsers}<br>
modelUsersUsers: ${modelUsers}<br>
mapUsersUsers: ${mapUsers}<br>
${param.name}
</body>
</html>
