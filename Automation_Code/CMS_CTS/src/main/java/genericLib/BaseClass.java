package genericLib;
import java.io.IOException;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public PropertyFile pdata = new PropertyFile();
	public WebDriverUtilities driverutilies=new WebDriverUtilities();

	@BeforeMethod
/*	public void Setup(String BrowserName) throws IOException {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(pdata.getdata("url1"));
			
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	*/
	public void openApp() throws IOException, InterruptedException {
		/*WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();*/
		String driverpath = "C:\\Users\\Admin\\Music\\msedgedriver.exe";
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get(pdata.getdata("url1"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
	/*else if(BrowserName.equalsIgnoreCase("Edge")) {
		 String driverpath = "C:\\Users\\Admin\\Music\\msedgedriver.exe";
         System.setProperty("webdriver.edge.driver",driverpath);
         driver = new EdgeDriver();
        driver.manage().window().maximize();
		driver.get(pdata.getdata("url2"));
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}*/
}		
	
	@AfterMethod
	public void teardown(ITestResult res) throws IOException {
		int status = res.getStatus();
		String name = res.getName();
		
		if(status==2) {
			Screenshot p=new Screenshot();
			p.getPhoto(driver, name);
		}
        driver.quit();
       }
      }

