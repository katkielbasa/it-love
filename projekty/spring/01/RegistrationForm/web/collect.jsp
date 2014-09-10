

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Baza użytkowników</title>
        <link href="mystyle.css" rel="stylesheet"/>
    </head>
    <body>
        <h1>Dane nowego użytkownika</h1>
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
                <td>Adres email:</td>
                <td>${param.emailAddress}</td>
            </tr>
            <tr>
                <td>Płeć:</td>
                <td>${param.sex}</td>
            </tr>
            <tr>
                <td>Województwo:</td>
                <td>${param.voivodeship}</td>
            </tr>

        </table>
    </body>
</html>
