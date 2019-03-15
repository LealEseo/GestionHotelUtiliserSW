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
	Voici les chambres disponibles selon votre requ�te :
	
	R�sultat de la recherche : <br>
	<% List<Chambre> listeChambres = new ArrayList<Chambre>();
	   int size = ((Integer) session.getAttribute("tailleListe")).intValue(); %>
	
	<form method="get" action="EffectuerResaServ">
	<fieldset>
	
	<%for(int i=1; i<size+1;i++){ %>
		<br>
		
		it�ration : <%= i %> <br>
		idChambre : <%= session.getAttribute("idChambre "+ i) %> <br>
		NbPlaceLit : <%= session.getAttribute("nbPlaceLit "+ i) %><br>
		Prix journalier : <%= session.getAttribute("prixJournalier "+i) %> <br>
		Type Chambre : <%= session.getAttribute("typeChambre "+i) %> <br>
		<input type="hidden" value="valeur" name="idValue"/>
		<input type="hidden" value="<%=i %>" name="idReserver" id="idReserver"/>
		<input type="submit" value="R�server"/> <br>
	<%}%>
	
	</fieldset>
	</form>
	
	<legend> <span class="number"></span>Quel chambre voulez-vous r�server ?</legend>
			<select id="typeChambre" name="typeChambre"></br> 
			<%for(int i=1; i<size+1;i++){ %>
				<Option> Chambre n� <%= session.getAttribute("idChambre "+ i) %>
		
		<%}%>
		 	
		 </select> </br> 
	

</body>
</html>