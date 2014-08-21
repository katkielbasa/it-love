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
				<td>Imię:</td>
				<td>
					<form:input path="person.name" />
				</td>
			</tr>

			<tr>
				<td>Nazwisko:</td>
				<td>
					<form:input path="person.surname" />
				</td>
			</tr>
                        
                        <tr>
				<td>Marka:</td>
				<td>
					<form:input path="car.marka" />
				</td>
			</tr>
                        
                        <tr>
				<td>Kolor:</td>
				<td>
					<form:input path="car.kolor" />
				</td>
			</tr>
                        
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