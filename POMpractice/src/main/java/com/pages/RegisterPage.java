package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver rpdriver;

	public RegisterPage(WebDriver driver) {
		super();
		this.rpdriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	

}
