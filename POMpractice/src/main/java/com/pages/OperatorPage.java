package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class OperatorPage {
	WebDriver opdriver;

	public OperatorPage(WebDriver driver) {
		super();
		this.opdriver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(tagName="tr")
	List<WebElement>rows;
	@FindBy (xpath="/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th")
	List<WebElement> cols;
	
	
	public void webTablehandling(){
		int row=rows.size();
		int col=cols.size();
		
		for (int r=2;r<=row;r++){
			for (int c=1;c<=col;c++){
			String vlue= opdriver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+r+"]/td["+c+"]")).getText();
			System.out.print(vlue+"    ");
			}
			System.out.println();
		}
	

}
	
	public void onlyWhatsappContact(){   
		int row=rows.size();
		int count=0;
		
		for (int r=2;r<=row;r++){
			
			String value= opdriver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+r+"]/td[4]")).getText();
			if (value.contains("Whats App Only")){
				String name= opdriver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+r+"]/td[2]")).getText();
				System.out.println("Whats App only contain only this person>>"+name);
				count++;
			}
			
			
		}
		System.out.println("The only whatsapp users>>"+count);
	
	}
	public void onlyWhatsappSmsEmailContact(){   
		int row=rows.size();
		int count=0;
		
		for (int r=2;r<=row;r++){
			
			String value= opdriver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+r+"]/td[4]")).getText();
			
			if (value.equals("Whats App Phone Call SMS eMail")){
				String name= opdriver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+r+"]/td[2]")).getText();
				System.out.println("Whats App phone call sms email contain only this person>>"+name);
				count++;
			}
			
			
		}
		System.out.println("All contact users>>"+count);
	
	}public void onlyTechanicalperson(){   
		int row=rows.size();
		int count=0;
		
		for (int r=2;r<=row;r++){
			
			String value= opdriver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+r+"]/td[3]")).getText();
			
			if (value.contains("Technical")){
				String name= opdriver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+r+"]/td[2]")).getText();
				System.out.println("Call for these techacical person for technical query >>"+name);
				String timing=opdriver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+r+"]/td[6]")).getText();
				System.out.println("Call for these techacical person timing and day >>"+timing);
				String number=opdriver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+r+"]/td[5]")).getText();
				System.out.println("the number for these person"+number);
				count++;
				
			}
			System.out.println("..........................................................");
			
		}
		System.out.println("All contact techanical person>>"+count);
	
	}
	
	}
