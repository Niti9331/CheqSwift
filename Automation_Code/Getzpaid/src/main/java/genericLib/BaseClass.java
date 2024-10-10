package genericLib;
import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {

	public WebDriver driver;
	public PropertyFile pdata = new PropertyFile();
	public WebDriverUtilities driverutilies=new WebDriverUtilities();

	/*@BeforeMethod
	public void openApp() throws IOException {
		WebDriver driver=new ChromeDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("www.getzpaid.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}*/
	@AfterMethod
	public void tearDown(ITestResult res) throws IOException {
		int status = res.getStatus();
		String name = res.getName();
		
		if(status==2) {
			Screenshot p=new Screenshot();
			p.getPhoto(driver, name);
		}

		driver.quit();
	}
}
