package Locater;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCartDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Locater in Selenium\\SeleniumBrowserJars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		
		List<WebElement> Links = driver.findElements(By.xpath("//a"));
		int Nolinks = Links.size();
		System.out.println("Number of links in calculation is ......" + Nolinks );
		
		for(int i=0;i<Links.size();i++) {
			System.out.println(Links.get(i).getText() );
			
		
		String str = Links.get(i).getText();
		String str1 ="Desktops";
		
		if(str.equals(str1)) {
			driver.findElement(By.linkText("Desktops")).click();
			driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/a"));
		}
		}
	}
		

}

