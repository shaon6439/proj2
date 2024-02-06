package SeleniumWebdriver.WebDriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://google.com/");
		WebElement ele = dr.findElement(By.className("gLFyf"));
		Actions act = new Actions(dr);
//--------Right click		
		act.contextClick(ele).sendKeys(Keys.DOWN,Keys.UP,Keys.ENTER).build().perform();
		
//--------Right click		
		//act.moveToElement(ele).perform();
		//act.contextClick().perform();
	}

}
