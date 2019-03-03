package file.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class read2 {

	public static void main(String[] args) throws IOException
	{
		Properties or=new Properties();
		FileInputStream file= new FileInputStream("E:\\automation_repository_06012019\\basic core java\\src\\file\\properties\\Objectreport.properties");

		or.load(file);

		System.out.println(or.getProperty("url"));

	}

}
