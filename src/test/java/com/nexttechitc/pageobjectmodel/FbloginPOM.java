package com.nexttechitc.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbloginPOM {

	WebDriver driver;
	
	public FbloginPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(name="email")
	WebElement Type_email;
	public WebElement email() {
		return Type_email;
	}
	
	
	@FindBy(name="pass")
	WebElement Type_password;
	public WebElement password() {
		return Type_password;
	}
	
	@FindBy(name="login")
	WebElement Click_login;
	public WebElement login() {
		return Click_login;
	}
	
	
	
	
}
