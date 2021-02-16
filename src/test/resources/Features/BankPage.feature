Feature: Login to Bank Website 


Background: 
	Given User is on Bank website 
@BankPage 
Scenario: Search functionality Test case 

	When User click on ApplyForAMortgageLoan Button 
	And User Click on ApplyNow Button 
	And User click on IwantToBuyHome Button 
	Then User is on BankForm Page