package Misc;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDriven {

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
				return a;
	}
}	    	

		

	
	
	