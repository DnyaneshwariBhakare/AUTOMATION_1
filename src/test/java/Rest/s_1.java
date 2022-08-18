package Rest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class s_1 {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/login/");;

String title=driver.getTitle();
System.out.println(title);

String url=driver.getCurrentUrl();
System.out.println(url);

driver.navigate().to("https://mvnrepository.com/");
Thread.sleep(7000);
driver.navigate().back();
Thread.sleep(7000);
driver.navigate().forward();

Thread.sleep(7000);
driver.navigate().refresh();

driver.close();


















	}

}
