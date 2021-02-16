package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class BankPage extends Base{
	
	public BankPage() {
		PageFactory.initElements(driver, this);
	}
	//span[contains(text(),'APPLY FOR A MORTGAGE LOAN')]
	@FindBy(css="body > div > div > div > section.elementor-element.elementor-element-5cb8b6d.elementor-section-height-min-height.elementor-section-full_width.elementor-section-height-default.elementor-section-items-middle.elementor-section.elementor-top-section > div.elementor-container.elementor-column-gap-default > div > div > div > div > div.elementor-element.elementor-element-be5e841.elementor-align-center.elementor-widget.elementor-widget-button > div > div > a")
	private WebElement clickonapplyformortgageloadnButton;
	
	@FindBy(xpath= "/html/body/div/div/div/section/div/div/div/div/div/div[3]/div/div/a/span/span[2]")
	private WebElement applyNowButton;
	
	@FindBy(xpath="/html/body/div/div/div/section/div/div/div/div/div/div[3]/div/div/a/span/span[2]")
	private WebElement wantToBuyNewHomeButton;
	
	public void clickOnApplyForAMortgageLoan() {
		//WebDriverUtility.clickOnElement(clickonapplyformortgageloadnButton);
		clickonapplyformortgageloadnButton.click();
	}
	
	public void clickOnApplyNowButton() {
		WebDriverUtility.clickOnElement(applyNowButton);
	}
	
	public void clickOnWantToBuyNewHomeButton() {
		WebDriverUtility.clickOnElement(wantToBuyNewHomeButton);
	}
	
	
	
	

}
