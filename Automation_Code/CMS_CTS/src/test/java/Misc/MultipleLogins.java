package Misc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestCases.Admin_Login;



public class MultipleLogins extends genericLib.BaseClass{
	@Test(dataProvider="getData")
	public  void Mul_User(String clientcode,String LoginID,String Password) throws InterruptedException{
	Admin_Login test=new Admin_Login(driver);	
    test.cc();
    test.Submit();
    test.LoginID();
    test.Password();
    //Thread.sleep(2000);
    test.LoginBtn();
    test.AppSelection();
    test.BBSelect();
    Thread.sleep(2000);
    test.BankBranch();
    Thread.sleep(2000);
    test.BranchSelection();
   // Thread.sleep(2000);
    String ActualTitle=driver.getTitle();
    String ExpectedTitle = "CTS Inward Dashboard";
    Assert.assertEquals(ExpectedTitle, ActualTitle);
    //test.Correction();
   // String driver.getText();
   // test.Accept();
   // Thread.sleep(2000);
	
	}   
	
	@DataProvider
	public Object[][] getData() {
		
		return new Object[][] { {"cld_mojo", "cmm03","12345678"},{"cld_mojo","cmm01","12345678"}};
		
		
		
	}
}

