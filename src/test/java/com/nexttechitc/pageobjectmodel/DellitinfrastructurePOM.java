package com.nexttechitc.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellitinfrastructurePOM {
	
WebDriver driver;

public  DellitinfrastructurePOM(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
	
@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/button/span")
WebElement act_itinfrastructure;
	public WebElement itinfrastructure() {
		return act_itinfrastructure;
	}
	
@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[7]/a")
	WebElement click_Developers;
public WebElement Developers() {
	return click_Developers;
}
	
	
	
	
	
	
	
	
}
