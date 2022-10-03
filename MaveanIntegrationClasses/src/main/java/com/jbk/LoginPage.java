package com.jbk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//button")
	WebElement loginbtn;
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void correctData(){
		email.sendKeys("kiran@gmail.com");
		password.sendKeys("123456");
		loginbtn.click();
		
	}

	

}
