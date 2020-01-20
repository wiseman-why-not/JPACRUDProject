<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NBA Stats</title>
<jsp:include page="style.jsp"/>
<style>
        body { background-color: #1C2331; padding: 5px; align-content: center; }
		h1 { color: white; text-align: center; }
		blockquote { color: white; text-align: center; }
        p { color: white; }
        form{ color: white}
    </style>
</head>
<body>

	<h1 class="display-2"><a href="home.do">NBA Stats App</a></h1>
	<blockquote>A place for NBA stats nerds to get statistics quickly!</blockquote>
	<br>
	
	<form action="createTeamInDB.do" Method="POST">
	<div class="form-group">
	<fieldset>
	Team Name: <input class="form-control col-md-2" type="text" name="teamName"  placeholder="Team Name" required><br>
	Games Played: <input class="form-control col-md-2" type="number" name="gamesPlayed" min="0" max="82" step="1" value="0" required><br>
	Average Points: <input class="form-control col-md-2" type="number" name="pointsScoredAverage" min="0" max="350" value="0" required><br>
	Wins: <input class="form-control col-md-2" type="number" name="wins" min="0" max="82" step="1" value="0" required><br>
	Losses: <input class="form-control col-md-2" type="number" name="losses" min="0" max="82" step="1" value="0" required><br>
	Win Percentage: <input class="form-control col-md-2" type="number" name="winLossPercentage" min="0.0" max="1.0" step=".01"  value="0"required><br>
	Field Goal Attempt: <input class="form-control col-md-2" type="number" name="fieldGoalAttempt" value="0" required><br>
	Field Goal Made: <input class="form-control col-md-2" type="number" name="fieldGoalMade" value="0" required><br>
	Field Goal Percentage: <input class="form-control col-md-2" type="number" name="fieldGoalPercentage" min="0.0" max="100.00" step=".1" value="0" required><br>
	Three Point Attempt: <input class="form-control col-md-2" type="number" name="threePointAttempt" value="0" required><br>
	Three Point Made: <input class="form-control col-md-2" type="number" name="threePointMade" value="0" required><br>
	Three Point Percentage: <input class="form-control col-md-2" type="number" name="threePointPercentage" min="0.0" max="100.00" step=".1" value="0" required><br>
	Free Throw Attempt: <input class="form-control col-md-2" type="number" name="freeThrowAttempt" value="0" required><br>
	Free Throw Made: <input class="form-control col-md-2" type="number" name="freeThrowMade" value="0" required><br>
	Free Throw Percentage: <input class="form-control col-md-2" type="number" name="freeThrowPercentage" min="0.0" max="100.00" step=".1" value="0" required><br>
	Rebounds: <input class="form-control col-md-2" type="number" name="reboundsAverage" min="0.0" max="200.00" step=".1" value="0" required><br>
	Offensive Rebounds: <input class="form-control col-md-2" type="number" name="offensiveRebound" min="0.0" max="200.00" step=".1" value="0" required><br>
	Defensive Rebounds: <input class="form-control col-md-2" type="number" name="defensiveRebound" min="0.0" max="200.00" step=".1" value="0" required><br>
	Assist: <input class="form-control col-md-2" type="number" name="assists" min="0.0" max="100.00" step=".1" value="0" required><br>
	Turn Overs: <input class="form-control col-md-2" type="number" name="turnOvers" min="0.0" max="100.00" step=".1" value="0" required><br>
	Steals: <input class="form-control col-md-2" type="number" name="steals" min="0.0" max="100.00" step=".1" value="0" required><br>
	Blocks: <input class="form-control col-md-2" type="number" name="blocks" min="0.0" max="100.00" step=".1" value="0" required><br>
	Personal Fouls: <input class="form-control col-md-2" type="number" name="personalFouls" min="0.0" max="100.00" step=".1" value="0" required><br>
	<input type="hidden" name="logo" value="http://content.sportslogos.net/logos/6/982/thumbs/98281472018.gif">
	<button type="submit" class="btn btn-info" name="submit" >Submit </button>
	</fieldset>
	</div>
	</form>

</body>
</html>