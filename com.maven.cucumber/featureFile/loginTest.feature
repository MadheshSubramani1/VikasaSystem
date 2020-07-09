Feature: VerifyTheLoginPage 

@positiveScenario 
Scenario: Verify With Valid Credentials 
	Given user is on Login page 
	When user Entered the "Admin" and "admin123" 
	And Clicks On the Login Button 
	Then User Should navigate to Home Page 
@positiveScenario 
Scenario: Verify With Valid Credentials 
	Given user is on Login page 
	When user Entered the "Admin" and "admin123" 
	And Clicks On the Login Button 
	Then User Should navigate to Home Page 
@NegatvieScenario 
Scenario: Verify With InValid Credentials 
	Given user is on Login page 
	When user Entered the "Admin" and "admin123" 
	And Clicks On the Login Button 
	Then User Should navigate to Home Page