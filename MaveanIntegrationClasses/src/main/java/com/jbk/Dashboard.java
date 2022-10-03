package com.jbk;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

import com.Test.LoginPageTest;

public class Dashboard {
	
	WebDriver driver;
	
	@FindBy(xpath="//li[3]/a")
	WebElement users;
	
	@FindBy(xpath="//tr[2]/td[8]/a/span")
	WebElement delete;
		
	public Dashboard(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void moveToClick(){
		users.click();
		/*Actions ac=new Actions(driver);
		ac.moveToElement(users).click().build().perform();*/
	}
	
	public void Delete(){
		delete.click();
	}
 
}
