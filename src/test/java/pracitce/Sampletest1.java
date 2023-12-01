package pracitce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sampletest1 {
	@Test
	public void mtest()
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.close();
		System.out.println("Welcom Manoj");
	}

}
