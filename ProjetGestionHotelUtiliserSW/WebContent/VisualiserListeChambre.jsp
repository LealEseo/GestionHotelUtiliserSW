<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste des chambres disponibles</title>
</head>
<body>
	Voici les chambres disponibles selon votre requête :
	<%= request.getParameter("listeChambres") %> 
	

	<a href = "Index.html"> home </a>
</body>
</html>