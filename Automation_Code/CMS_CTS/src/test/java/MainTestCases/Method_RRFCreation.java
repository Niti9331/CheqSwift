package MainTestCases;

import java.io.IOException;
import org.testng.annotations.Test;
import TestCases.Admin_Login;
import TestCases.RRF_Creation;

public class Method_RRFCreation extends genericLib.BaseClass {
	public class TestCase1 extends genericLib.BaseClass{
		@Test
		public void TC() throws InterruptedException, IOException {
			RRF_Creation test5=new RRF_Creation(driver);	
		    test5.cc();
		    test5.Submit();
		    test5.LoginID();
		    test5.Password();
		    test5.LoginBtn();
		    test5.AppSelection();
		    test5.BBSelect();
		    test5.BankBranch();
		    test5.BranchSelection();
		    test5.RRFGen();
		    test5.SelectionBox();
		    Thread.sleep(2000);
		    Runtime.getRuntime().exec("D:\\Automation_Code\\fileupload.exe");
		    Thread.sleep(2000);
		    test5.RRFsubmit();
		    Thread.sleep(1000);

        }
	}
}