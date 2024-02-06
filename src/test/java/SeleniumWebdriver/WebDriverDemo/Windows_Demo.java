package SeleniumWebdriver.WebDriverDemo;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Demo {
	static String win1;
	static String win2;
	

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		dr.get("https://demo.automationtesting.in/Windows.html");
		dr.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		dr.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
//------Name of one window active(Current window)
		String win_name = dr.getWindowHandle();
		System.out.println(win_name);
		
		Set<String> window_names=dr.getWindowHandles();
		Iterator itr = window_names.iterator();
		while(itr.hasNext()) {
			 win1 = (String) itr.next();
			 win2 = (String) itr.next();
			System.out.println(win1);
			System.out.println(win2);
			}
		dr.switchTo().window(win2);
//------Selenium WebSite
		System.out.println(dr.getTitle());
		dr.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/a/span")).click();
		dr.switchTo().defaultContent();
		System.out.println(dr.getTitle());
		dr.switchTo().window(win1);
		System.out.println(dr.getTitle());
		
		
	}

}
