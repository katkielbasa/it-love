<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <body>
        <h2>Coffee Advisor</h2>
        <form method="POST" action="controller">
            Imie: <input type="text"name="name" size="20"> <br/>
            Nazwisko:<input type="text"name="surname" size="20"> <br/> 
            Adres:<input type="text"name="address" size="20"> <br/>
            Telefon:<input type="text"name="phone" size="20"> <br/>
            Numer_Dowodu:<input type="text" name="ID" size="20"> <br/>
            NIP:<input type="text" name="NIP" size="20"> <br/>
            Zawod:<input type="text" name="job" size="20"> <br/>
            <input type="submit" name="Zapisz"/>
        </form>

    <c:forEach var="type" items="${customers}">
        <c:out value = "${type.name}"/>
        <c:out value = "${type.surname}"/>
        <c:out value = "${type.address}"/>
        <c:out value = "${type.phone}"/>      
        <c:out value = "${type.ID}"/>
        <c:out value = "${type.NIP}"/>
        <c:out value = "${type.job}"/>
        <br/>
    </c:forEach>
    Otrzymany atrybut:  ${Dokument1} <br/>
    Otrzymany atrybut:  ${Dokument2} <br/>
    Otrzymany atrybut:  ${Dokument3} <br/>
    Otrzymany atrybut:  ${Dokument4} <br/>
    Otrzymany atrybut:  ${Dokument5} <br/>
    Otrzymany atrybut:  ${Dokument6} <br/>
    Otrzymany atrybut:  ${Dokument7} <br/>
</body>
</html>