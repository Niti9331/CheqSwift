package genericLib;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class PropertyFile {

	public String getdata(String key) throws IOException
	{
		Properties p=new Properties();
		try {
		FileInputStream fis=new FileInputStream(AutoConstant.propertyFile);
		p.load(fis);
	    	
		fis.close();
		}catch (IOException e) {
	        e.printStackTrace();
}
		return p.getProperty(key);
}
}

