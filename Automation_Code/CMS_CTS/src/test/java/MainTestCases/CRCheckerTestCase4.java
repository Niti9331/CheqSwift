package MainTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestCases.CorrectionReview_Checker;
import TestCases.correctionReview_Maker;

public class CRCheckerTestCase4 extends genericLib.BaseClass{
	@Test
	public void TC1() throws InterruptedException {
		CorrectionReview_Checker test4=new CorrectionReview_Checker(driver);	
	    test4.cc();
	    test4.Submit();
	    test4.LoginID();
	    test4.Password();
	    test4.LoginBtn();
	    test4.AppSelection();
	    test4.BBSelect();
	    test4.RoleSelect();
	    test4.BankBranch();
	    test4.BranchSelection();
	    String ActualTitle=driver.getTitle();
	    String ExpectedTitle = "CTS Inward Dashboard";
	    Assert.assertEquals(ExpectedTitle, ActualTitle);
	    test4.Correction();
	   Thread.sleep(1000);	
	   test4.Accept();
	     
	   
	
	} 

}
