package files.excel;

import java.io.IOException;

public class ReadData {

	public static void main(String[] args) throws IOException
	
	{
		
		Xls_Reader xl = new Xls_Reader("/Users/imagenesis/Documents/Rakesh2019/Selenium Training/UserLogin.xls");
		String str = xl.getCellData("Sheet1", 1, 1);
		System.out.println(str);
 
	}

}
