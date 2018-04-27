Feature: Login Home page

Scenario Outline: Gmail <Role> Login
Given  user launches the application
When  user enters the username in "<username>" field
When  user enters the password in "<password>" field
Then user click on sign
 
Examples:
        |username|password|Role|
        |241naveen.chowdary|sujathaupputuri|SDET|
        |naveen.amfg26|upputuri1990|Manager|
         

 

 
 Scenario: Email Login in page
 Then user should be able to navigate to the GmailLogin screen
 
 



