<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--Dla kropka-->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Potwierdzenie</title>
        <link href="style.css" rel="stylesheet"/>
    </head>
    <body>
        <h1>Potwierdzenie danych</h1>
        <table>
            <tr>
                <td>Imię:</td>
                <td>${param.firstName}</td>
            </tr>
            <tr>
                <td>Nazwisko:</td>
                <td>${param.lastName}</td>
            </tr>
            <tr>
                <td>Hasło:</td>
                <td>
                    <c:forEach begin="1" end="${fn:length(param.password)}">
                        &bull;
                    </c:forEach>
                </td>
            </tr>
            <tr>
                <td>Miasto:</td>
                <td>
                    <c:choose>
                        <c:when test="${param.city == 'pz'}">
                            Poznań
                        </c:when>
                        <c:when test="${param.city == 'wr'}">
                            Wrocław
                        </c:when>
                        <c:when test="${param.city == 'gd'}">
                            Gdańsk
                        </c:when>
                    </c:choose>
                </td>
            </tr>
            <tr>
                <td>Płeć:</td>
                <td>
                    ${param.sex}
                   <%-- ${param.sex == 'MALE' ? 'Mężczyzna' : 'Kobieta'} --%>
                </td>
            </tr>
        </table>
    </body>
</html>
