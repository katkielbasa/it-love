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
	</form:form>
</body>
</html>