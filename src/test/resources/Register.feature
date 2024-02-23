Feature: Test open cart application

  Scenario: Test the open cart registration functionality with valid data using data table
    Given Open the open cart application with register page
    When user enter the valid data
      | fnae | emaime   | lnaml              | psw      |
      | tester1 | abc   | tester11@gmail.com | tester22 |
    When user click on yes radio button
    When user click on privacy policy checkbox
    When user click on continue button
    Then user should get registered
