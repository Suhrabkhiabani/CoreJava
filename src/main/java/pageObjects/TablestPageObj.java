package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class TablestPageObj extends Base{
	
	public TablestPageObj() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/ul/li[4]/a")
	private WebElement tablets;

}
