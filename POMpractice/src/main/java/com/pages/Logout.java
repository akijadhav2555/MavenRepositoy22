package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	WebDriver ldriver;

	public Logout(WebDriver driver) {
		super();
		this.ldriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	

}
