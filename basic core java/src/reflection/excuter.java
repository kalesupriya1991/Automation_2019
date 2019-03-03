package reflection;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import file.excel.Xls_Reader;

public class excuter {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException
	{
		Xls_Reader xl=new Xls_Reader("C:\\Users\\Sonu\\Documents\\Book1.xls");
		String tcname=	xl.getCellData("sheet1",2,"TC_Name");
		
		System.out.println(tcname);
		String[] Keyword=xl.getCellData("sheet1",2,"keyword").split(",");
		
		
		Class c=Class.forName("reflection."+tcname);
		Object obj=c.newInstance();

		Method m=c.getDeclaredMethod(Keyword[1]);
		m.invoke(obj);
	}

}
