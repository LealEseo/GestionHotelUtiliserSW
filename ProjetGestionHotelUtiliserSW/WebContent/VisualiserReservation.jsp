<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>R�servation</title>
	
	Votre r�servation a �t� prise en compte ! 
	
	<form method="post" action="EffectuerResaServ">
		<fielset>
		R�capitulatif de votre r�servation :
		
		Chambre : 
	
	
		Dates Choisies : <%= session.getAttribute("dateDeb") %> - <%= session.getAttribute("dateFin") %>
		Dur�e du s�jour :
		
		Prix total 
		
		<input type="submit" value="Payer">
	
	
		</fielset>
	</form>
</head>
<body>

</body>
</html>