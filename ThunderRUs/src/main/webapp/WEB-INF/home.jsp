<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NBA stats!</title>
<jsp:include page="style.jsp"/>
<style>
        body { background-color: #1C2331; padding: 5px; align-content: center; }
		h1 { color: white; text-align: center; }
		blockquote { color: white; text-align: center; }
        p { color: white; }
    </style>
</head>
<body>
<div class="container-fluid" >
	<h1 class="display-2">
		<a href="home.do">NBA Stats App</a>
	</h1>
	<blockquote>A place for NBA stats nerds to get statistics quickly!</blockquote>
	<br>

	
		<form action="search.do" method="POST">
			<input type="text" class="form-control form-control-lg col-md-2" name="searchKeyword" placeholder="Search Team">
			 <button type="submit" class="btn btn-primary btn-lg col-md-2" name="submit" >Search </button>
		</form>
		
	<br>
	<br>
		<form action="create.do" method="GET">
			<button type="submit" class="btn btn-info btn-lg" name="createTeam" >Create A Team </button>
		</form>

	<br>
	<div class="d-inline-flex p-2">
	<c:if test="${! empty Teams }">
		<c:forEach var="team" items="${Teams }">
			<a href="home.do"> <img alt="team's logo" src="${team.logo }" class="img-thumbnail">
				<p>${team.teamName }</p>
			</a>
		</c:forEach>

	</c:if>
	</div>
</div>
</body>
</html>