package TestCases;

//CONNECTED WITH TESTCASE1-

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Admin_Login{
	
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
	   @FindBy(xpath="//b[text()='CBS Input (RMI) ']")
	   private WebElement RMI;
	   @FindBy(id="CbsInputRmiFileRequestModel_CtsIwrmiReqFileTypeCode")
	   private WebElement RMIDropdown;
	   @FindBy(id="btnSubmitRequest")
	   private WebElement SubmitRMI;

	   
	   
	   private WebDriver driver;
       public  Admin_Login(WebDriver driver) {
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
        //String username = properties.getProperty("LoginID1");
	    //LoginID.sendKeys(driver.get(pdata.getdata("url1")));
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
      
        public void RMI() {
	      RMI.click();
        }
        public void RMIDropdown() {
        	RMIDropdown.click();
        	Select dropdown=new Select(RMIDropdown);
        	dropdown.selectByValue("S");
        }
       public void SubmitRMI() {
    	   SubmitRMI.click();
       }

}//"Total '6' Cheques for processing, out of which '3' Cheque(s) processed. Request cannot be accepted."
        		

 /*         
public  ArrayList<String> getData(String testcaseName) throws IOException{
	//File InputStream argument
			ArrayList<String> a= new ArrayList<String>();
			FileInputStream fis= new FileInputStream("C:\\Users\\Admin\\Music\\TestData.xlsx");

		    XSSFWorkbook workbook= new XSSFWorkbook(fis);
		    int sheets=workbook.getNumberOfSheets();
		    for(int i=0;i<sheets;i++)
		    {
		    	if(workbook.getSheetName(i).equalsIgnoreCase("testdata"))
		    	{
		    	XSSFSheet sheet=workbook.getSheetAt(i);
		    	//Identify Testcases column by scanning the entire 1st row
		    	
		    	Iterator<Row> rows=sheet.iterator();   //Sheet is a collection of Rows
		    	Row firstrow=rows.next();
		    	Iterator<Cell> ce= firstrow.cellIterator();    //Row is collection of cells
		    	int k=0;
		    	int column = 0;
		    	while(ce.hasNext())
		    	{
		    		Cell value=ce.next();
		    		if(value.getStringCellValue().equalsIgnoreCase("TestCases"))
		    		{
		    			//desired column
		    			column=k;
		    		}
		    		k++;
		    	}
		    	System.out.println(column);
		    	while(rows.hasNext())
		    	{
		    		Row r=rows.next();
		    		r.getCell(column);
		    		if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testcaseName))
		    		{
		    			Iterator<Cell> cv=r.cellIterator();
		    			while(cv.hasNext()) {
		    				Cell c=cv.next();
		    				if(c.getCellType()==CellType.STRING) {
		    				a.add(c.getStringCellValue());
		    			}
		    			else{
		    				a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
		    			
		    					
		    		}
		    		}
		    		
		    	}
		    	
		    	}
		    	
		    	}
		    }
}			return a;
}*/
	    	

	



