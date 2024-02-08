package LOGIN;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_01 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15000,TimeUnit.SECONDS);
		driver.get("https://app-test.rigbot.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("firefox");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abc123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Log In']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Loads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@id='tablHeader']//span[.='Refresh'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Maintenance']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Refresh']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[.='Work Order']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Refresh']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Scheduler']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='tabs-calender-header']//div[@class='driver-schedule-active']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[.='Trucks'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='tabs-calender-header']//div[@class='driver-schedule-active']")).click();
		Thread.sleep(2000);
		

		driver.quit();	
		//driver.close();
	}
}
