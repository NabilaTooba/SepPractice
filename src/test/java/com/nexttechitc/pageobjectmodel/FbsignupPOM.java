package com.nexttechitc.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbsignupPOM {
WebDriver driver;

public FbsignupPOM(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
	
@FindBy(name="firstname")	
	WebElement Type_firstname;
public WebElement firstname() {
	return Type_firstname;
}
@FindBy(name="lastname")	
	WebElement Type_lastname;
public WebElement lastname() {
	return Type_lastname;
}
	
	@FindBy(name="reg_email__")
	WebElement Type_email;
	public WebElement email() {
		return Type_email;
	}
	
@FindBy(name="reg_email_confirmation__")	
	WebElement Type_reemail;
public WebElement reemail() {
	return Type_reemail;
}
	
@FindBy(name="reg_passwd__")	
	WebElement Type_password;
public WebElement password() {
	return Type_password;
}

@FindBy(name="birthday_day")
public WebElement Click_day;

@FindBy(id="month")
public WebElement Click_month;

@FindBy(id="year")
public WebElement Click_year;

@FindBy(name="sex")
	WebElement Click_Female;
public WebElement female() {
	return Click_Female;
}

@FindBy(name="websubmit")
public WebElement Click_signup;




}
