<%-- 
    Document   : my cards
    Created on : Jul 18, 2016, 11:55:02 AM
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="cp" value="${pageContext.request.servletContext.contextPath}" scope="request" />

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My credit cards list</title>
        <link rel="stylesheet" type="text/css" href="{cp}/resources/css/styles2.css" />
        <script src="${cp}/resources/js/js.js"></script>
    </head>
    <body>
        <table border="1">
            <th>My Credit Cards</th>
            <c:forEach items="${msg1}" var="card">
            <tr>
                <td><a>${card.pan}</a></td>
            </tr>
            </c:forEach>
        </table>
    </body>
</html>
