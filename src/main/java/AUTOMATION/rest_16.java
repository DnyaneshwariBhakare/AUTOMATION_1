package AUTOMATION;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rest_16 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		WebElement txt_cusid=driver.findElement(By.xpath("//input[@name='cusid']"));
		txt_cusid.sendKeys("123");
		
		WebElement btn_submit=driver.findElement(By.xpath("//input[@name='submit']"));
		btn_submit.click();
		
		Alert alert=driver.switchTo().alert();
		String text_1=alert.getText();
		System.out.println(text_1);
		
		alert.accept();
		Thread.sleep(2000);
		
		String text_2=alert.getText();
		System.out.println(text_2);
		
		alert.accept();
		driver.close();
		
		
		
		
		
		
		
		
		

	}

}
