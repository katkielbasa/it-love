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
				<td><spring:message code="car.marka.label" /></td>
				<td>
					<form:input path="car.marka" />
					<form:errors path="car.marka"/>
				</td>
			</tr>
	
			<tr>
				<td><spring:message code="car.kolor.label" /></td>
				<td>
					<form:input path="car.kolor" />
					<form:errors path="car.kolor"/>
				</td>
			</tr>
		</table>
		<hr />
		
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