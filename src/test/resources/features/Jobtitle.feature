Feature: Admin Functionally

 Background:
  Given user on the login page

 Scenario Outline: Successful login
  Given user enter "<username>" and "<password>"
  Then user should be logged in
  When Click on Admin Button
  Then Click on Job
  Then Click on the Job Titles
  And Click on Add Button
#  And I enter the Job Titles "<jobtitle>" and "<jobdescrpition>" and "<jobnote>"



  Examples:
   | username | password |
   | Admin    | admin123 |
#  Examples:
#  | jobtitle | jobdescrpition | jobnote |
#  | Software | Need to work   | Developer |

