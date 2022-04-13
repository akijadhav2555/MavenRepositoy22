package com.test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.pages.OperatorPage;
import com.pages.UsersPage;

public class UserpgeTest extends TestBase {
	//WebDriver driver;
	LoginPage lp= null;
	DashboardPage dp=null;
	UsersPage up=null;
	OperatorPage op=null;
	
	
	@BeforeClass
	public void intialisation1 (){
	intialisation();
		//driver.get("file:///E:/selenium/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/users.html");
		up=new LoginPage(driver).validLogin().clickUsers();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	@AfterClass
	public void tearDown(){
		
		driver.quit();
}
	@Test
	public void webtblehndling(){
		up.webTablehandling();
	}
	@Test
	public void webTableHandling1(){
		up.courseChecking("monica");
	}
	@Test
	public void genderChecking(){
		up.GenderChecking("Male");
	}
	@Test 
	public void popuphandling(){
		up.popuphandling();
	}


}
