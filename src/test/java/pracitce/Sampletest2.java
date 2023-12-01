package pracitce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sampletest2 {
	@Test
	public void data() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.get("https://www.airindia.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='button']")).click();		
	}
	

}
