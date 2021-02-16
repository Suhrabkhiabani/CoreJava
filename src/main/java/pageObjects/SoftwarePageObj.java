package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class SoftwarePageObj extends Base {
	
	public SoftwarePageObj() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/ul/li[5]/a")
	private WebElement software;

}
