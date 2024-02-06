package SeleniumWebdriver.WebDriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://jqueryui.com/");
		dr.findElement(By.linkText("Selectable")).click();
		WebElement fr = dr.findElement(By.className("demo-frame"));
		dr.switchTo().frame(fr);
		dr.findElement(By.xpath("//*[@id=\"selectable\"]/li[5]")).click();
		

	}

}
