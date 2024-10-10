package TestCases;

//CONNECTED WITH CUSTOMER_LOGIN

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class superadmin_Customers {
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
		   @FindBy(xpath="//span[@class='bg-clients']")
		   private WebElement Clients;
		   @FindBy(xpath="//a[text()='Clients']")
		   private WebElement AddClients;
		   
		   //@FindBy()
		   //private WebElement 
		   
		   
	private WebDriver driver;   
	 public superadmin_Customers(WebDriver driver) {
		this.driver = driver;
	 	PageFactory.initElements(driver, this);
	}
	 public void cc() {
	 	cc.sendKeys("cld_fin_tech");
	}
     public void Submit() {
      Submit.click();
	}
	 public void LoginID() {
	  LoginID.sendKeys("sa");
	}
	 public void Password() {
	 	Password.sendKeys("sa");
	}
	 public void LoginBtn() {
	 	LoginBtn.click();	
	}
	 public void Clients() {
		 Clients.click();
	}
     public void AddClients() {
	 AddClients.click();
}
}
