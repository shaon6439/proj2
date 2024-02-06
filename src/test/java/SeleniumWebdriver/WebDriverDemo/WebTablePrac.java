package SeleniumWebdriver.WebDriverDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePrac {

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://en.wikipedia.org/wiki/List_of_countries_and_dependencies_by_population");
		WebElement tbody = dr.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table"));
//-------To count how many rows		
		List<WebElement> row = tbody.findElements(By.tagName("tr"));
		System.out.println(row.size());
//-----Read all the data from web table 	
		for(int i =0; i<row.size(); i++) {
			List<WebElement> cell = row.get(i).findElements(By.tagName("td"));
				for(int j =0; j<cell.size(); j++) {
				System.out.println(cell.get(j).getText());
			}
		}
	}

}
