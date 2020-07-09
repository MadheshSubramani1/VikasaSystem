@UsingBackground
Feature: Verify the Education

Background: 
	Given should complete the high school 
	And Should complete the higher secondary 
	
Scenario: To study Engineering 
	Given stdeunt has to fill the Engineering Application 
	When Apply to Engineering University 
	Then Should Attend The Engineering counselling 
	
Scenario: To study Medical 
	Given stdeunt has to fill the Medical Application 
	When Apply to Medical University 
	Then Should Attend The Medical counselling