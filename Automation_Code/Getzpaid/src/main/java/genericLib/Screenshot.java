package genericLib;
import java.io.File;


import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	public void getPhoto(WebDriver driver, String name) throws IOException
	{
		Date d=new Date();
		String  currentDate =d.toString().replace(":","-");
		
		
		TakesScreenshot td =(TakesScreenshot)driver;
		File src =td.getScreenshotAs(OutputType.FILE);
		
		File dest =new File(AutoConstant.photoPth+currentDate+name+".png");
		FileUtils.copyFile(src, dest);
	}

}
