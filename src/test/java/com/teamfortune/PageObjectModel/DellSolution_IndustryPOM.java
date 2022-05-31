package com.teamfortune.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellSolution_IndustryPOM {
	WebDriver driver;

	public DellSolution_IndustryPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[3]/a")  //@FindBy(xpath="  ")
	WebElement mouseover_solutions;

	public WebElement mouseover_solutions() {
		return mouseover_solutions;
		
		//return mouseover_solutions;

	}

	@FindBy(xpath = "//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[3]/ul/li[7]")
	WebElement mouseover_indsolutions;

	public WebElement mouseover_indsolutions() {
		return mouseover_indsolutions;
	}

	@FindBy(xpath = "//a[text()=\"View All Industry Solutions\"]")
	WebElement mouseover_allindsolutions;

	public WebElement mouseover_allindsolutions() {
		return mouseover_allindsolutions;
	}

	@FindBy(xpath = "//h1[text()=\"Solutions Portfolio\"]")
	WebElement pageDisplay;

	public WebElement pageDisplay() {
		return pageDisplay;
	}

}