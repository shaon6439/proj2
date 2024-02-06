package SeleniumWebdriver.WebDriverDemo;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ScreenShotParticularElement {

	public static void main(String[] args) throws IOException {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.mycontactform.com/samples.php");
		WebElement ele = dr.findElement(By.xpath("//input[@value='Third Option']"));
		ele.click();
		//Take entire page
		TakesScreenshot shot =(TakesScreenshot) dr;
		File src = shot.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Selenium_ScreenShots\\shot.jpeg");
		FileUtils.copyFile(src,dest);
		
		//particular element
		
		//get location
		
		Point pt = ele.getLocation();
		//width and height
		int width = ele.getSize().getWidth();
		int height = ele.getSize().getHeight();
		
		Screenshot  shotelement = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(2000)).takeScreenshot(dr,ele);
		ImageIO.write(shotelement.getImage(),"jpeg",new File("C:\\Selenium_ScreenShots\\shot.jpeg"));
		
		dr.close();

	}

}
