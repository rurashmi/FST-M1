@Activity1
  Feature: First Test
    @SmokeTest
    Scenario: Opening a webpage using Selenium
      Given User is on the Google Home Page
      When User types in Amazon and hits enter
      Then Show the search results
      Then Close the browser

