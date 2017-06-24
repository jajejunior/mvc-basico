<html lang="pt-br">
<head>
<meta charset="uft-8">
<title>mvc</title>
</head>
<body>

Pagina de cadastro
<form action="mvc" method="POST">
	Nome: <input type="text" name="nome" value="${param.nome }" required="required">
	
	<input type="hidden" name="logica" value="AddAndUpdateLogic"/>
	<input type="submit" value="Gravar"><br/>
	<a href="mvc?logica=LinkBemVindoLogic">Home</a>
	
</form>

</body>
</html>

