<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NBA Stats!</title>
<jsp:include page="style.jsp" />
<style>
        body { background-color: #1C2331; padding: 5px; align-content: center; }
		h1 { color: white; text-align: center; }
		blockquote { color: white; text-align: center; }
        p { color: white; }
    </style>
</head>
<body>

	<h1 class="display-2">
		<a href="home.do">NBA Stats App</a>
	</h1>
	<blockquote>A place for NBA stats nerds to get statistics quickly!</blockquote>
	<br>

	<h2>Deleted Team</h2>
	<br>
	<div class="table-responsive">
	<table class="table table-bordered table-dark">
		<thead class="thead-light">
			<tr>
				<th>Team</th>
				<th>Games Played</th>
				<th>Wins</th>
				<th>Losses</th>
				<th>Win%</th>
				<th>Points</th>
				<th>FGA</th>
				<th>FGM</th>
				<th>FG%</th>
				<th>3PA</th>
				<th>3PM</th>
				<th>3P%</th>
				<th>FTA</th>
				<th>FTM</th>
				<th>FT%</th>
				<th>Rebounds</th>
				<th>O Rebounds</th>
				<th>D Rebounds</th>
				<th>Assist</th>
				<th>TurnOvers</th>
				<th>Steals</th>
				<th>Blocks</th>
				<th>Pers Fouls</th>
			</tr>
		</thead>
		<tr>
			<td>${team.teamName }</td>
			<td>${team.gamesPlayed }</td>
			<td>${team.wins }</td>
			<td>${team.losses }</td>
			<td>${team.winLossPercentage }</td>
			<td>${team.pointsScoredAverage }</td>
			<td>${team.fieldGoalAttempt }</td>
			<td>${team.fieldGoalMade }</td>
			<td>${team.fieldGoalPercentage }</td>
			<td>${team.threePointAttempt }</td>
			<td>${team.threePointMade }</td>
			<td>${team.threePointPercentage }</td>
			<td>${team.freeThrowAttempt }</td>
			<td>${team.freeThrowMade }</td>
			<td>${team.freeThrowPercentage }</td>
			<td>${team.reboundsAverage }</td>
			<td>${team.offensiveRebound }</td>
			<td>${team.defensiveRebound }</td>
			<td>${team.assists }</td>
			<td>${team.turnOvers }</td>
			<td>${team.steals }</td>
			<td>${team.blocks }</td>
			<td>${team.personalFouls }</td>
		</tr>

	</table>
	</div>
	<br>

</body>
</html>