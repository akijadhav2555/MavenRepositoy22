package com.pages;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
	WebDriver updriver;

	public UsersPage(WebDriver driver) {
		super();
		this.updriver=driver;
		PageFactory.initElements(driver, this);
		
		// TODO Auto-generated constructor stub
	}
	@FindBy(tagName="tr")
	List<WebElement>rows;
	@FindBy (xpath="/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th")
	List<WebElement> cols;
	
	public void webTablehandling(){
		int row=rows.size();
	int col=cols.size();
		
		for (int r=2;r<=row;r++){
			for (int c=1;c<=col;c++){
			String vlue= updriver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+r+"]/td["+c+"]")).getText();
			System.out.print(vlue+"    ");
			}
			System.out.println();
		}
		
		
	}
	public void courseChecking(String name){
		int row=rows.size();
	int col=cols.size();
	String sagar=null;
		
		for (int r=2;r<=row;r++){
			
			String vlue= updriver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+r+"]/td[2]")).getText();
			if (vlue.equalsIgnoreCase(name)){
				 sagar=updriver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+r+"]/td[5]")).getText();
				
			
			
			}
			
		}
		System.out.println(name+" is registered for the course is>> "+sagar);
		
	}
	public void GenderChecking(String gender){
		int row=rows.size();
	int col=cols.size();
	int count=0;
		
		for (int r=2;r<=row;r++){
			for (int c=1;c<=col;c++){
			String vlue= updriver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+r+"]/td["+c+"]")).getText();
			if (vlue.startsWith(gender)){
				 count++;
				
			}
			
			}
			
		}
		System.out.println("Total no of "+ gender+"  candiate is >> "+count);
		//System.out.println("Total no of male candidate>>"+(row-count));
		
	}
	public void popuphandling(){
		int row=rows.size();
		int col=cols.size();
		
			
			for (int r=2;r<=row;r++){
				
				List<WebElement>links= updriver.findElements(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+r+"]/td[8]"));
				for(WebElement link :links){
					link.click();
					String ss=updriver.switchTo().alert().getText();
					System.out.println(ss);
					updriver.switchTo().alert().dismiss();
					
				
				
				}
				
			}
			 
			//System.out.println("Total no of male candidate>>"+(row-count));
		
	}
	
	
	
	
	
}


