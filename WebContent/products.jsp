<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<title>Insert title here</title>
</head>
<body>
	<table border="1" width="80%" align="center">
		<c:forEach items="${products}" var="p">
		<tr>
			<td>${p.name}</td>
			<td>${p.kind}</td>
			<td>${p.price}</td>
			<td>${p.trem}</td>
			<td>${p.factory}</td>
		</tr>
		</c:forEach>
	</table>
	${pages}
</body>
</html>