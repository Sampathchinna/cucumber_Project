

Feature: Login
  As a user
  I want to login to the application
  So that I can access the features

  Background:
    Given user on the login page

  Scenario Outline: Successful login
    Given user enter "<username>" and "<password>"
    Then user should be logged in

    Examples:
      | username | password |
      | Admin    | admin123 |

