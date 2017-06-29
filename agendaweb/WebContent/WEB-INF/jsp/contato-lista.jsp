<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>mvc</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<td>ID</td>
				<td>NOME</td>
			</tr>
		</thead>
		<c:forEach var="contato" items="${contatos}">
			<tr>
				<td>${contato.id}</td>
				<td>${contato.nome}</td> 
				<td>&nbsp;&nbsp;</td>
				
				<td><a href="mvc?logica=LinkAdicionaContatoLogic">Adicionar</a>
				
				<td><a href="mvc?logica=RemoveContatoLogic&id=${contato.id}">Remover</a></td>
				                                       <!-- passe o id^^ -->
				<td><a href="mvc?logica=LinkAlteraContatoLogic&id=${contato.id}&nome=${contato.nome}">Alterar</a></td>			
			</tr>
		</c:forEach>
	
	</table>
	<a href="mvc?logica=LinkBemVindoLogic">Home</a>
</body>
</html>
