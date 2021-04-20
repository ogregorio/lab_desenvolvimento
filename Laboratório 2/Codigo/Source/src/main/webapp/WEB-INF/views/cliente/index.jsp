<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
	<title>Clientes</title>
	</head>
	<body>
		<div>
		<h3>Cliente List</h3>
			<table>	
				<tr>
					<th>Nome</th>
					<th>CPF</th>
				</tr>
			<c:forEach var="cliente" items="${clientes}">
				<tr>
					<td>${cliente.nome}</td>
					<td>${cliente.cpf}</td>
				</tr>	
			</c:forEach>
			</table>
		</div>

	</body>
</html>