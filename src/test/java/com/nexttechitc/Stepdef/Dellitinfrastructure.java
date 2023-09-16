package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechitc.pageobjectmodel.DellitinfrastructurePOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Dellitinfrastructure {
WebDriver driver;
	@Given("^User visit Dell homepage$")
	public void user_visit_Dell_homepage() throws Throwable {
	    //how to open the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tabas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		//how to open the URL
		driver.get("https://www.dell.com/en-au");
		//how to max windows
		driver.manage().window().maximize();
		}

	@When("^User go to the dellinfrastructure dropdown menu and able to see the result$")
	public void user_go_to_the_dellinfrastructure_dropdown_menu_and_able_to_see_the_result() throws Throwable {
	    
		Actions act=new Actions(driver);
		 DellitinfrastructurePOM obj=new  DellitinfrastructurePOM(driver);
		act.moveToElement(obj.itinfrastructure()).build().perform();
		obj.Developers().click();
		
		
	}
	
	
}
