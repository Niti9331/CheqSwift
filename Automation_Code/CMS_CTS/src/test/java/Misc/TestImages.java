/*package TestCases;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

	public class TestImages {
		public static String Image(String filePath) throws TesseractException {
			File imgFile=new File(filePath);
					ITesseract instance=new Tesseract();
			instance.setDatapath("D:\\Automation_Code\\CMS_CTS\\TestData");
			String result=instance.doOCR(imgFile);
			
		return result;
		 
		}
			
	
	public static void main(String[] args) throws TesseractException {
		
		String textData=TestImages.Image("D:\\Automation_Code\\CMS_CTS\\Images\\23996000000044335807103400000000536129000000_FrontBW.jpeg");
		System.out.println(textData);
	}

	}*/
