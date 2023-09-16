package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.nexttechitc.pageobjectmodel.FbsignupPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Fbsignup {
WebDriver driver;

@Given("^user visits fb signup page$")
public void user_visits_fb_signup_page() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\tabas\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("https://www.facebook.com/signup");
	   Thread.sleep(3000);
	   driver.manage().window().maximize();
}

@When("^user types \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" , retype \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_types_retype_and(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
	FbsignupPOM obj=new FbsignupPOM(driver);
	obj.firstname().sendKeys(arg1);
	obj.lastname().sendKeys(arg2);
	obj.email().sendKeys(arg3);
	obj.reemail().sendKeys(arg4);
	obj.password().sendKeys(arg5);
	
}

@When("^User select  Month and  Day and Year$")
public void user_select_Month_and_Day_and_Year() throws Throwable {
	FbsignupPOM obj2=new FbsignupPOM(driver);
	Select Day=new Select(obj2.Click_day);
	Day.selectByValue("13");
	Thread.sleep(3000);
	Select month=new Select(obj2.Click_month);
	month.selectByIndex(11);
	Thread.sleep(3000);
	Select year= new Select(obj2.Click_year);
	year.selectByVisibleText("1990");
	Thread.sleep(3000);
	}

@When("^user click gender$")
public void user_click_gender() throws Throwable {
	FbsignupPOM obj3=new FbsignupPOM(driver);
	obj3.female().click();
	
}

@When("^User click on Signup button$")
public void user_click_on_Signup_button() throws Throwable {
	FbsignupPOM obj4=new FbsignupPOM(driver);
            obj4.Click_signup.click();
}
@Then("^User will able to go SignUp page$")
public void user_will_able_to_go_SignUp_page() throws Throwable {
    Thread.sleep(5000);
    driver.close();
}

}
