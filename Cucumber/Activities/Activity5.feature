@Activity5
Feature: Data Driven test with example

  Scenario Outline: Testing with data from scenario
    Given User is on the login page
    When The user enters "<Username>" and "<Password>"
    Then Read the page title and confirmation message

  Examples:
    | Username | Password |
    | admin | password |
    | admin1 | password1 |