package AUTOMATION;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class an_1 {
	@Test
public void m1() throws Exception  {

	WebDriverManager.chromedriver().setup();
	WebDriver  driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	
	
WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
search.sendKeys("Samsung mobile");

driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

driver.findElement(By.xpath("//span[@class='a-truncate-cut']")).click();
JavascriptExecutor D= (JavascriptExecutor) driver;
D.executeScript("window.scrollBy(0,1000)", "");




//Path of screenshot
String path="C:\\Users\\HP\\eclipse-workspace\\AUTOMATION_1\\screenshot";

String rm=RandomString.make(4);
//take screenshot
TakesScreenshot ts=(TakesScreenshot) driver;
File k=ts.getScreenshotAs(OutputType.FILE);
File L=new File(path+"\\"+rm+".png");
FileUtils.copyFile(k, L);

	
	}







}

