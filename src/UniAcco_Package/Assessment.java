package UniAcco_Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assessment {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Open Url
		driver.get("https://unicreds.com/contact-us");
		
		//Enter Full Name
		driver.findElement(By.xpath("//*[@id=\"fullname\"]")).sendKeys("Aman Prakash Tiwari");
		Thread.sleep(2000);
		
		//Enter Email ID
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/section/div/div[2]/div[2]/div[2]/div/form/input[2]")).sendKeys("amanofficial2898@gmail.com");
		Thread.sleep(2000);
		
		//Select Country Code
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/section/div/div[2]/div[2]/div[2]/div/form/select/option[3]"));
		
		// Enter Phone Number
		driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("9473533628");
		
		//Enter Message
		driver.findElement(By.xpath("//*[@id=\"message\"]")).sendKeys("I am Aman Prakash Tiwari, I have done B.Tech with CSE and have some Experience is Automation as well as in manual testing from Accolite Software India Pvt Ltd. I want to join UniAcco to enhance my skills and knowledge to use in Organization growth");
		
		//Click on Submit Button
		driver.findElement(By.xpath("//*[@id=\"contactButton\"]")).click();
		Thread.sleep(10000);

	}

}
