package com.nexttechitc.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebooksignupPOM {
WebDriver driver;

public FacebooksignupPOM(WebDriver driver) {
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
WebElement Type_mobilenumber;
public WebElement mobilenumber() {
	return Type_mobilenumber;
}

@FindBy(name="reg_passwd__")
WebElement Type_newpassword;
public WebElement newpassword() {
	return Type_newpassword;
}


    
   @FindBy(name="birthday_month")
public WebElement click_month;
    
      
 @FindBy(id="day")
public WebElement click_day;
        
        
 @FindBy(name="birthday_year")
public WebElement click_year;

 @FindBy(name="sex")
 WebElement Click_female;
 public WebElement female() {
	 return Click_female;
 }

 @FindBy(name="websubmit")
 WebElement Click_signup;
 public WebElement signup() {
	 return Click_signup;
 }
}
