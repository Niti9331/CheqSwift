package MainTestCases;

//CONNECTED WITH CORRECTIONREVIEW_Maker

import java.io.File;
import org.testng.Assert;
import org.testng.annotations.Test;

import TestCases.correctionReview_Maker;

//import net.sourceforge.tess4j.ITesseract;
//import net.sourceforge.tess4j.Tesseract;




public class TestCase3 extends genericLib.BaseClass{
	@Test
	public void TC1() throws InterruptedException {
		correctionReview_Maker test1=new correctionReview_Maker(driver);	
	    test1.cc();
	    test1.Submit();
	    test1.LoginID();
	    test1.Password();
	    test1.LoginBtn();
	    test1.AppSelection();
	    test1.BBSelect();
	    test1.RoleSelect();
	    test1.BankBranch();
	    test1.BranchSelection();
	    String ActualTitle=driver.getTitle();
	    String ExpectedTitle = "CTS Inward Dashboard";
	    Assert.assertEquals(ExpectedTitle, ActualTitle);
	    test1.Correction();
	    Thread.sleep(1000);	
	    test1.Accept();
	     
	   
	
	} 
}
	


