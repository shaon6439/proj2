package SeleniumWebdriver.WebDriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_API {

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.mycontactform.com/samples.php");
		WebElement ele = dr.findElement(By.xpath("//input[@value='Third Option']"));
		System.out.println(ele.isDisplayed());
		System.out.println(ele.isSelected());
		ele.click();
		System.out.println(ele.isSelected());
		//dr.close();
	}

}
