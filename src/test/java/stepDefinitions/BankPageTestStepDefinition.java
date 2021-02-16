package stepDefinitions;

import core.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.BankPage;
import utilities.WebDriverUtility;

public class BankPageTestStepDefinition extends Base{
	
	BankPage bankPage = new BankPage();
	
	@Given("^User is on Bank website$")
	public void user_is_on_Bank_website() throws Throwable {
		
		logger.info("Bank page is opened");
		
		WebDriverUtility.screenShot();
	}

	@When("^User click on ApplyForAMortgageLoan Button$")
	public void user_click_on_ApplyForAMortgageLoan_Button() throws Throwable {
		
		    bankPage.clickOnApplyForAMortgageLoan();
	} 
	

	@And("^User Click on ApplyNow Button$")
	public void user_Click_on_ApplyNow_Button() throws Throwable {
	    bankPage.clickOnApplyNowButton();
	}

	@And("^User click on IwantToBuyHome Button$")
	public void user_click_on_IwantToBuyHome_Button() throws Throwable {
	    bankPage.clickOnWantToBuyNewHomeButton();
	}

	@Then("^User is on BankForm Page$")
	public void user_is_on_BankForm_Page() throws Throwable {
	    WebDriverUtility.screenShot();
	}

}
