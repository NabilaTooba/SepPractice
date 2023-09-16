package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.pageobjectmodel.BestsellerPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazonbestseller {
WebDriver driver;

	@Given("^User visit Amazon home page$")
	public void user_visit_Amazon_home_page() throws Throwable {
	    //how to open browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tabas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		// how to open the URL
		driver.get("https:/www.amazon.com/");
		Thread.sleep(3000);
		// how to mzx window
		driver.manage().window().maximize();
		
	}

	@When("^User clicks on Amazon bestseller$")
	public void user_clicks_on_Amazon_bestseller() throws Throwable {
	   
	BestsellerPOM bestseller=new BestsellerPOM(driver);	
		bestseller.bestseller().click();
	}

	@Then("^User should be able to redirect the bestseller page$")
	public void user_should_be_able_to_redirect_the_bestseller_page() throws Throwable {
	   
	}
	
}
