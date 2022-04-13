package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class DownloadPage extends BaseClass {
	WebDriver dlpdriver;

	public DownloadPage(WebDriver driver) {
		super();
		this.dlpdriver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Official Website']")
	List<WebElement>links;
	

@FindBy(tagName="tr")
	List<WebElement>rows;


@FindBy (xpath="/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td")
List<WebElement> cols;
public void contentcheck(){   
int row=rows.size();
int count=0;

for (int r=2;r<=row;r++){
	
	String value= dlpdriver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+r+"]/td[3]")).getText();
	//System.out.println(value);
	if (value.contains("Selenium")){
		String name= dlpdriver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+r+"]/td[1]")).getText();
		System.out.println("The selenium is on the number of >>"+name);
		count++;
	}
	
	
}
System.out.println("Total no of selenium vendors>>"+count);

}
public void windowHandles(){
windowHandles(links, dlpdriver);
}

	
	
	

}
