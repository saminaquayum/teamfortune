package com.teamfortune.Sepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.teamfortune.PageObjectModel.DellSolution_IndustryPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellSolution_Industry {
	WebDriver driver;

	@Given("^user visit dell homepage$")

	public void user_visit_dell_homepage() throws Throwable {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.dell.com/en-us");
			Thread.sleep(2000);
		} catch (Exception e) {

		}
	}

	@When("^user go to solutions menu and mouse over industry solutions$")
	public void user_go_to_solutions_menu_and_mouse_over_industry_solutions() throws Throwable {
		try {
			Actions mo = new Actions(driver);
			DellSolution_IndustryPOM obj2 = new DellSolution_IndustryPOM(driver);

			mo.moveToElement(obj2.mouseover_solutions()).build().perform();
			Thread.sleep(2000);

			mo.moveToElement(obj2.mouseover_indsolutions()).build().perform();
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("^user click View All Industry Solutions$")
	public void user_click_View_All_Industry_Solutions() throws Throwable {
		DellSolution_IndustryPOM obj1 = new DellSolution_IndustryPOM(driver);
		obj1.mouseover_allindsolutions().click();
		Thread.sleep(2000);

	}

	@Then("^user able to redirect to the derise page succesfully$")
	public void user_able_to_redirect_to_the_derise_page_succesfully() throws Throwable {

		try {
			DellSolution_IndustryPOM obj3 = new DellSolution_IndustryPOM(driver);
			obj3.pageDisplay();

			driver.quit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
