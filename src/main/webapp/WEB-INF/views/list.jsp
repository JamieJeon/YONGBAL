<%--
  Created by IntelliJ IDEA.
  User: jeonjaebum
  Date: 2017. 12. 10.
  Time: 오후 2:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>List</title>
</head>
<body>

<p>LIST</p>

<ul>
    <c:forEach items="${list}" var="list">
        <li> TITLE : ${list.title} / CONTENT : ${list.content}</li>
    </c:forEach>
</ul>

</body>
</html>
