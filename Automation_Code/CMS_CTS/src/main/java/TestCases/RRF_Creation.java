package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RRF_Creation {
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
	   @FindBy(id="BankBranchSelectionModel_BranchId")
	   private WebElement BankBranch;
	   @FindBy(id="btnSubmit")
	   private WebElement BranchSelection;
	   @FindBy(xpath="//b[text()='RRF Creation ']")
	   private WebElement RRFGen;
	   @FindBy(css="label[for='pickfiles']")
	   private WebElement SelectionBox;
	   @FindBy(id="btnSubmit")
	   private WebElement RRFsubmit;
	   
	   
	   private WebDriver driver;
       public  RRF_Creation(WebDriver driver) {
        	//this.driver = driver;
        	PageFactory.initElements(driver, this);
      }
        public void cc() {
        	cc.sendKeys("finverge");
	  }
      
        public void Submit() {
    	   
	     Submit.click();
      }
        public void LoginID() {
        
        	LoginID.sendKeys("finadmin");
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
        	
        }
        public void BankBranch() {
        	BankBranch.click();
        }
        
        public void BranchSelection() {
          BranchSelection.click();
        }
        public void RRFGen() {
        	RRFGen.click();
        }
       public void SelectionBox() {
    	   SelectionBox.click();
       }
       public void RRFsubmit() {
    	   RRFsubmit.click();
       }
}
