Feature: Login Test of Orange HRM 
Scenario Outline: Verify With Valid Credentials 
	Given Launch the Application In Local Evnironment 
	When Enterd the  "<UserName>" and "<Password>" 
	And Click the Returns Key 
	Then User could see the Home page 
	
	Examples: 
		|UserName|Password|
		|Admin|admin123456|
		|Admin|admin12345|
		|Admin|admin1234|
		|Admin|admin123|