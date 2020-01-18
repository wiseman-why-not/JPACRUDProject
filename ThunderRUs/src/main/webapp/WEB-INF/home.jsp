<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	<div class="searchBox">
		<form action="search.do">
			<input type="text" name="searchKeyword"> <input type="submit"
				name="submit" value="SEARCH!">
		</form>
	</div>
</body>
</html>