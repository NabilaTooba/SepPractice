package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.nexttechitc.pageobjectmodel.FacebooksignupPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebooksignup {
WebDriver driver;
	@Given("^User visit Facebook Signup home page$")
	public void user_visit_Facebook_Signup_home_page() throws Throwable {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\tabas\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("https://www.facebook.com/signup");
	   Thread.sleep(3000);
	   driver.manage().window().maximize();
	}

	@When("^User type \"([^\"]*)\" ,\"([^\"]*)\",\"([^\"]*)\"and \"([^\"]*)\"$")
	public void user_type_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
	    
		FacebooksignupPOM signup=new FacebooksignupPOM(driver);
		signup.firstname().sendKeys(arg1);
		signup.lastname().sendKeys(arg2);
		signup.mobilenumber().sendKeys(arg3);
		signup.newpassword().sendKeys(arg4);
	}


@Then("^User select dropdown Month and dropdown Day and dropdown Year$")
public void user_select_dropdown_Month_and_dropdown_Day_and_dropdown_Year() throws Throwable {
	FacebooksignupPOM obj=new FacebooksignupPOM(driver);
	Select dropdown=new Select (obj.click_month);
	dropdown.selectByIndex(10);
	Thread.sleep(3000);
	Select dropdown1=new Select (obj.click_day);
	dropdown1.selectByValue("26");
	Thread.sleep(3000);
	Select dropdown2=new Select (obj.click_year);
	dropdown2.selectByVisibleText("2021");
	Thread.sleep(3000);
     }
	@Then("^user click gender and signup$")
	public void user_click_gender_and_signup() throws Throwable {
	    
		FacebooksignupPOM obj1=new FacebooksignupPOM (driver);
	obj1.female().click();
	obj1.signup().click();
	}

	
}
