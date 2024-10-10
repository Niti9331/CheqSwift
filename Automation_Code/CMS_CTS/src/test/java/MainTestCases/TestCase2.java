package MainTestCases;

//CONNECTED WITH SUPERADMIN_LOGIN-

import org.testng.Assert;
import org.testng.annotations.Test;

//CONNECTED WITH SUPERADMIN_LOGIN



import TestCases.SuperAdmin_Login;

public class TestCase2 extends genericLib.BaseClass{
	@Test
	public void TC() throws InterruptedException {
		SuperAdmin_Login test=new SuperAdmin_Login(driver);	
	    test.cc();
	    test.Submit();
	    test.LoginID();
	    test.Password();
	    test.LoginBtn();
	    Thread.sleep(5000);
	    System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        String ActualTitle=driver.getTitle();
	    String ExpectedTitle = "SuperAdmin Dashboard";
	    Assert.assertEquals(ExpectedTitle, ActualTitle);
        Thread.sleep(20000);
	    test.Customers();
        
        }
}
