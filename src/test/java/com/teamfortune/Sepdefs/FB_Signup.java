package com.teamfortune.Sepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.teamfortune.PageObjectModel.FB_SignupPOM;

import cucumber.api.java.en.*;

public class FB_Signup {

	WebDriver driver;

	@Given("^launch FB URL$")
	public void launch_FB_URL() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	}

	@When("^user click on create new account button$")
	public void user_click_on_create_new_account_button() throws Throwable {
		FB_SignupPOM sup = new FB_SignupPOM(driver);
		sup.click_newacc().click();
	}

	@When("^user type \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_type_and_and_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		FB_SignupPOM sup = new FB_SignupPOM(driver);
		sup.edit_fname().sendKeys(arg1);
		sup.edit_lname().sendKeys(arg2);
		sup.edit_email().sendKeys(arg3);
		 sup.edit_reemail().sendKeys(arg3);
		sup.edit_npass().sendKeys(arg4);

	}

	@When("^user select dropdown Month and dropdown Day and dropdown Year$")
	public void user_select_dropdown_Month_and_dropdown_Day_and_dropdown_Year() throws Throwable {

	}

	@When("^user select gender and click on signup button$")
	public void user_select_gender_and_click_on_signup_button() throws Throwable {

	}

	@Then("^user will get virification code$")
	public void user_will_get_virification_code() throws Throwable {

	}

}
