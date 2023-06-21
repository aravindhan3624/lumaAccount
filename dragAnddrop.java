package org.demoautomation;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;

public class dragAnddrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		String driverPath = System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe");

		 
 		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
       // driver.findElement(By.xpath("//*[@id=\"Accepted Elements\"]")).click();
     
        driver.findElement(By.xpath(" //*[@id=\"Photo Manager\"]")).click();


        Wait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(30))
       		 .ignoring(NoSuchElementException.class)
       		 .ignoring(MoveTargetOutOfBoundsException.class)
       		 .ignoring(Throwable.class);
       
       //find xpath for drag object
       WebDriverWait webdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
       webdwait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(" //*[@id=\"post-2669\"]/div[2]/div/div/div[1]/p/iframe")));
       WebElement dragElement = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[2]"));

        WebElement dropElement = driver.findElement(By.id("trash"));

        // Create an instance of Actions
         Actions action = new Actions(driver);
        Thread.sleep(7000);
        action.dragAndDrop(dragElement, dropElement).perform();
        Thread.sleep(7000);
		        }
 
	}

 