<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="cp" value="${pageContext.request.servletContext.contextPath}" scope="request" />

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring 4 Web MVC via Annotations, persistence with Hibernate and MySQL server</title>
        <link rel="stylesheet" type="text/css" href="{cp}/resources/css/site.css" />
        <script src="${cp}/resources/js/js.js"></script>
    </head>
    <body>
        <!-- <h4>Spring 4 Web MVC via Annotations</h4>
        Spring says: <span class="blue">${msg}</span> -->
        
        
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
