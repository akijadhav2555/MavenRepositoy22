package com.base;

import java.util.List;
import java.util.Set;

import javax.swing.text.html.Option;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	WebDriver driver ;
	public void click(WebElement ele){
		ele.click();
	}
	public void sendKeys(WebElement ele, String value){
		ele.clear();
		ele.sendKeys(value);
	}
	public void radiobuttons (List<WebElement>radios,String value){
		for(WebElement radio: radios){
			if (radio.getAttribute("value").equalsIgnoreCase(value)){
				radio.click();
			}
		}
		
	}
	public void checkboxes(List<WebElement>checkboxes,List<String>hobbies){
	for(WebElement checkbox :checkboxes){
		for (String hobby:hobbies){
			if(checkbox.getAttribute("value").equalsIgnoreCase("hobby")){
				checkbox.click();
			}
		}
	}
	}
	public boolean checkLink(WebElement ele){
		return ele.isEnabled();
		
	}
	public boolean checkLogo(WebElement ele)
	{
		return ele.isDisplayed();
	}
	public String getText(WebElement ele){
		return ele.getText();
		
	}
	public void windowHandles(List<WebElement>links,WebDriver lpdriver){
		//driver= new ChromeDriver();
		String ss=lpdriver.getWindowHandle();
		System.out.println(ss);
		
		for(WebElement link :links){
			link.click();
			Set<String>windows=lpdriver.getWindowHandles();
			for(String window:windows ){
				lpdriver.switchTo().window(window);
				if(!ss.equals(window)){
					lpdriver.close();
					
				}
				
			}

			lpdriver.switchTo().window(ss);
			 
		}
		
	}
	public void selectClass(WebElement ele,String value){
		Select sc=new Select(ele);
		sc.selectByVisibleText(value);
	}

}
