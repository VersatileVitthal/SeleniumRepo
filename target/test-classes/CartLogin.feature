Feature: Test open cart application

  Scenario: Test login functionality of open cart application
    Given Open cart login page should be open
    When user enters valid data using data table
      | emailid           | psw      |
      | tester1@gmail.com | test@123 |
    When user clicks on login button
    Then user shoud be logged in his account
