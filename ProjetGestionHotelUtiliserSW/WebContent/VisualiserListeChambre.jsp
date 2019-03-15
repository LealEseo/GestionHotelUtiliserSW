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
	Chambre(s) disponible(s) selon vos crit�res de recherche :<br>
	
	
	<% List<Chambre> listeChambres = new ArrayList<Chambre>();
	   int size = ((Integer) session.getAttribute("tailleListe")).intValue(); %>
	
	<form method="post" action="EffectuerResaServ">
	<fieldset>
	
	
	<%for(int i=0; i<size;i++){ %>
		<br>
		R�servation num�ro <%= i %> <br>
		Num�ro de chambre : <%= session.getAttribute("idChambre "+ i) %> <br>
		Nombre de place lit : <%= session.getAttribute("nbPlaceLit "+ i) %><br>
		Prix journalier : <%= session.getAttribute("prixJournalier "+i) %> <br>
		Chambre de type : <%= session.getAttribute("typeChambre "+i) %> <br>

	<%}%>
	
	</fieldset>
	</form>
	
	
	Quelle r�servation voulez-vous confirmer ?
			<select id="reservation" name="reservation">
			<%for(int i=0; i<size;i++){ %>
		 	<Option> Reservation chambre <%= session.getAttribute("idChambre "+ i) %> 
		 	<%}%>
		 </select> 
	
	
		<input type="hidden" value="valeur" name="idValue"/>
		<input type="hidden" value="valeur" name="idReserver" id="idReserver"/>
		<input type="submit" value="Confirmer la r�servation"/> <br>

</body>
</html>