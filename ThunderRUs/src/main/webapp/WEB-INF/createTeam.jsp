<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NBA Stats</title>
</head>
<body>

	<h1><a href="/">NBA Stats App</a></h1>
	<p>A place for NBA stats nerds to get statistics quickly!</p>
	<br>
	
	<form action="createTeam.do" Method="POST">
	<fieldset>
	Team Name: <input type="text" name="teamName"  placeholder="Team Name" required><br>
	Games Played: <input type="number" name="gamesPlayed" min="0" max="82" step="1" value="0" required><br>
	Average Points: <input type="number" name="pointsScoredAverage" min="0" max="350" value="0" required><br>
	Wins: <input type="number" name="wins" min="0" max="82" step="1" value="0" required><br>
	Losses: <input type="number" name="losses" min="0" max="82" step="1" value="0" required><br>
	Win Percentage: <input type="number" name="winLossPercentage" min="0.0" max="1.0" step=".01"  value="0"required><br>
	Field Goal Attempt: <input type="number" name="fieldGoalAttempt" value="0" required><br>
	Field Goal Made: <input type="number" name="fieldGoalMade" value="0" required><br>
	Field Goal Percentage: <input type="number" name="fieldGoalPercentage" min="0.0" max="100.00" step=".1" value="0" required><br>
	Three Point Attempt: <input type="number" name="threePointAttempt" value="0" required><br>
	Three Point Made: <input type="number" name="threePointMade" value="0" required><br>
	Three Point Percentage: <input type="number" name="threePointPercentage" min="0.0" max="100.00" step=".1" value="0" required><br>
	Free Throw Attempt: <input type="number" name="freeThrowAttempt" value="0" required><br>
	Free Throw Made: <input type="number" name="freeThrowMade" value="0" required><br>
	Free Throw Percentage: <input type="number" name="freeThrowPercentage" min="0.0" max="100.00" step=".1" value="0" required><br>
	Rebounds: <input type="number" name="reboundsAverage" min="0.0" max="200.00" step=".1" value="0" required><br>
	Offensive Rebounds: <input type="number" name="offensiveRebound" min="0.0" max="200.00" step=".1" value="0" required><br>
	Defensive Rebounds: <input type="number" name="defensiveRebound" min="0.0" max="200.00" step=".1" value="0" required><br>
	Assist: <input type="number" name="assists" min="0.0" max="100.00" step=".1" value="0" required><br>
	Turn Overs: <input type="number" name="turnOvers" min="0.0" max="100.00" step=".1" value="0" required><br>
	Steals: <input type="number" name="steals" min="0.0" max="100.00" step=".1" value="0" required><br>
	Blocks: <input type="number" name="blocks" min="0.0" max="100.00" step=".1" value="0" required><br>
	Personal Fouls: <input type="number" name="personalFouls" min="0.0" max="100.00" step=".1" value="0" required><br>
	<input type="hidden" name="logo" value="https://seeklogo.com/images/T/tune-squad-logo-75EDDD647F-seeklogo.com.png">
	<input type="submit" name="submit" value="Submit">
	</fieldset>
	</form>

</body>
</html>