<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Réservation</title>
	
	Votre réservation a été prise en compte ! 
	
	<form method="post" action="EffectuerResaServ">
		<fielset>
		Récapitulatif de votre réservation :
		
		Chambre : 
	
	
		Dates Choisies : <%= session.getAttribute("dateDeb") %> - <%= session.getAttribute("dateFin") %>
		Durée du séjour :
		
		Prix total 
		
		<input type="submit" value="Payer">
	
	
		</fielset>
	</form>
</head>
<body>

</body>
</html>