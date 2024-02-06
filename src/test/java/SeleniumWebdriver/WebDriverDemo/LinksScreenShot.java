package SeleniumWebdriver.WebDriverDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.mycontactform.com/samples.php");
		int no_of_links = dr.findElements(By.xpath("//*[@id=\"left_col_top\"]/ul/li/a")).size();
		System.out.println(no_of_links); //31 links
		
		for (int i=1;i<=5;i++) {
			int outerLink = dr.findElements(By.xpath("//*[@id=\"left_col_top\"]/ul["+i+"]/li/a")).size();
		for(int j=1;j<=outerLink;j++) {
			dr.findElement(By.xpath("//*[@id=\"left_col_top\"]/ul["+i+"]/li["+j+"]/a")).click();
			System.out.println(outerLink);
		}
		}
		
		TakesScreenshot sc=(TakesScreenshot)dr;
		File file=sc.getScreenshotAs(OutputType.FILE);
//------Single ScreenShots		
		//FileUtils.copyFile(file, new File("C:\\Selenium_ScreenShots\\shot.jpeg"));
		
//------Multiple ScreenShots		
		FileUtils.copyFile(file, new File("C:\\Selenium_ScreenShots\\shot"+System.currentTimeMillis()+".jpeg"));
		
		
		//https://www.softwaretestingmaterial.com/dynamic-xpath-in-selenium/
		
	}

}
