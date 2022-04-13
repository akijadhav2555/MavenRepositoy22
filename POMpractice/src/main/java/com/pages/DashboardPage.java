package com.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class DashboardPage extends BaseClass {
	WebDriver dpdriver;

	public DashboardPage(WebDriver driver) {
		super();
		this.dpdriver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//h3[text()='Selenium']//following::a[text()='More info ']")
	List<WebElement> links;
	@FindBy(xpath="//span[text()='Operators']")
	WebElement operators;
	@FindBy(xpath="//span[text()='     Useful Links']")
	WebElement usefulLinks;
	@ FindBy(xpath="//span[text()='Downloads']")
	WebElement Downloads;
	@FindBy (xpath="//h1")
	WebElement heading;
	 @FindBy(xpath="//span[contains(text(),'Users')]")
	 WebElement users;
	 @FindBy(xpath="//span[text()='Logout']")
	 WebElement logout;
	 @FindBy(xpath="//a[text()='More info ']")
	 List<WebElement> moreinfo;
	 
     
	 public UsersPage clickUsers(){
		 click(users);
		 return new UsersPage(dpdriver);
  		 
	 }
	 public OperatorPage clickOperator(){
		 click(operators);
		 return new OperatorPage(dpdriver);
		 
		 
	 }
	 public UsefulLinks clickUsefulLinks(){
		 click(usefulLinks);
		 return new UsefulLinks(dpdriver);
		 
	 }
	 public DownloadPage clickDownloadPage(){
		 click(Downloads);
		 return new DownloadPage(dpdriver);
		 
	 }
	 public Logout clickLogoutpage(){
		 click(logout);
		 return new Logout(dpdriver);
		 
	 }
	 public String checkHeading(){
		 return getText(heading);
		 
	 }
	 public void moreInfoLinks(){
		 windowHandles(moreinfo,dpdriver);
	 }
	 
	 
	 
	 
}
