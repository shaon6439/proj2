package SeleniumWebdriver.WebDriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {
	//static WebDriver driver;

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.mycontactform.com/samples.php");
		dr.findElement(By.xpath("//input[@value='Third Option']")).click();
		
	}

}
