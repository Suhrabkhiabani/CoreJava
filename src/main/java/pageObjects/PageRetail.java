package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class PageRetail extends Base {
	
	public PageRetail() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div[1]/div/div[1]/a/img")
	private WebElement clickOnMacBook;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[1]/ul[2]/li[3]/a")
	private WebElement clickOnReview;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[1]/ul[2]/li[2]/a")
	private WebElement clickonSpecification;
	
	public void clickOnMacBook() {
		clickOnMacBook.click();
	}
	
	public void clickOnReview() {
		clickOnReview.click();
	}
	
	public void clickOnSpecification() {
		clickonSpecification.click();
	}

}
