package SeleniumWebdriver.WebDriverDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/samples.php");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().back();
		//System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();
	}

}
