<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3><a href="index.html">Home</a></h3>
<hr>
<h2>Meals</h2>
<style>
    TD, TH {
        border-bottom: 1px solid;
    }
</style>
<table>
    <tr>
        <th>Date</th>
        <th>Description</th>
        <th>Calories</th>
    </tr>

    <jsp:useBean id="mealsExceed" scope="request" type="java.util.List"/>
    <c:forEach items="${mealsExceed}" var="meal">
        <c:choose>
            <c:when test="${meal.excess}">
                <tr style="color:red">
                    <td>${meal.dateTime}</td>
                    <td>${meal.description}</td>
                    <td>${meal.calories}</td>
                </tr>
            </c:when>
            <c:otherwise>
                <tr style="color:green">
                    <td>${meal.dateTime}</td>
                    <td>${meal.description}</td>
                    <td>${meal.calories}</td>
                </tr>
        </c:otherwise>
        </c:choose>

    </c:forEach>

</table>
</body>
</html>
