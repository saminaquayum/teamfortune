package com.teamfortune.Sepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.teamfortune.PageObjectModel.Dell_CloudSolutionsPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dell_CloudSolutions {
	WebDriver driver;
	
	@Given("^launch URL$")
	public void launch_URL() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://www.dell.com/en-us");
	    Thread.sleep(2000);
	}
	
	
	

	@When("^user go to Solutions menu and mouse over cloud Solutions$")
	public void user_go_to_Solutions_menu_and_mouse_over_cloud_Solutions() throws Throwable {
	    
		Actions sl = new Actions(driver);
		
		Dell_CloudSolutionsPOM dsl = new Dell_CloudSolutionsPOM(driver);
		
		sl.moveToElement(dsl.mo_solutions()).build().perform();
		
		sl.moveToElement(dsl.mo_cloudsolutions()).build().perform();
		 Thread.sleep(2000);
		
		
	}

	@Then("^user click Apex cloud services$")
	public void user_click_Apex_cloud_services() throws Throwable {
		Dell_CloudSolutionsPOM dsl = new Dell_CloudSolutionsPOM(driver);
		dsl.mo_apexsolutions().click();
	    
	}

	@Then("^user  able to redirect to that page$")
	public void user_able_to_redirect_to_that_page() throws Throwable {
		
		Dell_CloudSolutionsPOM dsl = new Dell_CloudSolutionsPOM(driver);
	    dsl.apexsolutions_page();
	    driver.quit();
	}


	
	

}
