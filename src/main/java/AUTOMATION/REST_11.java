package AUTOMATION;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class REST_11 {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.co.in/");
driver.manage().window().maximize();

WebElement google_search=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
google_search.sendKeys("gmail");

Thread.sleep(2000);

List<WebElement>list=driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
System.out.println(list.size());

for(int i=0;i<list.size();i++) {
	System.out.println(list.get(i).getText());
	
	if(list.get(i).getText().equals("gmail inbox")) {
		list.get(i).click();
		break;
	}
	
	
	
}




	}

}
