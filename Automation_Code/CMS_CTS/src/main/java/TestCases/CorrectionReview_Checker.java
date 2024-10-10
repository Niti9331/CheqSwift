package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CorrectionReview_Checker{
	 @FindBy(id="clientcode")
	   private WebElement cc;
	   @FindBy(id="btnSubmit")
     private WebElement Submit;
	   @FindBy(id="LoginId")
	   private WebElement LoginID;
	   @FindBy(id="LoginPassword")
	   private WebElement Password;
	   @FindBy(id="btnLogin")
	   private WebElement LoginBtn;
	   @FindBy(xpath="//a[@href='/Users/Login/SelectedApp/CLD_FIN_CTS_IW']")
	   private WebElement AppSelection;
	   @FindBy(id="BankBranchSelectionModel_BankId")
	   private WebElement BBSelect;
	   @FindBy(id="BankBranchSelectionModel_RoleId")
	   private WebElement RoleSelect;
	   @FindBy(id="BankBranchSelectionModel_BranchId")
	   private WebElement BankBranch;
	   @FindBy(id="btnSubmit")
	   private WebElement BranchSelection;
	   @FindBy(xpath="//a[@href='/CTSIW/InwardOperations/CorrectionReview']")
	   private WebElement Correction;
	   @FindBy(id="btnAccept")
	   private WebElement Accept;
	   
	   
	   
	   private WebDriver driver;
       public CorrectionReview_Checker(WebDriver driver) {
        	this.driver = driver;
        	PageFactory.initElements(driver, this);
      }
        public void cc() {
        	cc.sendKeys("finverge");
	  }
      
        public void Submit() {
    	   
	     Submit.click();
      }
        public void LoginID() {
        	LoginID.sendKeys("finc01");
      }
        public void Password() {
        	Password.sendKeys("12345678");
      }
        
        public void LoginBtn() {
        	LoginBtn.click();	
      }
        public void AppSelection() {
        	AppSelection.click();
        }
        public void BBSelect() {
        	BBSelect.click();
        	Select dropdown=new Select(BBSelect);
        	dropdown.selectByValue("549");
        	BBSelect.click();
        	
        }
        public void RoleSelect() {
        	RoleSelect.click();
        	Select dropdown=new Select(BankBranch);
        	dropdown.selectByIndex(0);
        	RoleSelect.click();
        }
        public void BankBranch() {
        	BankBranch.click();
        	Select dropdown=new Select(BankBranch);
        	dropdown.selectByIndex(0);
        	BankBranch.click();
        }
        
        public void BranchSelection() {
        	BranchSelection.click();
        }
      
        public void Correction() {
        	Correction.click();
        	 
        }
        	public void Accept() 
          {
          for(int j=0;j<=6;j++){
	        	Accept.click();
	  }
	

}
}