package besicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class launchbroweser {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sonu\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://www.newtours.demoaut.com/");
		dr.findElement(By.name("userName")).sendKeys("mercury");
		dr.findElement(By.name("password")).sendKeys("mercury");
		dr.findElement(By.name("login")).click();
		
		//String str=dr.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/font")).getText();
	//	System.out.println(str);
		dr.findElement(By.xpath("//input[@value='oneway']")).click();
		boolean b=dr.findElement(By.xpath("//input[@value='oneway']")).isSelected();
		System.out.println(b);
	WebElement ele=dr.findElement(By.xpath("//select[@name='passCount']"));
		Select sel=new Select(ele);
		sel.selectByVisibleText("3");

}
}