package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class UsefulLinks extends BaseClass {
	WebDriver uldriver;

	public UsefulLinks(WebDriver driver) {
		super();
		this.uldriver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//span[text()='Go !']")
			List<WebElement>links;
	
	@FindBy(tagName="tr")
			List<WebElement>rows;
	
	
	@FindBy (xpath="/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td")
	List<WebElement> cols;
	public void contentcheck(){   
		int row=rows.size();
		int count=0;
		
		for (int r=2;r<=row;r++){
			
			String value= uldriver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+r+"]/td[1]")).getText();
			//System.out.println(value);
			if (value.equals("04")){
				String name= uldriver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+r+"]/td[2]")).getText();
				System.out.println("The 4 no content is >>"+name);
				count++;
			}
			
			
		}
		//System.out.println("The only whatsapp users>>"+count);
	
	}
	public void windowHandles(){
		windowHandles(links, uldriver);
	}
	
}
