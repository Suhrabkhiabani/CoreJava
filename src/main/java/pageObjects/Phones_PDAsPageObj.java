package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class Phones_PDAsPageObj extends Base{
	
	public Phones_PDAsPageObj() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/ul/li[6]/a")
	private WebElement phoneAndPDAs;

}
