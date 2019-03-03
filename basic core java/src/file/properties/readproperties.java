package file.properties;

import java.io.FileInputStream; 
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readproperties {

	public static void main(String[] args) throws IOException 
	{
		
//fun1("E:\\automation_repository_06012019\\basic core java\\src\\file\\properties\\Objectreport.propertiess");
	//}
//public static void fun1(String path) throws IOException
//{
	//try
	//{
Properties or=new Properties();
FileInputStream file= new FileInputStream("E:\\automation_repository_06012019\\basic core java\\src\\file\\properties\\Objectreport.properties");

or.load(file);

System.out.println(or.getProperty("password")); //put here also url or username

	//}
	//catch(Exception e)
	//{
	}
}

