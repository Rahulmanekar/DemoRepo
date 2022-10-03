package com.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jbk.Dashboard;
import com.jbk.LoginPage;

public class DashboardTest extends LoginPageTest {
	LoginPageTest lpt;
	Dashboard db;
	
	@BeforeClass
	public void login(){
		lpt=new LoginPageTest();
	}
	
	@Test(priority=1)
	public void checkUsers(){
		db=new Dashboard(driver);
		db.moveToClick();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | User");
	}
	
	@Test(priority=2)
	public void Delete(){
		db.Delete();
	}
	

}
