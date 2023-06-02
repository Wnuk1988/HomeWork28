<%--
  Created by IntelliJ IDEA.
  User: Михаил
  Date: 02.06.2023
  Time: 13:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Save-request</title>
</head>
<body>
    <c:out value="«Заявка успешно сохранена:"/>
    <br>
    <c:out value="Name: ${param.userName}"/>
    <br>
    <c:out value="Surname: ${param.userSurName}"/>
    <br>
    <c:out value="Age: ${param.userAge}"/>
    <br>
    <c:out value="Genger: ${param.gender}"/>
    <br>
    <c:out value="Country: ${param.country}"/>
</body>
</html>
