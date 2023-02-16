<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2023/2/16
  Time: 12:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--导入jstl标签库 核心库和格式化--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"  %>


<html>
<head>
    <title>Title</title>
</head>
<body>
<h2> show...</h2>
单个日期显示 ${mydate}
<br><br><br>
<h2>学生集合</h2>
<table width="800px" border="1">
    <tr>
        <th>姓名</th>
        <th>生日</th>
    </tr>
    <c:forEach items="${list}" var="stu">
        <tr>
            <td>${stu.name}</td>
            <td>${stu.birthDay}---<fmt:formatDate value="${stu.birthDay}" pattern="yyyy-MM-dd"/> </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
