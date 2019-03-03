package file.excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class readexcal {

	public static void main(String[] args) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Sonu\\Documents\\Book1.xls");
		HSSFWorkbook wb=new HSSFWorkbook(file);
		
	/*	HSSFSheet sheet=wb.getSheetAt(0);
		HSSFRow row=sheet.getRow(0);
		//sheet.getRow(0);
		HSSFCell cell=row.getCell(0);
		String str=cell.getStringCellValue();
		System.out.println(str);*/
		
		String val=wb.getSheetAt(0).getRow(0).getCell(0).getStringCellValue();
		int row=wb.getSheetAt(0).getLastRowNum();
		int cols=wb.getSheetAt(0).getRow(0).getLastCellNum();
		
		System.out.println("Row =" +row+",cols="+cols);
		
		for(int r=1; r<=row; r++)
		
		{
			for(int c=0; c<cols; c++ )
			{
				System.out.print(wb.getSheetAt(0).getRow(r).getCell(c).getStringCellValue()+ "");
				}
			System.out.println();
			}
		
		
	}

}
