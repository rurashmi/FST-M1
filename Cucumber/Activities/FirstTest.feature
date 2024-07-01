@FirstTest
Feature: Basic test
@FirstScenario
  Scenario: Training Support home page test
    Given User is on the home page
    When The user clicks on the About us button
    Then The user is redirected to the About Page
    Then Close the browser