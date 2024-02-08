package Loads_Quick_setup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_Load 
{
	public static void main(String[] args) throws InterruptedException, AWTException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15000,TimeUnit.SECONDS);
		driver.get("https://app-test.rigbot.com");
		//driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("automation");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123");
		driver.findElement(By.xpath("//button[.='Log In']")).click();
		driver.findElement(By.xpath("//span[.='Loads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[.='Invoice']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='Refresh']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder=' Search Customers name']")).sendKeys("sharat");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//img[@style='height: 30px; width: 30px;'])[5]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='simple_refresh']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[.='Invoiced']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[.='Un Invoiced']")).click();
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
//		driver.findElement(By.xpath("//span[.='New Load']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//input[@id='orderNumber'])[1]")).sendKeys("Automation");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//span[.='Select'])[1]")).click();
//		driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]")).sendKeys("sharat");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//li[@aria-label='sharat']")).click();
//		driver.findElement(By.xpath("//input[@placeholder='Pickup On']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//td[@data-value='20'])[1]")).click();
//		driver.findElement(By.xpath("//input[@placeholder='Delivery On']")).click();
//		driver.findElement(By.xpath("(//td[@data-value='26'])[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//input[@placeholder='Type City / State / ZIP'])[1]")).click();
//		driver.findElement(By.xpath("(//input[@placeholder='Type City / State / ZIP'])[1]")).sendKeys("wq");
//		Thread.sleep(2000);
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("(//input[@placeholder='Type City / State / ZIP'])[2]")).sendKeys("qw");
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,500)","");
//		Thread.sleep(2000);
//		WebElement t = driver.findElement(By.xpath("//input[@inputmode='decimal']"));
//		t.sendKeys("100000");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//div[.='Select options'])[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[.='Ben Camp/ benc']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//span[.='Select Truck'])[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//li[@aria-label='C']")).click();
////		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,-500)","");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[@id='uncontrolled-tab-example-tab-documents']")).click();
//		Thread.sleep(2000);
//		WebElement up = driver.findElement(By.xpath("//div[@id='dragAndDropRef']"));
//		up.sendKeys("C:\\Users\\shant\\OneDrive\\Pictures\\Screenshots\\Screenshot 2023-11-17 133355.png");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[.='Save']")).click();
//		Thread.sleep(10000);
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File dst = new File("C:\\Users\\shant\\OneDrive\\Desktop\\Defects\\defects1.jpeg");
//		org.openqa.selenium.io.FileHandler.copy(src, dst);
//		Thread.sleep(2000);
		driver.quit();
		//driver.close();
	}
}