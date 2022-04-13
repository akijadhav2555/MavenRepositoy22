package com.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class AddUser extends BaseClass {
	WebDriver audriver;

	public AddUser(WebDriver driver) {
		super();
		this.audriver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[1]/div/input")
	WebElement uname;
	@FindBy(xpath="/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[2]/div/input")
	WebElement mobile;
	@FindBy(xpath="/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[3]/div/input")
	WebElement email;
	@FindBy(xpath="/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[4]/div/input")
	WebElement courses;
	@FindBy(xpath="//input[@name='gender']")
	List<WebElement>radios;
	@FindBy(xpath="//select")
	WebElement path;
	@FindBy(xpath="/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[7]/div/input")
	WebElement password;
	@FindBy(xpath="/html/body/div/div[1]/section[2]/div/div/div/form/div[2]/button")
	WebElement submit;
	@FindBy(xpath="/html/body/div/div[1]/section[2]/div/div/div/form/div[3]/div/input")
	WebElement Frdmono;
	public void addUsers() throws Exception{
	uname.sendKeys("Akshay");
	mobile.sendKeys("7709941990");
	email.sendKeys("akijadhav2555@gmail.com");
	courses.sendKeys("Selenium/java");
	radiobuttons(radios, "Male");
	Thread.sleep(3000);
	selectClass(path, "HP");
	password.sendKeys("123456");
	Frdmono.sendKeys("7972080593");
	submit.click();
	}

}
