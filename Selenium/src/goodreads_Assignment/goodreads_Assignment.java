package goodreads_Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class goodreads_Assignment {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//Account Created
		driver.get("https://www.goodreads.com/");
		/*driver.findElement(By.linkText("Sign up with email")).click();
		//driver.findElement(By.id("ap_customer_name")).sendKeys("Tushar Bhagwat");
		//driver.findElement(By.id("ap_email")).sendKeys("tusharbhagwat669@gmail.com");
		//driver.findElement(By.id("ap_password")).sendKeys("Tushar@2001");
		//driver.findElement(By.id("ap_password_check")).sendKeys("Tushar@2001");
		//driver.findElement(By.cssSelector("button[class='a-button-input']")).click();
		//driver.findElement(By.id("continue")).click();
		//.findElement(By.cssSelector("button[class='a-button-input']")).click();*/
		
		//Account Sign in
		
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.linkText("Sign in with email")).click();
		driver.findElement(By.id("ap_email")).sendKeys("tusharbhagwat669@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("Tushar@2001");
		driver.findElement(By.id("signInSubmit")).click();
		//driver.findElement(By.cssSelector("button[class='gr-iconButton']")).click(); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("The Story of Art");
		//driver.findElement(By.xpath("(//img[@class=\"gr-mediaFlexbox__media\"])[1]")).click();
		//driver.findElement(By.linkText("The Story of Art")).click();
		//driver.findElement(By.linkText("headerPersonalNav__icon")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//img[@class=\"gr-mediaFlexbox__media\"])[1]")).click();
		
		
		
		driver.findElement(By.xpath("(//span[text()=\"Currently reading\"])[1]")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Want to read']")).click();
		//driver.findElement(By.xpath("//button[@class='Button Button--secondary Button--medium Button--block Button--active']")).click();
		
		driver.findElement(By.xpath("//span[text()='Done']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//span[text()='Want to read'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Remove from my shelf']")).click();
		driver.findElement(By.xpath("//span[text()='Remove']")).click();
		driver.findElement(By.xpath("(//i[@class='Icon UserIcon'])[1]")).click();
		driver.findElement(By.linkText("Sign out")).click();
		/*driver.findElement(By.xpath("(//button[@class=\"Button Button--secondary Button--medium Button--block\"])[3]")).click();
		
		driver.findElement(By.xpath("(//span[text()=\"Done\"])[4]")).click();
		
		driver.findElement(By.xpath("(//span[@class=\"Button__labelItem\"])[4]")).click();
		
	
		
		driver.findElement(By.xpath("(//span[text()=\"Remove from my shelf\"])[4]")).click();
		
		driver.findElement(By.xpath("(//span[text()=\"Remove\"])[4]")).click();*/
		
		//driver.findElement(By.xpath("(//span[@class="Button__labelItem\"])[4]")).click();
		//driver.findElement(By.xpath("//div[@class=\"gr-book__titleLink gr-hyperlink gr-hyperlink--naked\"]")).click();
		//driver.//findElement(By.cssSelector("input[class='searchBox__input searchBox__input--navbar']")).sendKeys("The Story of Art");
		
		//driver.findElement(By.xpath("//div[@class=\"gr-book__titleLink gr-hyperlink gr-hyperlink--naked\"]")).click();
		//input[@type='text']
		
	}

}
