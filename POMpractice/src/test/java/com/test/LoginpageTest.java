package com.test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.pages.UsersPage;


public class LoginpageTest extends TestBase{
	//WebDriver driver;
	LoginPage lp= null;
	DashboardPage dp=null;
	UsersPage up=null;
	
	
	@BeforeSuite
	public void intialisation1(){
		intialisation();
		driver.get(" file:///E:/selenium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		 lp= new LoginPage(driver);
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	@AfterSuite
	public void tearDown(){
		
		driver.quit();
}
	
	@Test(priority=1)
	public void testPage(){
		 lp=new LoginPage(driver);
		 dp=lp.validLogin();
		   up=dp.clickUsers();
		  System.out.println(up.getClass()); 
		  Assert.assertEquals(driver.getTitle(), "JavaByKiran | User");
		  
		 }
	@ Test(priority=2)
	public void checkLogin(){
	
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
	
	
	
	

}
