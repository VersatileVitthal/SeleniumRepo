Feature: Test Automation playground CRM application

  Background: 
    Given Automation playground crm application should be open
@SignIn
  Scenario: Test Sign In link
    When user clicks on Sign In button
    Then user should be navigated to login page
@Login
  Scenario: Test login functionality
    When user enters email "test@gmail.com" and password "test@123"
    When user clicks on submit button
    Then user should be logged in for valid data only
