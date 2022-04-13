package com.test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.pages.OperatorPage;
import com.pages.UsersPage;

public class operatorTest extends TestBase{
	//WebDriver driver;
	LoginPage lp= null;
	DashboardPage dp=null;
	UsersPage up=null;
	OperatorPage op=null;
	
	
	@BeforeMethod
	public void intialisation1(){
		intialisation();
		//driver.get("file:///E:/selenium/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/operators.html");
		op=new LoginPage(driver).validLogin().clickOperator();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS );
	}
	@AfterMethod
	public void tearDown(){
		
		driver.quit();
}
	@Test
	public void webTablehandlimg(){
		op.webTablehandling();
	}
	@Test
	public void CheckWhatasppContactOnly(){
		op.onlyWhatsappContact();
	}
	@Test
	public void checkcontact(){
		op.onlyWhatsappSmsEmailContact();
	}
	@Test
	public void technnicalWord(){
		op.onlyTechanicalperson();
	}
	

}
