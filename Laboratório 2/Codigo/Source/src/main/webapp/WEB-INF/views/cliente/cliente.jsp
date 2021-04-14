<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1 isELIgnored="false" "%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Clientes</title>
	</head>
	<body>
		
		<h3>Cliente List</h3>
			<ul>
				<li>
					<span>CPF</span>
					<span>Nome</span>
				</li>
			</ul>
			<c:forEach var="cliente" items="$(clientes )">
			<ul>
				<li>
					<span>${clientes.nome}</span>
					<span>${clientes.cpf}</span>
				</li>
			</ul>
			</c:forEach>
	</body>
</html>