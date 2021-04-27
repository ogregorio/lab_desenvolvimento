<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>

<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<%@ page import="java.util.*" %>

<!DOCTYPE html>
<html>
	<head>
	<title>Pedidos</title>
	</head>
	<body>
		<div>
		<h3>Add Pedido</h3>
			<div class="menu">
				<a href="/clientes">Clientes</a>
				<a href="/automoveis">Automoveis</a>
				<a href="/pedidos">Pedidos</a>
			</div>
			<s:form method="post" modelAttribute="pedido"
				action="${pageContext.request.contextPath}/pedidos/add">
				<table>
					<tr>
						<td>Codigo</td>
						<td>
							<s:input path="codigo"/>
						</td>
						<td>Status</td>
						<td>
							<s:input path="status"/>
						</td>
						<td>Data Inicial</td>
						<td>
							<s:input value="<%= (new java.util.Date()).toLocaleString()%>" path="data_inicial"/>
						</td>
						<td>Data Modificacao</td>
						<td>
							<s:input value="<%= (new java.util.Date()).toLocaleString()%>" path="data_modificacao"/>
						</td>
						<td>Codigo Agente</td>
						<td>
							<s:input path="codigo_agente"/>
						</td>
						<td>Matricula</td>
						<td>
							<s:input path="matricula_automovel"/>
						</td>
						<td>CPF Cliente</td>
						<td>
							<s:input path="cpf_cliente"/>
						</td>
						<td>
							<input type="submit" value="Salvar"/>
						</td>
					</tr>
				</table>
			</s:form>
		</div>
	</body>
	<style>
		@import url('https://fonts.googleapis.com/css2?family=Roboto:wght@300;500&display=swap');		
		
		html {
			background: #4C9040;
			width: 100%;
			height: 100%;
			font-family: 'Roboto', sans-serif;
			font-weight: 300;
		}

		h3 {
			text-align:center;
			color: #fff;
			font-weight: 500;
		}

		table {
			margin: auto;
			padding-bottom: 5%;
		}
		
		tr {
		    display: flex;
    		flex-direction: column;
    		min-width: 500px;
    	}

		td{
			border: solid 1px #fff;
			padding: 3px;
			text-align: center;
			color: #fff;
		}

		th{
			border: solid 1px #fff;
			background: #fff;
			padding: 3px;
			text-align: center;
			color: #4C9040;
		}
		
		.menu {
			display: flex;
			width: 100%;
			text-align: center;
			justify-content: center;
		}

		.menu a {
			color: #fff;
			text-decoration: none;
			margin: 10px;
		}

		.menu a:hover {
			text-decoration: underline;
		}

	</style>
</html>