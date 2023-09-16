package com.nexttechitc.Stepdef;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechitc.pageobjectmodel.JCPenneyPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class JCPenney {
WebDriver driver;
	@Given("^User visit JCPenney homepage$")
	public void user_visit_JCPenney_homepage() throws Throwable {
		 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tabas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.jcpenney.com/");
		Thread.sleep(3000);
	    driver.manage().window().maximize();
		
	}

	@When("^User go to the JCPenney Baby&Kids dropdown menu and able to see the result$")
	public void user_go_to_the_JCPenney_Baby_Kids_dropdown_menu_and_able_to_see_the_result() throws Throwable {
	    Actions act=new Actions(driver);
	    JCPenneyPOM obj=new JCPenneyPOM(driver);
	    act.moveToElement(obj.Babyanbdkids()).build().perform();
	    }
	
	}
