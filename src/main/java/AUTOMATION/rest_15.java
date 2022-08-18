package AUTOMATION;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rest_15 {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement txt_email=driver.findElement(By.xpath(" //input[@type='text']"));
		WebElement txt_password=driver.findElement(By.xpath("//input[@id='pass']"));
		
		String path ="C:\\Users\\HP\\eclipse-workspace\\AUTOMATION_1\\target\\shanti\\New Microsoft Excel Worksheet.xlsx";
		FileInputStream S=new FileInputStream(path);
		XSSFWorkbook b=new XSSFWorkbook(path);
		
		String S_1=b.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		txt_email.sendKeys(S_1);
		
		String S_2=b.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		txt_password.sendKeys(S_2);
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
	
 		
		
		
		
		
	}

}
