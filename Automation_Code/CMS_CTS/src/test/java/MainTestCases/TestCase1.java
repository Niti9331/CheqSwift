package MainTestCases;

//CONNECTED WITH ADMIN_LOGIN

import java.io.File;
import org.testng.Assert;
import org.testng.annotations.Test;
import TestCases.Admin_Login;

//import net.sourceforge.tess4j.ITesseract;
//import net.sourceforge.tess4j.Tesseract;



public class TestCase1 extends genericLib.BaseClass{
	@Test
	public void TC() throws InterruptedException {
		Admin_Login test=new Admin_Login(driver);	
	    test.cc();
	    test.Submit();
	    test.LoginID();
	    test.Password();
	    test.LoginBtn();
	    test.AppSelection();
	    test.BBSelect();
	    test.BankBranch();
	    test.BranchSelection();
	    String ActualTitle=driver.getTitle();
	    String ExpectedTitle = "CTS Inward Dashboard";
	    Assert.assertEquals(ExpectedTitle, ActualTitle);
	    test.RMI();
	    test.RMIDropdown();
	    test.SubmitRMI();
	    Thread.sleep(10000);
	
	} 
}
	


