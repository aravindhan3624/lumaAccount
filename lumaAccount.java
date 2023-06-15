package org.demoautomation;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lumaAccount {

	public static void main(String[] args)throws IOException  {
		// TODO Auto-generated method stub
		String driverPath = System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe");
			
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);

		ChromeDriver driver = new ChromeDriver(options);	
 				System.out.println("the path name "+driverPath);	
				//Load the url
		driver.get("https://magento.softwaretestingboard.com/?ref=hackernoon.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.xpath("//div//header//ul//li//a[text()='Create an Account']")).click();
		driver.findElement(By.xpath("//div[@class='control']//input[@id='firstname']")).sendKeys("Anand");
		driver.findElement(By.xpath("//div[@class='control']//input[@id='lastname']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//div[@class='field choice newsletter']//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//div[@class='control'][1]//input[@id='email_address']")).sendKeys("anand32@gmail.com");
		
	    driver.findElement(By.xpath("//div[@class='control']//input[@id='password']")).sendKeys("abc@2010");
	    driver.findElement(By.xpath("//div[@class='control']//input[@id='password-confirmation']")).sendKeys("abc@2010");

  	  		//createaccount
  	  		driver.findElement(By.xpath("//div[@class='primary']//button[@class='action submit primary']")).click();
	
	
  	  	String WelcomeName=	driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[1]//span[@class='logged-in']")).getText();
  	 // WebElement nametitle= until.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i")));
System.out.println("The Name is "+WelcomeName);
	}

}
