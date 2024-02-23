@All
Feature: Test Amazon application

  Background: 
    Given Open amazon homepage

 # @Homepage
  Scenario: Test title of homepage
    When user captures the title of homepage
    Then Current title should match with homepage expected title

  #@Bestseller
  Scenario: Test title of Bestseller page
    When user captures the title of Best seller page
    Then Current title should match with Bestseller page expected title

 @ignore #@Mobile
  Scenario: Test title of Mobile page
    When user captures the title of mobile page
    Then Current title should match with mobile page expected title

  @ignore #@Todays
  Scenario: Test title of Todays deal page
    When user captures the title of todays deal page
    Then Current title should match with todays deal page expected title
