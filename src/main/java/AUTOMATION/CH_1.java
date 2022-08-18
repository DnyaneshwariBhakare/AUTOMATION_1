package AUTOMATION;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CH_1 {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://demo.guru99.com/test/newtours/register.php");
driver.manage().window().maximize();

WebElement txt=driver.findElement(By.xpath("//select[@name='country']"));
Select a=new Select(txt);

System.out.println(a.getFirstSelectedOption().getText());
//selectBYIndex(index)
a.selectByIndex(5);

Thread.sleep(2000);
//slectbyvalue()
a.selectByValue("BHUTAN");
Thread.sleep(2000);
//selectbyvisibleText()
a.selectByVisibleText("ANGOLA");

List<WebElement>list=a.getOptions();
System.out.println(list.size());

for(int B=0;B<list.size();B++) {
	String n=list.get(B).getText();
	System.out.println(n);
	
	if(n.equals("BRAZIL")) {
		a.selectByVisibleText("BRAZIL");
		break;
	}
	
}





	}

}
