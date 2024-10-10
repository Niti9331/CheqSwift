package TestCases;

//CONNECTED WITH TESTCASE2-

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuperAdmin_Login {
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
	   @FindBy(xpath="//b[text()='Customers']")
	   private WebElement Customers;


private WebDriver driver;
public  SuperAdmin_Login(WebDriver driver) {
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
 	 public void Customers() {
		 Customers.click();
	 
}
 
 }