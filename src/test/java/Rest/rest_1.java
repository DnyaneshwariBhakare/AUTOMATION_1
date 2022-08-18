package Rest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class rest_1 {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/login/");
driver.manage().window().maximize();

WebElement txt_email=driver.findElement(By.id("email"));
txt_email.sendKeys("dnyaneshwaribhakare@gmail.com");

WebElement txt_password=driver.findElement(By.id("pass"));
txt_password.sendKeys("karma@8999399981");

WebElement btn_login=driver.findElement(By.name("login"));
btn_login.click();

String title=driver.getTitle();
String a=driver.getTitle();
System.out.println(a);









	}

}
