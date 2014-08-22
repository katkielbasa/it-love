<%@ include file="./includes/common.jsp" %>
<!--
author: mbartyzel
created: 2008-08-18 11:46:39
-->
<html>
<body>
	<h1>Home Page</h1>
	<ul>
		<li>
			<a href="<c:url value="/addEntry.do" />" >Dodaj wpis</a>
		</li>
                
                <li>
			<a href="<c:url value="/addEntry2.do" />" >Dodaj wpis2</a>
		</li>
		<li>
			<a href="<c:url value="/generateReport.do" />" >Generuj raport PDF</a>
		</li>
                <li>
			<a href="<c:url value="/addEntry3.do" />" >Dodaj wpis3</a>
		</li>
	</ul>
</body>
</html>