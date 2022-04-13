package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPage extends BaseClass {
	WebDriver lpdriver;
	public LoginPage(WebDriver driver) {
		super();
		this.lpdriver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	WebElement uname;
	@FindBy(id="password")
	WebElement password;
	@FindBy(xpath="//button")
	WebElement submit;
	/*@FindBy(xpath="//a[@class='text-center']")
	WebElement link;*/
	@FindBy(xpath="//img")
	WebElement logo;
	@FindBy(xpath="//a[text()='Register a new membership']")
	WebElement link;
	public void EnterCredentilForLogin(String nme,String pwd){
		sendKeys(uname, nme);
		sendKeys(password, pwd);
		click(submit);
		
		
		
		
	}
	public boolean checkLink(){
		
		return checkLink(link);
		
		
	}
	public boolean CheckLogo(){
		return checkLogo(logo);
	}
	public DashboardPage validLogin(){
		uname.sendKeys("kiran@gmail.com");
		password.sendKeys("123456");
		submit.click();
		return new DashboardPage(lpdriver);
	}
	public RegisterPage registerpage(){
		click(link);
		return new RegisterPage(lpdriver);
		
		
	}
	
	
	
	
	





}
