package besicselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertHandling {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sonu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("file:///C:/Users/Sonu/Downloads/Practice.html");
		Select sel=new Select(dr.findElement(By.id("anand")));
		
		sel.selectByIndex(2);
		sel.selectByIndex(3);
		sel.selectByIndex(4);
		sel.deselectAll();    // disable all index name
		
		JavascriptExecutor js=(JavascriptExecutor) dr;
		WebElement ele=dr.findElement(By.tagName("button"));
		js.executeScript("arguments[0].scrollIntoView();",ele); //to scroll
		
		ele.click();
		Alert al=dr.switchTo().alert();
		String str=al.getText();
		System.out.println(str);
		
		//al.accept(); //clicked on ok
		al.dismiss(); // clicked on cancle
	}

}
