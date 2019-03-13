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
	
	<%for(int i=0; i<size;i++){ %>
		idChambre : <%= session.getAttribute("idChambre "+ i) %>
		NbPlaceLit : <%= session.getAttribute("NbPlaceLit "+ i) %>
		Prix journalier : <%= session.getAttribute("Prix journalier "+i) %>
		Type Chambre : <%= session.getAttribute("Type chambre "+i) %>
	<%}%>
	

</body>
</html>