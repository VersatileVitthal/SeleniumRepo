Feature: Test orangeHrm application

  Scenario Outline: Test login functionality with data driven.
    Given Orange Hrm application should be open
    When user enters username "<uname>" and password "<pwd>"
    Then user should be logged in for valid data

    Examples: 
      | uname   | pwd        |
      | Admin   | admin123   |
      | vitthal | vitthal123 |
      | Admin   | admin123   |
      | shital  | shital123  |
