<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
    <body>
        <h2> Coffe Advisor </h2>
    <form method="POST" action="controller">
        Imie: <input type="text" name ="name" size="20"><br/>
         Nazwisko: <input type="text" name ="surname" size="20"><br/>
          Telefon: <input type="text" name ="phone" size="20"><br/>
           Adres: <input type="text" name ="address" size="20"><br/>
           Komorka: <input type="text" name="komorka" size="15"><br/>
           Zawod: <input type="text" name="zawod" size="25"><br/>
           Hobby: <input type="text" name="hobby" size="25"><br/>
           <input type ="submit" name="Zapisz" value="Enter"/>
    </form>
    
    <br/>
    <c:forEach var="type" items="${customers}">
        
        <c:out value="${type.name}"/>
        <c:out value="${type.surname}"/> 
       <c:out value="${type.phone}"/>
        <c:out value="${type.address}"/>
       <c:out value="${type.komorka}"/>
       <c:out value="${type.narodowosc}"/>
            <br/>  
    </c:forEach>
            <h2>Otrzymany atrybut: ${komorka1}</h2> 
            <h2>Zawod klienta: ${zawod1}</h2> 
            <h2>Ulubione zajecie: ${hobby1}</h2>
    </body>
   
</html>