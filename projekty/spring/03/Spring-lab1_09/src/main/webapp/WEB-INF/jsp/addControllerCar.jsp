<%@ include file="./includes/common.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
    <body>
	<h1>Dodaj wpis do książki adresowej:</h1>
	<form:form modelAttribute="entry"><!--reprezetuje kl entry-->
		<table>
		<tr>
			<td>
				Kategoria:
			</td>
			<td>
				<form:select path="category" items="${categories}"/><!--to samo co w controlerze!! to samo categoris-->
				
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
                       
		</table>
                <hr/>   
                                
	</form:form>
</body>
</html>