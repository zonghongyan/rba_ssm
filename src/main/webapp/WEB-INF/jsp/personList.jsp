<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  Person: developer
  Date: 2017/11/8
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>PERSONS</title>
    <%--http://localhost:8080/ssm/personlist.html?name=tomcat--%>
</head>
<body>

<table border="1" width="500" height="100" cellspacing="1" cellpadding="10">
    <tr align = "center">
        <td>ID</td>
        <td>姓名</td>
        <td>地址</td>
        <td>简介</td>
    </tr>

    <c:forEach items="${personlist}" var="person" varStatus="status">
        <tr align = "center">
            <td>
                ${status.index+1}
            </td>
            <td> ${person.name} </td>
            <td> ${person.address} </td>
            <td> ${person.content} </td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
