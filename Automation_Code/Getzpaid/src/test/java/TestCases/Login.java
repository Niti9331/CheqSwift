package TestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;


@Parameters({"URL"})
@Test
public class Login {
    //WebDriver driver;
 public void setUp(String urlname) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(urlname);
		driver.get("https://www.getzpaid.in/");
	    driver.findElement(By.id("okBtn")).click();
	    driver.findElement(By.id("LoginId")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("LoginPassword")).sendKeys("your_password");
		driver.findElement(By.id("btnLogin"));
				 }	

}