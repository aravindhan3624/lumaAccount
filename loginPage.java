package org.demoautomation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.http.ConnectionFailedException;

public class loginPage {

	public static void main(String[] args) {
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
		driver.get("https://www.linkedin.com/");
	
	
	}

}
