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
import com.pages.DownloadPage;
import com.pages.LoginPage;
import com.pages.OperatorPage;
import com.pages.UsersPage;

public class DownloadPageTest extends TestBase {
//	WebDriver driver;
	LoginPage lp= null;
	DashboardPage dp=null;
	
	DownloadPage dlp =null;
	
	
	@BeforeMethod
	public void intialisation1(){
		intialisation();
		//driver.get("file:///E:/selenium/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/downloads.html");
		dlp=new LoginPage(driver).validLogin().clickDownloadPage();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS );
	}
	@AfterMethod
	public void tearDown(){
		
		driver.quit();
}
	@Test
	public void seleniumCountCheck(){
		dlp.contentcheck();
	}
	@Test
	public void  windowhandle(){
		dlp.windowHandles();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Downloads");
	}

}
