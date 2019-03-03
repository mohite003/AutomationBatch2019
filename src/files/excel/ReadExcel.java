package files.excel;

import java.io.*;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class ReadExcel {

	public static void main(String[] args) throws IOException
	{
		FileInputStream file= new FileInputStream("/Users/imagenesis/Documents/Rakesh2019/Selenium Training/UserLogin.xls");
		
		HSSFWorkbook wb= new HSSFWorkbook(file);
		
		HSSFSheet sheet = wb.getSheetAt(0);
		
		HSSFRow row = sheet.getRow(0);
		
		HSSFCell cell = row.getCell(0);
		
		
		String str = cell.getStringCellValue();
		
		System.out.println(str);
		
		String Val = wb.getSheetAt(0).getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(Val);
		
		int rows = wb.getSheetAt(0).getLastRowNum();
		
		int cols = wb.getSheetAt(0).getRow(0).getLastCellNum();
		
		System.out.println("Row="+rows+",cols="+cols);
		
		
		for(int r=1;r<=rows;r++)
		{
			for(int c=0;c<cols;c++)
			{
				System.out.println(wb.getSheetAt(0).getRow(r).getCell(c).getStringCellValue());
			}
			System.out.println();
		}
		
		
				
	}

}
