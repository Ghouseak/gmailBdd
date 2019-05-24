package tests;

import java.io.FileInputStream;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import cucumber.api.junit.*;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Launchpage;
import pages.LoginPage;
import pages.MailBox;

public class GamilMethods {

	public WebDriver driver;
	public Launchpage lp;
	public LoginPage logp;
	public MailBox mb;
	public Scenario s;
	public Properties pro;
	
	@Before
	public void method1(Scenario x) throws Exception
	{
		//use scenario obj for current scenario
		this.s = x;
		pro =new Properties();
		
		FileInputStream fip = new FileInputStream("C:\\D\\Automation\\GmailBDD\\resources\\gmailproperties.properties");
		pro.load(fip);
		
		System.out.println(pro.getProperty("url"));
		
		System.setProperty("webdriver.chrome.driver",pro.getProperty("gdpath"));
		
		driver=new ChromeDriver();
		
		//create page objects for current scenario
		
		 lp =  Launchpage.getLaunchpage(driver);
		 logp = new LoginPage(driver);
		 mb = new MailBox(driver);
	}
	
	@Given("^Launch Gmail site$")
	public void method2() throws Exception
	{
	driver.get(pro.getProperty("url"));	 
	Thread.sleep(5000);
	}
	
	@Then("^title is \"(.*)\" value$")
	public void methos3(String x)
	{
		String t = driver.getTitle();
		if(t.equals(x))
		{
			s.write("Title test passed");
		}
		else
		{
			byte[] src=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			s.embed(src,"Title tet failed");
			Assert.fail();
		}
	}
	@And("^close site$")
	public void method4()
	{
		driver.close();
	}
	
	@When("^enter userid with \"(.*)\" value$")
	public void method5(String u) throws Exception
	{
		lp.filluid(u);
		Thread.sleep(5000);
	}
	
	@And("^Click next button$")
	public void method6() throws Exception
	{
		lp.clickuidnext();
		Thread.sleep(5000);
	}
	@Then("^validate userid field with \"(.*)\"$")
	public void method7(String c)
	{
		if(c.equalsIgnoreCase("valid")&&logp.pwd.isDisplayed())
		{
			s.write("Valid uid test was passed");
		}
		else if(c.equalsIgnoreCase("blank")&&lp.invaliduiderr.isDisplayed())
		{
			s.write("Blank uid test passed");
		}
		else if (c.equalsIgnoreCase("invalid")&&lp.invaliduiderr.isDisplayed())
		{
			s.write("Invalid uid test passed");
		}
		else
		{
			byte[] src=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			s.embed(src,"Title tet failed");
			Assert.fail();
		}
	}
	@And("^enter password with \"(.*)\" value$")
	public void method8(String p) throws Exception
	{
		logp.fillpwd(p);
		Thread.sleep(5000);
	}
	@And("^click password next button$")
	public void method9() throws Exception
	{
		logp.clickpwdnext();
		Thread.sleep(5000);
	}
	@And("^Validate password with \"(.*)\" criteria$")
	public void method10(String c)
	{
		if(c.equalsIgnoreCase("valid")&&mb.comp.isDisplayed())
		{
			s.write("valid pwd test passed");
		}
		else if(c.equalsIgnoreCase("blank")&&logp.blankpwderr.isDisplayed())
		{
			s.write("Blank password test password");
		}
		else if(c.equalsIgnoreCase("invalid")&&logp.invalidpwderr.isDisplayed())
		{
			s.write("invalid pwd tet passed");
		}
		else
		{
			byte[] src=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			s.embed(src,"Title tet failed");
			Assert.fail();
		}
	}
}
