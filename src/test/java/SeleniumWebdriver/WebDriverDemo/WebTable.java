package SeleniumWebdriver.WebDriverDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://en.wikipedia.org/wiki/List_of_countries_and_dependencies_by_population");
		List<WebElement> rows = dr.findElements(By.xpath("//table[1]/tbody[1]/tr"));
		System.out.println(rows.size());
		
		String countryName = dr.findElement(By.xpath("//table[1]/tbody[1]/tr[9]/td")).getText();
		System.out.println("Name of Country : " + countryName);
		String info = dr.findElement(By.xpath("//table[1]/tbody[1]/tr[9]")).getText();
		System.out.println("Information of BD : " + info);
		String population = dr.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table/tbody/tr[9]/td[2]")).getText();
		System.out.println("Population of Bangladesh : " + population);
		
		
		//WebElement tbody = dr.findElement(By.xpath(""));
		//List<WebElement> row = tbody.findElements(By.tagName("tr"));
		//System.out.println(row.size());
		
		////*[@id="mw-content-text"]/div[1]/table
	}

}
