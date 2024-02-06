package SeleniumWebdriver.WebDriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
	//------get the URL
			driver.get("https://www.mycontactform.com/samples.php");
			System.out.println(driver.getTitle());
	//------maximize the screen
			driver.manage().window().maximize();
	//------text box
			driver.findElement(By.id("subject")).sendKeys("email");
			//System.out.println(driver);
			driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
	//------check box 		
			driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/div/input[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[1]/td/div/input[3]")).click();
	//------drop down
			WebElement ele = driver.findElement(By.id("q3"));
			Select s = new Select(ele);
			s.selectByVisibleText("Third Option");
			
	}

}
