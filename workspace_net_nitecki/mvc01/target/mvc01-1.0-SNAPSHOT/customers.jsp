<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css" />
    </head>
    <body>

        <h1 class="ca">Coffee advisor</h1>
        <div class="divka">
            <form class="basic" method="POST" action="controller">
                <!-- jezeli wywolane przez POST - zostanie wywolana metoda 
                doPost, jezeli GET - metod doGet -->
                Imie: <input type="text" name="name" size="20"><br/>
                Nazwisko: <input type="text" name="surname" size="20"><br/>
                Adres: <input type="text" name="address" size="20"><br/>
                Telefon <input type="text" name="phone" size="20"><br/>
                Pesel <input type="text" name="pesel" size="20"><br/>
                <!-- submit = wysyla na serwer, button - nie robi nic!!! -->
                <input type="submit" name="Zapisz" value="Zapisz"/>
            </form>
        </div>
        <p class="divka">
            Imie ${name} <br/>
            Nazwisko ${surname} <br/>
            Adres ${address} <br/>
            phone ${phone} <br/>
            pesel ${pesel} <br/>z
        </p>
        <c:forEach var="type" items="${customers}">
            <ul class="ulista">
                <li>Imie: <c:out value="${type.name}" />
                    Nazwisko :<c:out value="${type.surname}" />
                    Adres: <c:out value="${type.address}" />
                    Telefon: <c:out value="${type.phone}" />
                    PESEL: <c:out value="${type.pesel}" />
                </li>
            </ul>
        </c:forEach>
        
    </body>
</html>