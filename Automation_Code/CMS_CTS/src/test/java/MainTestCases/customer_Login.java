package MainTestCases;

//CONNECTED WITH CUSTOMER_LOGIN

import org.testng.Assert;
import org.testng.annotations.Test;
import TestCases.superadmin_Customers;


//CONNECTED WITH SUPERADMIN_CUSTOMERS

public class customer_Login extends genericLib.BaseClass{
	@Test
	public void TC() throws InterruptedException {
		superadmin_Customers test2=new superadmin_Customers(driver);	
	    test2.cc();
	    test2.Submit();
	    test2.LoginID();
	    test2.Password();
	    test2.LoginBtn();
	    Thread.sleep(3000);
	    System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        String ActualTitle=driver.getTitle();
	    String ExpectedTitle ="SuperAdmin Dashboard";
	    Assert.assertEquals(ExpectedTitle, ActualTitle);
	    test2.Clients();
        test2.AddClients();
        Thread.sleep(2000);
        
        
     }
}
