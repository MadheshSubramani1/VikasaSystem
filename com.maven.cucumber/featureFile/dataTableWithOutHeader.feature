Feature: Login Test of Orange HRM
Scenario: Verify With Valid Credentials
    Given Launch the Orange HRM Application
    When Enter the below userName and Password
    |Admin|admin123|
    And Enter the Login Button
    Then User able to see the Home page