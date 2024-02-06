package SeleniumWebdriver.WebDriverDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.mycontactform.com/samples.php");
//		List<WebElement>totalcount = dr.findElements(By.tagName("a"));
//		System.out.println(totalcount.size());
//		for(int i=1;i<totalcount.size();i++) {
//			System.out.println(totalcount.get(i).getText());
//		}
//		WebElement area = dr.findElement(By.xpath("//*[@id=\"header\"]/ul/li[7]/a"));	
//		System.out.println(area.l());
//		for(int i=1;i<area.size();i++) {
//			System.out.println(area.get(i).getText());
		//}
	}
	
	//WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));

}
