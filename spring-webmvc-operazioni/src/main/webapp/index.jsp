<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="sceltaAzione" method="post">

		<input type="radio" value="add" id="addizione" name="scelta">
		<label for="addizione">Addizione</label><br> <input type="radio"
			value="sub" id="sottrazione" name="scelta"> <label
			for="sottrazione">Sottrazione</label><br> <input type="radio"
			value="mul" id="moltiplicazione" name="scelta"> <label
			for="moltiplicazione">Moltiplicazione</label><br> <input
			type="radio" value="div" id="divisione" name="scelta"> <label
			for="divisione">Divisione</label><br> <input type="submit"
			value="Scegli i numeri adesso!!!">
	</form>


</body>
</html>