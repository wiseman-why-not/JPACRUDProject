<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NBA stats!</title>
</head>
<body>

	<h1>NBA Stats App</h1>
	<p>A place for NBA stats nerds to get statistics quickly!</p>
	<br>

<c:if test="${! empty Teams }">
<h3>Teams found!</h3>
<c:forEach var="team" items="${Teams }">
	  Team: <a href="getTeam.do?teamId=${team.id }">${team.teamName }</a>
	  <br>

</c:forEach>

</c:if>


</body>
</html>