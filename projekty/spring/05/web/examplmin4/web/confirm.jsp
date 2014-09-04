<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css"/>
        <title>ALL YOUR BASE ARE BELONG TO US NOW</title>
    </head>
    <body><div>
            <h1>YOUR BASE DATA:</h1>
            <table>
                <tr>
                    <td>YOUR BASE NAME</td>
                    <td>${param.baseName}</td>
                </tr>
                <tr>
                    <td>YOUR BASE LOCATION</td>
                    <td>${param.baseLocation}</td>
                </tr>
                <tr>
                    <td>YOUR BASE PASSWORD</td>
                    <%--                <td>${param.basePassword}</td>--%>
                    <td>
                        <c:forEach begin="1" end="${fn:length(param.basePassword)}">
                            &bull;
                        </c:forEach>
                    </td>
                </tr>
                <tr>
                    <td>IS YOUR BASE PROTECTED?</td>
                    <td>
                        <c:choose>
                            <c:when test="${param.baseProtected == 'NO'}">NOT REALLY</c:when>
                            <c:when test="${param.baseProtected == 'YES'}">YEP!</c:when>
                            <c:when test="${param.baseProtected == 'DUNNO'}">NOT SURE</c:when> 
                        </c:choose>
                    </td>
                </tr>
                <tr>
                    <td>WILL YOU SURRENDER?</td>
                    <td>${param.willSurrender == 'YES' ? 'YES' : 'YES! YES! YES!'}</td>
                </tr>
            </table>
            <form method="POST" action="confirmed.jsp">
                <input type="submit" value="Potwierdzam"/>
            </form>
        </div></body>
</html>
