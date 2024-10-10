package TestCases;

//CONNECTED WITH TESTCASE3-

import java.io.FileInputStream;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;

public class correctionReview_Maker{
	
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
	   
	   /*@FindBy(xpath="//label[text()='Return code']")
	   private WebElement Cheque;
	   @FindBy(id="btnReturn")
	   private WebElement Return;*/
	   
	   
	   
	   
	   private WebDriver driver;
       public  correctionReview_Maker(WebDriver driver) {
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
        	LoginID.sendKeys("finm01");
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
        	



 /* List <WebElement> cheques= driver.findElements(By.id("chqImg"));
       
        for(int i=0;i<cheques.size();i++) 
          {
             String name=cheques.get(i).getText();
            	if(name.contains("SITA WO SATPAL")) 
            	   {
            			Return.click();
            		}
                else 
            	{
        		   Accept.click();
            	}
        	
                } 

			/*private String getText() {
				
				return null;
			}
			*/







       



