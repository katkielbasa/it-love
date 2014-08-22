<%@ include file="./includes/common.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
    <body>
        <h1>Dodaj wpis do książki adresowej:</h1>
        <form:form modelAttribute="entry">
            <table>
                <tr>
                    <td>
                        Kategoria:
                    </td>
                    <td>
                        <form:select path="category" items="${categories}"/>

                    </td>
                </tr>

                <tr>
                    <td>
                        <input type="submit" value="Zapisz" colspan="2" />
                    </td>
                </tr>
            </table>
            <table border="1">
                
                <tr>
                    <td>Wielkosc:</td>
                    <td>
                        <form:input path="komputer.wielkosc" />
                    </td>
                </tr>

                <tr>
                    <td>Nazwa:</td>
                    <td>
                        <form:input path="komputer.nazwa" />
                    </td>
                </tr>

            </table>
            <hr/>
        </form:form>
    </body>
</html>