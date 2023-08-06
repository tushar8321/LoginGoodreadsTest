package goodreads_Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment 
{
	public static void main(String[] args) throws InterruptedException
	{
		
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	ChromeDriver driver=new ChromeDriver(option);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
	driver.get("https://www.goodreads.com/");
	
	driver.findElement(By.linkText("Sign In")).click();
	driver.findElement(By.linkText("Sign in with email")).click();
	driver.findElement(By.id("ap_email")).sendKeys("tusharbhagwat669@gmail.com");
	driver.findElement(By.id("ap_password")).sendKeys("Tushar@2001");
	driver.findElement(By.id("signInSubmit")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("The Story of Art");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//img[@class=\"gr-mediaFlexbox__media\"])[1]")).click();
    driver.findElement(By.xpath("(//span[text()=\"Currently reading\"])[1]")).click();
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='Want to read']")).click();
	driver.findElement(By.xpath("//span[text()='Done']")).click();
	Thread.sleep(3000);
	
	
	
	driver.findElement(By.xpath("(//span[text()='Want to read'])[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='Remove from my shelf']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='Remove']")).click();
	driver.findElement(By.xpath("(//i[@class='Icon UserIcon'])[1]")).click();
	driver.findElement(By.linkText("Sign out")).click();
	}
}







