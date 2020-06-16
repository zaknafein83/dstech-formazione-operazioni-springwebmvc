<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Abbiamo fatto una scelta in precedenza che è: ${sceltaDaController }

Ora inserisci i due numeri
<form action="calcolaRisultato" method="post">
<input type="number" name="x" placeholder="Inserisci il primo numero" >
<input type="number" name="y" placeholder="Inserisci il secondo numero" >


<input type="hidden" name="scelta" value = ${sceltaDaController} >
<input type="submit" value="Calcola il risultato">
</form>

</body>
</html>