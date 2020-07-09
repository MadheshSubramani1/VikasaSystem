Feature: Login Test of Orange HRM
Scenario: Verify With Valid Credentials
    Given Launch the Application In Test Evnironment
    When Enter the  userName and Password
    |UserName|Password|
    |Admin|admin123|
    And Click the Login Button
    Then User can see the Home page