package SeleniumWebdriver.WebDriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.mycontactform.com/samples.php");
		
		int no_of_links = dr.findElements(By.xpath("//*[@id=\"left_col_top\"]/ul/li/a")).size();
		System.out.println(no_of_links); //31 links
		
		for (int i=1;i<=5;i++) {
			int outerLink = dr.findElements(By.xpath("//*[@id=\"left_col_top\"]/ul["+i+"]/li/a")).size();
			//System.out.println(outerLink);
			for(int j=1;j<=outerLink;j++) {
			dr.findElement(By.xpath("//*[@id=\"left_col_top\"]/ul["+i+"]/li["+j+"]/a")).click();
			System.out.println(outerLink);
		}
		}
		
		
		//*[@id="left_col_top"]/ul[1]/li[1]/a
		//*[@id="left_col_top"]/ul[1]/li[2]/a
		
		//*[@id="left_col_top"]/ul[2]/li[1]/a
	}

}
