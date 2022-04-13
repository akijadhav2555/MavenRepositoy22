package com.test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.AddUser;
import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.pages.OperatorPage;
import com.pages.UsersPage;

public class AddUserTest extends TestBase {
//	WebDriver audriver;
	LoginPage lp= null;
	DashboardPage dp=null;
	UsersPage up=null;
	OperatorPage op=null;
	AddUser ap=null;
	
	
	@BeforeMethod
	public void intialisation1(){
	intialisation();
		driver.get("file:///E:/selenium/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/add_user.html");
		ap=new AddUser(driver);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void tearDown(){
		
		driver.quit();
}
	@Test
	public void adduser() throws Exception{
		ap.addUsers();
		String ss=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		Assert.assertEquals(ss, "User Added Successfully. You can not see added user.");
	}
}
