package besicselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mousehover {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sonu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		
		dr.get("http://www.flipkart.com/");
		//dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		WebElement ele=dr.findElement(By.xpath("//span[text()='Men']"));
		
		Actions act=new Actions(dr);
		act.moveToElement(ele).build().perform();
		//Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(dr,2);   
		wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("//a[@title='Shirts']"))));
		
		dr.findElement(By.xpath("//a[@title='Shirts']")).click();	
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("(//div[@class='_3aQU3C'])[1]"))));
		act.dragAndDropBy(dr.findElement(By.xpath("(//div[@class='_3aQU3C'])[1]")),50,0).build().perform();
		
		
	}

}
