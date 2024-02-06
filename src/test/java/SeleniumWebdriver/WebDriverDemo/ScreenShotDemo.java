package SeleniumWebdriver.WebDriverDemo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class ScreenShotDemo {

	public static void main(String[] args) throws IOException {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.mycontactform.com/samples.php");
		dr.findElement(By.xpath("//input[@value='Third Option']")).click();
		//Take entire page
		TakesScreenshot shot =(TakesScreenshot) dr;
		File src = shot.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Selenium_ScreenShots\\shot.jpeg");
		FileUtils.copyFile(src,dest);
		
	}

}
