package com.nexttechitc.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class project1POM {

WebDriver driver;	
	
	public project1POM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="non-users-notice-link")
	public WebElement click_Learnmore;
	
	@FindBy(id="terms-link")
	public WebElement click_Terms;
	
	@FindBy(id="privacy-link")
	public WebElement click_Privacypolicy;
	
	@FindBy(id="cookie-use-link")
	public WebElement click_cookiespolicy;
	
	@FindBy(xpath="//*[@id=\"reg_form_box\"]/div[12]/a")
	public WebElement click_Alreadyhaveanaccount;
	
	
}
