package Misc;

import java.io.IOException;
import java.util.ArrayList;

public class TestSample {

	public static void main(String[] args) throws IOException {
		
       ExcelDriven ex=new ExcelDriven();
       ArrayList data= ex.getData("Login");
       System.out.println(data.get(0));
       System.out.println(data.get(1));
       System.out.println(data.get(2));
       System.out.println(data.get(3));
	}

}
