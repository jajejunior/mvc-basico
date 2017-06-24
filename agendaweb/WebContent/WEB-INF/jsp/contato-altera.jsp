<html lang="pt-br">
<head>
	<meta charset="uft-8">
	<title>mvc</title>
</head>
<body>

Alterar contato:<br/><br/>
<form action="mvc" method="post">
    Id:
    <input type="text" name="id" value="${param.id}" readonly="readonly"/><br/>
    Nome:
    <input type="text" name="nome" value="${param.nome}"/><br/><br/>
    
    <input type="hidden" name="logica" value="AddAndUpdateLogic"/>
    
    <input type="submit" value="Enviar"/><br/><br/>
    <a href="mvc?logica=LinkBemVindoLogic">Home</a>
    
</form>
</body>
</html>