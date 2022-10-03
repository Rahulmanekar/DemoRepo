package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jbk.LoginPage;

public class LoginPageTest {
	
	WebDriver driver;
	LoginPage lp;
	
	@BeforeClass
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///E:/setup/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		lp=new LoginPage(driver);
	}
	
	@Test
	public void checkTitleOfDashboard(){
		lp.correctData();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
	

}
