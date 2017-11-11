<%--
  Created by IntelliJ IDEA.
  User: developer
  Date: 2017/11/8
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>PERSON</title>
    <%--http://localhost:8080/ssm/person.html?id=2--%>
</head>
<body>

<table border="1" width="500" height="100" cellspacing="1" cellpadding="10">
    <tr align = "center">
        <td>ID</td>
        <td>姓名</td>
        <td>地址</td>
        <td>简介</td>
    </tr>

    <tr align = "center">
        <td>${personInfo.id}</td>
        <td>${personInfo.name}</td>
        <td>${personInfo.address}</td>
        <td>${personInfo.content}</td>
    </tr>

</table>
</body>
</html>
