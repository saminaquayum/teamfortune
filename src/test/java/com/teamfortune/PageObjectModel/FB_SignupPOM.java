package com.teamfortune.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB_SignupPOM {

	WebDriver driver;

	public FB_SignupPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='Create new account']")
	WebElement click_newacc;

	public WebElement click_newacc() {
		return click_newacc;

	}

	@FindBy(name = "firstname")
	WebElement edit_fname;

	public WebElement edit_fname() {
		return edit_fname;

	}

	@FindBy(name = "lastname")
	WebElement edit_lname;

	public WebElement edit_lname() {
		return edit_lname;

	}

	@FindBy(xpath = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input")
	WebElement edit_email;

	public WebElement edit_email() {
		return edit_email;

	}

	@FindBy(xpath = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[3]/div/div/div[1]/input")
	WebElement edit_reemail;

	public WebElement edit_reemail() {
		return edit_reemail;

	}

	@FindBy(id = "password_step_input")
	WebElement edit_npass;

	public WebElement edit_npass() {
		return edit_npass;

	}
}
