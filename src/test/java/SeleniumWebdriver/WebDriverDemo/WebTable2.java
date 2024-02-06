package SeleniumWebdriver.WebDriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://en.wikipedia.org/wiki/List_of_countries_and_dependencies_by_population");
//------Scroll down		
		JavascriptExecutor js = (JavascriptExecutor) dr; 
		js.executeScript("window.scrollBy (0,700)", "");
//-------To count how many rows			
		int total_countries = dr.findElements(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table/tbody/tr/td[1]/a")).size();
		System.out.println(total_countries);
//-----Read all the data from web table 		
		for(int i =1; i<242; i++) {
			for(int j =1; j<=3; j++) {
				String countries = dr.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(countries);
			}
			
		}
		
	}
	
	

}
