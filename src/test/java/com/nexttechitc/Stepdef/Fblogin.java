package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.pageobjectmodel.FbloginPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Fblogin {

WebDriver driver;	
	@Given("^user visits Fb Login page$")
	public void user_visits_Fb_Login_page() throws Throwable {
	    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tabas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get("https://www.facebook.com/login/");
		   Thread.sleep(3000);
		   driver.manage().window().maximize();
		}

	@When("^user types \"([^\"]*)\" and \"([^\"]*)\" and user click on Login button$")
	public void user_types_and_and_user_click_on_Login_button(String arg1, String arg2) throws Throwable {
	    
		FbloginPOM obj =new FbloginPOM(driver);
		obj.email().sendKeys(arg1);
		Thread.sleep(3000);
		obj.password().sendKeys(arg2);
		Thread.sleep(3000);
		obj.login().click();
		Thread.sleep(3000);
	}

	@Then("^User will be directed to Facebook account page$")
	public void user_will_be_directed_to_Facebook_account_page() throws Throwable {
	    
	}

	
}
