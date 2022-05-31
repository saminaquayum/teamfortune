package com.teamfortune.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_LoginPOM {
	WebDriver driver;

	public Facebook_LoginPOM (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

}
	
	@FindBy(id="email")
	WebElement type_email;

	public WebElement type_email() {
		return type_email;
		
	}
	
	
	@FindBy(id="pass")
	WebElement type_password;

	public WebElement type_password() {
		return type_password;
		
	}
	
	
	@FindBy(xpath = "//button[text()=\"Log In\"]")
	WebElement click_loginbutton;

	public WebElement click_loginbutton() {
		return click_loginbutton;
		
	}
	
	
	@FindBy(xpath = "//span[text()=\"Sharif Fahmi\"]")
	WebElement verify_Page;

	public WebElement verify_Page() {
		return verify_Page;
		
	}
	
	
	
	
	
	
	
	
}




