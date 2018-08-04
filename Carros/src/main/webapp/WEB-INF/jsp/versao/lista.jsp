<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de Versao</title>
</head>
<body>

	<a href="/versao/novo">Nova Versao</a>
	<table>
		<thead>
			<tr>
				<th>Código</th>
				<th>Nome</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${versaos}" var="versao">
				<tr>
					<td>
						<a href="/versao/visualizar/${versao.codigo}">${versao.codigo}</a>
					</td>
					<td>${versao.nome}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
</html>