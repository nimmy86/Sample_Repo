package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadMain {
	static FileInputStream f; //fetching the file
	static XSSFWorkbook w; //fetching workbook
	static XSSFSheet s; //accessing sheet from excel
	
	public static String getStringData(int a,int b) throws IOException 
	{
	// to get string (Name) from the excel 
	// int a int b -> 	to get the data from the row (a) and columns's (b)index 
		f=new FileInputStream("C:\\Users\\Admin\\Desktop\\Book1.xlsx");
	//new for memory allocation -> this is for inputting the file 
		w=new XSSFWorkbook(f);
		//to get the workbook and store it in w. 
		s=w.getSheet("Sheet1");// Sheet1 -> Sheet name 
		//getsheet -> Inbuilt method to get the excel sheet. 
		//to get the sheet from the workbook.
		/* XSSFRow inbuilt class to identify the Row*/XSSFRow r=s.getRow(a); //Inbuilt method to get the Row. 
		/* XSSFCell inbuilt class to identify the Cell*/XSSFCell c=r.getCell(b); // Inbuilt method to get the Cell. (Row and Column should be given as 0,1,2,3)
		//r.cell is because, we need to take the column from the corresponding row. 
		return c.getStringCellValue(); //get the String value as string... inbuilt method 
	}
	public static int  getIntegerData(int a,int b) throws IOException 
	{
	// to get int (Salary) from the excel 
	// int a int b -> 	to get the data from the row (a) and columns's (b)index 
		f=new FileInputStream("C:\\Users\\Admin\\Desktop\\Book1.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet("Sheet1");
		XSSFRow r=s.getRow(a);
		XSSFCell c=r.getCell(b);
		//type casting -> convert one data type to another. 
		int y = (int) c.getNumericCellValue();
		// c/getNumericCellValue - value inside c is returned as double. then we convert to int (type casting)
		return y;
	}

	public static void main(String[] args) throws IOException {
		System.out.println(ExcelReadMain.getStringData(1, 0));
		System.out.println(ExcelReadMain.getIntegerData(1, 1));

	}

}
