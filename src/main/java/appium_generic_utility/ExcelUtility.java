package appium_generic_utility;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ExcelUtility {
	static Workbook wb;
	public static void  openExcel(String path) throws Throwable {
	FileInputStream fis = new FileInputStream("./src/test/resources/testscriptdata.xlsx");
	Workbook wb =new WorkbookFactory().create(fis);
	}
	
	public static String fetchDataFromExcel(String sheetName, int rowNum,int cellNum) throws Throwable {
		FileInputStream fis = new FileInputStream("./src/test/resources/testscriptdata.xlsx");
		Workbook wb =new WorkbookFactory().create(fis);
	 String data= wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
	 return data;
}
	
	public static void closeExcel() throws Exception {
		wb.close();
	}
}