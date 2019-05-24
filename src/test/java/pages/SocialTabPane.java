package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SocialTabPane {
	
	
	public WebDriver driver;
	@FindBy(xpath="(//div[@class=\"aDG\"])[2]/following-sibling::*")
	public WebElement Socialtab;
	
	public void clicksocialtab()
	{
		Socialtab.click();
	}

}
