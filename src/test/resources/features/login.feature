Feature: Login Functionality

  Scenario: Open the application and login
    Given I open the application
    And Click on Login
    When I give the "gurrampratyusha9@gmail.com"
    And Click continue
    And Give the OTP and click Submit
    Then Verify successful login

  # Add more scenarios as needed

