<%@ include file="./includes/common.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<body>
	<h1>Dodaj nowy wpis do książki</h1>
	<form:form modelAttribute="entry">
		<table border="1">
			<tr>
				<td><spring:message code="category.label" /></td>
				<td>
					<form:select path="category" items="${categories}"/>
				</td>
			</tr>

		</table>
		<hr />
		<table border="1">
			<tr>
				<td><spring:message code="komputer.nazwa.label" /></td>
				<td>
					<form:input path="komputer.nazwa" />
					<form:errors path="komputer.nazwa"/>
				</td>
			</tr>
	
			<tr>
				<td><spring:message code="komputer.opis.label" /></td>
				<td>
					<form:input path="komputer.opis" />
					<form:errors path="komputer.opis"/>
				</td>
			</tr>
		</table>
	
		
		<hr />
		<table border="1">
			<tr>
				<td>
					<input type="submit" value="<spring:message code="submit.label" />" colspan="2" />
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>