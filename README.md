## Spring MVC JPA C.R.U.D Project

#### Week 9 Homework Project for Skill Distillery

### Overview

+ A simple application that displays a Box-Score table for NBA Teams. The table
mirror the box score from the NBA and ESPN. This website allows you to Create,
Read, Update, or Delete a team as the season goes on.

+ The goal is to have you implement C.R.U.D. (Create, Read, Update, Destroy), which is some of the most common behavior on the web. This application adhere to the MVC pattern. Benefits of the MVC pattern are similar to that of encapsulation. There is a separation of concerns between the individual elements that make up the model, view, and controller respectively. Changing code in one has no affect on the code in the others.

#### How to use

+ You land a the Home page
+ You can view the teams that you are loaded in the data base.
+ Clicking the NBA Stats App on any page will take you home!
+ Search for any part of the team(s) you want to view with the search button.
+ Once viewing the team(s), you are given the option to update or delete the team.
+ From the Home page, you can click the create team button to add the team to the database.

### Technologies and Tools Used

+ Java
+ Spring Boot
+ MySql / MySqlWorkBench
+ Gradle
+ Bootstrap
+ HTML / CSS
+ XML

### Lesson's Learned / Difficulties

+ Spring Boot
+ NOT ANNOTATE THE DAO AS STATIC. It took me a solid two working days just to
 get my entity manager factory automatically work, because I was getting null
 for my entity manager.
+ First time using MySqlWorkBench to create a Database.
+ Understanding data types when creating a database.
+ Still getting use to pass model attributes from webpage to controller,
  then back to another webpage or jsp file.
+ I could not link my master.css style sheet file to my jsp file. I had to settle
with styling each page.
+ Would love to actually spend the time to use bootstrap to make the website more modern.
