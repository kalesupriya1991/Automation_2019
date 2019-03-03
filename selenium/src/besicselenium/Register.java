package besicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Register {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sonu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://www.newtours.demoaut.com/");
		dr.findElement(By.linkText("REGISTER")).click();
		dr.findElement(By.name("firstName")).sendKeys("Supriya");
		dr.findElement(By.name("lastName")).sendKeys("kale");
		dr.findElement(By.name("phone")).sendKeys("9960297179");
		dr.findElement(By.name("email")).sendKeys("supermane19@gmail.com");
		
		dr.findElement(By.name("city")).sendKeys("Pune");
		dr.findElement(By.name("state")).sendKeys("Maharashatra");
		
		dr.findElement(By.name("postalCode")).sendKeys("416111");
		
		WebElement ele=dr.findElement(By.xpath("//select[@name='country']"));
		Select sel=new Select(ele);
		sel.selectByVisibleText("INDIA");
		
		dr.findElement(By.name("userName")).sendKeys("supermane19@gmail.com");
		dr.findElement(By.name("password")).sendKeys("mercury");
		dr.findElement(By.name("confirmPassword")).sendKeys("mercury");
		dr.findElement(By.name("register")).click();
		
		





		





	}

}
