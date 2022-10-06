package com.Test;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jbk.Dashboard;


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
