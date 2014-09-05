<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/style.css" rel="stylesheet"/>
        <title>Zatwierdzenie formularza</title>
    </head>
    <body><div>
            <h1>Potwierdzenie danych</h1>
            <table>
                <tr>
                    <td>Imię: </td>
                    <td>${param.firstName}</td>
                </tr>
                <tr>
                    <td>Nazwisko: </td>
                    <td>${param.lastName}</td>
                </tr>
                <tr>
                    <td>Adres e-mail:</td>
                    <td>${param.email}</td>
                </tr>
                <tr>
                    <td>Województwo</td>
                    <td>
                    <c:choose>
                        <c:when test="${param.region == 'ds'}">
                            Dolnośląskie
                        </c:when>
                        <c:when test="${param.region == 'mz'}">
                            Mazowieckie
                        </c:when>
                        <c:when test="${param.region == 'wlkp'}">
                            Wielkopolskie
                        </c:when>
                    </c:choose>
                    </td>
                </tr>
                <tr>
                    <td>Płeć</td>
                    <td>${param.sex == 'male' ? 'Mężczyzna' : 'Kobieta'}</td>
                </tr>
            </table>
            <form method="POST" action="confirmed.jsp">
                <input type="submit" value="Potwierdzam"/>
            </form>
        </div></body>
</html>
