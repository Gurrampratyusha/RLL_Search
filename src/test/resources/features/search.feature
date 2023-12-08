Feature: Search Functionality on FirstCry

  Scenario: Perform a valid product search
    Given User is on the FirstCry homepage
    Then User should see the search bar
    When User enters a valid product name in the search bar
    And User clicks on the search button
  
