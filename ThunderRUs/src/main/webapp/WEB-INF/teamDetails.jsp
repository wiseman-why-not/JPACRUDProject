<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NBA Stat App</title>
</head>
<body>

	<h1>NBA Stats App</h1>
	<p>A place for NBA stats nerds to get statistics quickly!</p>
	<br>

	<c:if test="${! empty team }">
		<h3>Teams Stats</h3>
		<table>
			<tr>
				<th>Team Name: ${team.teamName }</th>
			</tr>
			<tr>
				<td>
			</tr>

		</table>

	</c:if>

</body>
</html>