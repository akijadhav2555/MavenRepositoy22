package com.test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.pages.OperatorPage;
import com.pages.UsefulLinks;
import com.pages.UsersPage;

public class UsefulLinkTest extends TestBase {
	//WebDriver driver;
	LoginPage lp= null;
	DashboardPage dp=null;
	UsersPage up=null;
	OperatorPage op=null;
	UsefulLinks ul=null;
	
	
	@BeforeMethod
	public void intialisation1(){
		 intialisation();
		//driver.get("file:///E:/selenium/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/links.html");
		ul=new LoginPage(driver).validLogin().clickUsefulLinks();
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS );
	}
	@AfterMethod
	public void tearDown(){
		
		driver.quit();
}
	@Test
	public void windowHandles(){
		ul.windowHandles();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Useful Links");
		
	}
	@Test
	public void contentcheck(){
		ul.contentcheck();
	}

}
