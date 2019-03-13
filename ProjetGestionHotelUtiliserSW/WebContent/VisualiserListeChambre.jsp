<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="fr.eseo.servicesweb.Chambre, java.util.List, java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste des chambres disponibles</title>
</head>
<body>
	Voici les chambres disponibles selon votre requête :
	
	Résultat de la recherche : <br>
	<% List<Chambre> listeChambres = new ArrayList<Chambre>();
	   int size = ((Integer) session.getAttribute("tailleListe")).intValue(); %>
	
	<form method="post" action="EffectuerResaServ">
	<fieldset>
	
	
	<%for(int i=0; i<size;i++){ %>
		<br>
		idChambre : <%= session.getAttribute("idChambre "+ i) %> <br>
		NbPlaceLit : <%= session.getAttribute("nbPlaceLit "+ i) %><br>
		Prix journalier : <%= session.getAttribute("prixJournalier "+i) %> <br>
		Type Chambre : <%= session.getAttribute("typeChambre "+i) %> <br>
		<input type="submit" value="Réserver"/> <br>
	<%}%>
	
	</fieldset>
	</form>
	

</body>
</html>