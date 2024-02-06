package SeleniumWebdriver.WebDriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.browserstack.com/");
		WebElement products = dr.findElement(By.xpath("//*[@id=\"products-dd-toggle\"]"));
		Actions act = new Actions (dr);
		act.moveToElement(products).build().perform();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//*[@id=\"products-dd-tabpanel-1\"]/div[1]/div[2]/a")).click();
	}

}
