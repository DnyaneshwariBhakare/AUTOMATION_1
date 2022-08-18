package AUTOMATION;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scroll {
	@Test
	public void status() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver Driver=new ChromeDriver();

		Driver.get("https://www.facebook.com/");
		Driver.manage().window().maximize();
		
		JavascriptExecutor D= (JavascriptExecutor) Driver;
		D.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		
		
		D.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(2000);
		
	WebElement	m=Driver.findElement(By.xpath("//li[text()='English (UK)']"));
	m.click();
	D.executeScript("arguments[0].scrollIntoView()",m);
	
		
		
		
		
	}

}
