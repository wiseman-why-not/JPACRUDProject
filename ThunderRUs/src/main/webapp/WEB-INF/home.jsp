<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NBA stats!</title>
<jsp:include page="style.jsp"/>
</head>
<body>
<div class="container-fluid">
	<h1>
		<a href="/">NBA Stats App</a>
	</h1>
	<p>A place for NBA stats nerds to get statistics quickly!</p>
	<br>
	<div class="searchBox">
		<form action="search.do" method="POST">
			<input type="text" name="searchKeyword"> <input type="submit"
				value="SEARCH!">
		</form>
	</div>
	<br>
	<div class="createTeam">
		<form action="create.do" method="GET">
			<input type="submit" name="createTeam" value="Create Team">
		</form>
	</div>
	<br>
	<c:if test="${! empty Teams }">

		<c:forEach var="team" items="${Teams }">
			<a href="/"> <img alt="team's logo" src="${team.logo }" class="img-thumbnail">
				<p>${team.teamName }</p>
			</a>
			<br>
		</c:forEach>


	</c:if>
</div>
</body>
</html>