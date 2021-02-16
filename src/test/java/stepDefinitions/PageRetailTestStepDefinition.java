package stepDefinitions;

import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.PageRetail;

public class PageRetailTestStepDefinition extends Base {

	PageRetail pageretail = new PageRetail();

	@When("^User click on MacBook$")
	public void user_click_on_MacBook() throws Throwable {
		Thread.sleep(6000);
		pageretail.clickOnMacBook();

	}

	@When("^User click on Reviews$")
	public void user_click_on_Reviews() throws Throwable {
		Thread.sleep(6000);
		pageretail.clickOnReview();

	}

	@Then("^User click on specificaion$")
	public void user_click_on_specificaion() throws Throwable {
		Thread.sleep(6000);
		pageretail.clickOnSpecification();
	}

}