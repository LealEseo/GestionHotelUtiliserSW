<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="fr.eseo.servicesweb.Chambre, java.util.List, java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="styleFormulaire.css"/>
<title>Liste des chambres disponibles</title>
</head>
<body>
	<div class="styleFormulaire">
	<legend> Chambre(s) disponible(s) selon vos crit�res de recherche :<br></legend>
	
	
	<% List<Chambre> listeChambres = new ArrayList<Chambre>();
	   int size = ((Integer) session.getAttribute("tailleListe")).intValue(); %>
	
	<form method="get" action="EffectuerResaServ">
	<fieldset>
	
	  <%for(int i=1; i<size+1;i++){ %>
		<br>
		<hr>
		
		R�servation num�ro <%= i %> <br>
		Num�ro de chambre : <%= session.getAttribute("idChambre "+ i) %> <br>
		Nombre de place lit : <%= session.getAttribute("nbPlaceLit "+ i) %><br>
		Prix journalier : <%= session.getAttribute("prixJournalier "+i) %> <br>
		Chambre de type : <%= session.getAttribute("typeChambre "+i) %> <br> 
		D�but de s�jour le : <%= session.getAttribute("dateDeb") %><br>
		Fin de s�jour le : <%= session.getAttribute("dateFin") %><br>
		<br>
		<br/>
		</hr>
		

	<%}%> 
	
	</fieldset>
	
	<legend2>Quelle r�servation voulez-vous confirmer ?</legend2><br>
			<select id="reservation" name="reservation">
			<%for(int i=1; i<size+1;i++){ %>
		 	<Option> Reservation numero <%=i%>
<%} %>
		 </select>
	
	
		<input type="hidden" value="valeur" name="idValue"/>
		<input type="hidden" value="valeur" name="idReserver" id="idReserver"/>
		<input type="submit" value="Confirmer la r�servation"/> <br>
	</div>
	</form>
</body>
</html>