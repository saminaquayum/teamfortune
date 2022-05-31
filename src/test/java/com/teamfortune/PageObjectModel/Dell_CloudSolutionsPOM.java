package com.teamfortune.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dell_CloudSolutionsPOM {
	WebDriver driver;
	
	
	public Dell_CloudSolutionsPOM(WebDriver driver) {
		  this.driver = driver;
		  PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[3]/a/span")
	WebElement mo_solutions;
	public WebElement mo_solutions() {
		return mo_solutions;
	

	}
	
	
	
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[3]/ul/li[4]/a")
	WebElement mo_cloudsolutions;
	public WebElement mo_cloudsolutions() {
		return mo_cloudsolutions;
		
	
	}
	
	
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[3]/ul/li[4]/ul/li[4]/a")
	WebElement mo_apexsolutions;
	public WebElement mo_apexsolutions() {
		return mo_apexsolutions;
		
	

	}
	
	
	@FindBy(xpath="//h1[text()=\"APEX CLOUD SERVICES\"]")
	WebElement apexsolutions_page;
	public WebElement apexsolutions_page() {
		return apexsolutions_page;
	
		
	

	}
}
