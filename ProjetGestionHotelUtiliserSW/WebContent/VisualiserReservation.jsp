<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>R�servation</title>
	
	Votre r�servation a bien �t� prise en compte ! 
	
	
		<fieldset>
		R�capitulatif de votre r�servation : <br> <br>
		Client ID : <%= ((Integer) session.getAttribute("idClient")).intValue() %> <br>
		Chambre ID : <%= (Integer) session.getAttribute("idChambreChoisie")  %><br> <br> <br>
	
	
		Dates Choisies : <%= session.getAttribute("dateDeb") %> - <%= session.getAttribute("dateFin") %><br>
		Dur�e du s�jour : <br>
		
		Prix total = ... euros<br>
		<form method="post" action="PayerChambreServ">
		<input type="submit" value="Payer" name="button" value="payer">
		</form>
		<form method="post" action="AnnulerResaServ">
		<input type="submit" value="Annuler" name="button" value="annuler">
		</form>
	
		</fieldset>

</head>
<body>

</body>
</html>