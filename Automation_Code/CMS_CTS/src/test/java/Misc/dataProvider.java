package Misc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
    @Test(dataProvider="driveTest")
	public void TestcaseData(String Greeting,String Communication,String ID) {
	System.out.println(Greeting+Communication+ID);	
	}
	@DataProvider(name="driveTest")

    public void getData() throws IOException
    {
	   //Object[ ][] data= {{"hello","text","1"},{"bye","message","142"},{"solo","call","453"}};
      // return data;
      FileInputStream fis= new FileInputStream("C:\\Users\\Admin\\OneDrive - CloudMojo Tech Private Limited\\CMT_Projects\\CMS_CTS\\DataProvider.xlsx");

      XSSFWorkbook wb=new XSSFWorkbook(fis);
      XSSFSheet sheet=wb.getSheetAt(0);
      int rowCount=sheet.getPhysicalNumberOfRows();
      XSSFRow row=sheet.getRow(0);
      int colCount=row.getLastCellNum();
      Object[][] Data=new Object[rowCount-1][colCount];
      for(int i=0;i<rowCount;i++)
      {
    	 row=sheet.getRow(i+1);
    	 for(int j=0;j<colCount;j++)
    	 {
    		Data[i][j]=row.getCell(j);
    	 }
     }
    

}

	
}
/*Data[0][0]=hello;
Data[0][0]=text;
Data[0][0]=1;*/

