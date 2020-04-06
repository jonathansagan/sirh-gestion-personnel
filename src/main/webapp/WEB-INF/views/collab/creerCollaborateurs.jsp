<%@page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SGP - App</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-4.4.1-dist/css/bootstrap.css">
</head>
<body>
	<h1>Nouveau collaborateur</h1>
	
	<form name="creerForm" method="post" action="http://localhost:8080/sgp/collaborateurs/nouveau">
		<div class="form-group">
			<label for="imputNom">Nom</label> 
			<input type="text" class="form-control" name="nom" required>
		</div>
		<div class="form-group">
			<label for="imputPrenom">Prénom</label> 
			<input type="text" class="form-control" name="prenom" required>
		</div>
		<div class="form-group">
			<label for="imputDateNaissance">Date de naissance</label> 
			<input type="date" class="form-control" name="dateNaissance" required>
		</div>
		<div class="form-group">
			<label for="imputAdresse">Adresse</label> 
			<input type="text" class="form-control" name="adresse" required>
		</div>
		<div class="form-group">
			<label for="imputNumSecu">Numéro de sécurité sociale</label> 
			<input type="text" class="form-control" name="numSecu" required>
		</div>
		<button type="submit" class="btn btn-primary">Créer</button>
	</form>
</body>
</html>