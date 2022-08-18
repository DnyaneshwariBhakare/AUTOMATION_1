package AUTOMATION;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public final class AD {

	public static void main(String[] args) throws IOException {
//Browser opening
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("//https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		String path="C:\\Users\\HP\\eclipse-workspace\\AUTOMATION_1\\shruti\\table.xlsx";
		FileInputStream m=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(m);
		
// identify element
		WebElement first_name=driver.findElement(By.xpath("//input[@name='firstName']"));
		String S=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		first_name.sendKeys(S);
		
		
		WebElement last_name=driver.findElement(By.xpath("//input[@name='lastName']"));
		String S1=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		last_name.sendKeys(S1);
		
		WebElement phone=driver.findElement(By.xpath("//input[@name='phone']"));
		String S2=wb.getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
		phone.sendKeys(S2);
		
		WebElement email=driver.findElement(By.xpath("//input[@name='userName']"));
		String S3=wb.getSheet("Sheet1").getRow(0).getCell(3).getStringCellValue();
		email.sendKeys(S3);
		
		WebElement address=driver.findElement(By.xpath("//input[@name='address1']"));
		String S4=wb.getSheet("Sheet1").getRow(0).getCell(4).getStringCellValue();
		address.sendKeys(S4);
		
		WebElement City=driver.findElement(By.xpath("//input[@name='city']"));
		String S5=wb.getSheet("Sheet1").getRow(0).getCell(5).getStringCellValue();
		City.sendKeys(S5);
		
		WebElement State=driver.findElement(By.xpath("//input[@name='state']"));
		String S6=wb.getSheet("Sheet1").getRow(0).getCell(6).getStringCellValue();
		State.sendKeys(S6);
		
		WebElement code=driver.findElement(By.xpath("//input[@name='postalCode']"));
		String S7=wb.getSheet("Sheet1").getRow(0).getCell(7).getStringCellValue();
		code.sendKeys(S7);
		
		WebElement S8=driver.findElement(By.xpath("//input[@name='country']"));
		Select sel_1=new Select(S8);
		sel_1.selectByIndex(4);
		
		WebElement username=driver.findElement(By.xpath("//input[@name='email']"));
		String S9=wb.getSheet("Sheet1").getRow(0).getCell(9).getStringCellValue();
		username.sendKeys(S9);
		
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		String S10=wb.getSheet("Sheet1").getRow(0).getCell(10).getStringCellValue();
		password.sendKeys(S10);
		
		WebElement conformpassword=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		String S11=wb.getSheet("Sheet1").getRow(0).getCell(11).getStringCellValue();
		conformpassword.sendKeys(S11);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
