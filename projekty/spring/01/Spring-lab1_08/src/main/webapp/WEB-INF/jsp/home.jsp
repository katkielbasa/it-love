<%@ include file="./includes/common.jsp" %>

<html>
    <body>
        <h1>Home Page</h1>
        <ul>
            <li>
                <a href="<c:url value="/addEntry.do" />" >Dodaj wpis</a>
            </li>
            <li>
                <a href="<c:url value="/generateReport.do" />" >Generuj raport PDF</a>
            </li>
        </ul>
    </body>
</html>