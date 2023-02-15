<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2023/2/15
  Time: 19:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%--    导入jquery--%>
    <script src="js/jquery-3.3.1.js"></script>
</head>
<body>
<br><br><br>
<a href="javascript:showStu()">访问服务器返回学生集合</a><br>
<div id="mydiv">等待服务器返回数据</div>


<script type="text/javascript">
    <%--    使用jquery封装的ajax()方法--%>
    function showStu(){
        $.ajax({
            url:"${pageContext.request.contextPath}/list.action",
            type:"get",
            dataType:"json",
            success:function (stuList){
                var s="";
                $.each(stuList,function (i,stu){
                    s+=stu.name+"----"+stu.age+"<br>";
                });
                // 回显数据
                $("#mydiv").html(s);
            }
        });
    }
</script>

</body>
</html>
