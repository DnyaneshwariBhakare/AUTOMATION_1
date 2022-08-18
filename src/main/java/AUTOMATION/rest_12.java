package AUTOMATION;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class rest_12 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		WebElement txt_email=driver.findElement(By.xpath("//input[@name='email']"));
		txt_email.sendKeys("text@123.gmail.com");

        WebElement txt_password=driver.findElement(By.xpath("//input[@name='pass']"));
		txt_password.sendKeys("Password");
		
		WebElement btn=driver.findElement(By.xpath("//button[@name='login']"));
		btn.click();
		
		String location="C:\\Users\\HP\\eclipse-workspace\\AUTOMATION_1\\screenshot";
		String rm=RandomString.make(4);
	
      	TakesScreenshot a=(TakesScreenshot) driver;
		File src=a.getScreenshotAs(OutputType.FILE);
		File d=new File(location+"\\"+rm+".png");
		FileUtils.copyFile(src, d);
	}
}
		


		
				

	


