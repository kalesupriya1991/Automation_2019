package besicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Booking {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sonu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://www.newtours.demoaut.com/");
		dr.findElement(By.name("userName")).sendKeys("mercury");
		dr.findElement(By.name("password")).sendKeys("mercury");
		dr.findElement(By.name("login")).click();
		
		dr.findElement(By.xpath("//input[@value='roundtrip']")).click();
		boolean b=dr.findElement(By.xpath("//input[@value='roundtrip']")).isSelected();
		System.out.println(b);
		
    	WebElement ele=dr.findElement(By.xpath("//select[@name='passCount']"));
		Select sel=new Select(ele);
		sel.selectByVisibleText("1");
		
		WebElement elem=dr.findElement(By.xpath("//select[@name='fromPort']"));
		Select selt=new Select(elem);
		selt.selectByVisibleText("Paris");
		
		WebElement ele1=dr.findElement(By.xpath("//select[@name='fromMonth']"));
		Select sel1=new Select(ele1);
		sel1.selectByVisibleText("January");
		
		WebElement ele2=dr.findElement(By.xpath("//select[@name='fromDay']"));
		Select sel2=new Select(ele2);
		sel2.selectByVisibleText("19");
		
		WebElement ele3=dr.findElement(By.xpath("//select[@name='toPort']"));
		Select sel3=new Select(ele3);
		sel3.selectByVisibleText("Paris");
		
		WebElement ele5=dr.findElement(By.xpath("//select[@name='toMonth']"));
		Select sel5=new Select(ele5);
		sel5.selectByVisibleText("March");
		
		WebElement ele4=dr.findElement(By.xpath("//select[@name='toDay']"));
		Select sel4=new Select(ele4);
		sel4.selectByVisibleText("18");
		
		dr.findElement(By.xpath("//input[@value='First']")).click();
		boolean b1=dr.findElement(By.xpath("//input[@value='First']")).isSelected();
		System.out.println(b1);
		
		WebElement ele6=dr.findElement(By.xpath("//select[@name='airline']"));
		Select sel6=new Select(ele6);
		sel6.selectByVisibleText("Unified Airlines");
		dr.findElement(By.name("findFlights")).click();
		
		
		
	}

}
