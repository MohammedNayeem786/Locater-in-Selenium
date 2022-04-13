package Locater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class XpathExampleIE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.ie.driver", "C:\\Users\\user\\eclipse-workspace\\LaunchInternetExplorer\\SeleniumBrowserJars\\IEDriverServer.exe");
		
		
		 WebDriver driver = new InternetExplorerDriver();
	       
	      driver.manage().window().maximize();
	      driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.findElement(By.name("txtUsername")).sendKeys("Admin");
			driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();

	}

}
