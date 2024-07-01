@Activity4
Feature: Data Driven test without example

  Scenario: Testing with correct data from scenario
    Given User is on the login page
    When The user enters "admin" and "password"
    Then Read the page title and confirmation message
    Then Close the browser