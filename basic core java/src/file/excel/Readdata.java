package file.excel;

import java.io.IOException;

public class Readdata {

	public static void main(String[] args) throws IOException
	{
		Xls_Reader xl=new Xls_Reader("C:\\Users\\Sonu\\Documents\\Book1.xls");
	String str=	xl.getCellData("Sheet1",1,1);
	
	System.out.println(str);

}
}