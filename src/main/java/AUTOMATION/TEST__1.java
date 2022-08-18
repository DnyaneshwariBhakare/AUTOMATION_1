package AUTOMATION;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class TEST__1 {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver Driver=new ChromeDriver();

Driver.get("https://www.google.co.in/");
Driver.manage().window().maximize();
WebElement txt=Driver.findElement(By.xpath("//input[@name='q']"));
txt.sendKeys("Amazon");
Thread.sleep(3000);
List<WebElement> list=Driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
System.out.println(list.size());
for (int a=0;a<list.size();a++)
{
	System.out.println(list.get(a).getText());
	if(list.get(a).getText().equals("amazon prime")) {
		list.get(a).click();
		break;
	}
}


	}

}
