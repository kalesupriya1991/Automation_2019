package besicselenium;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Multipalwindows {

	public static void main(String[] args)
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\Sonu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();         //maximize the window
		
		dr.get("http://www.naukri.com/");  
		
		//dr.close();                        //close the window
	//	dr.quit();
		
		String parent=dr.getWindowHandle();// to get id(string)
		
		System.out.println(parent);
		
		Set<String> wins=dr.getWindowHandles();// to set string  (set for unique window) 
		
		for(String s:wins)
			
			//System.out.println(s);
		{
			dr.switchTo().window(s);
			if(!s.equals(parent))
			{
				dr.close();
			}
		}

	}

}
