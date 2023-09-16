package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.pageobjectmodel.project1POM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class project1 {

	WebDriver driver;
	
	@Given("^User visit facebook homepage$")
	public void user_visit_facebook_homepage() throws Throwable {
	    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tabas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get("https://www.facebook.com/signup");
		   Thread.sleep(3000);
		   driver.manage().window().maximize();
	}

	@When("^User click Learn more, Terms, Privacy policy,cookies policy and Already have an account$")
	public void user_click_Learn_more_Terms_Privacy_policy_cookies_policy_and_Already_have_an_account() throws Throwable {
	    
		project1POM obj=new project1POM (driver);
		obj.click_Learnmore.click();
		Thread.sleep(3000);
		obj.click_Terms.click();
		Thread.sleep(3000);
		obj.click_Privacypolicy.click();
		Thread.sleep(3000);
		obj.click_cookiespolicy.click();
		Thread.sleep(3000);
		obj.click_Alreadyhaveanaccount.click(); 
		Thread.sleep(3000);
		
	}

	@Then("^User should be able to redirect to respective page\\.$")
	public void user_should_be_able_to_redirect_to_respective_page() throws Throwable {
	    
	}

	
	
}
