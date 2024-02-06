package SeleniumWebdriver.WebDriverDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://demo.automationtesting.in/Alerts.html");
		
//-----Simple Alert
		dr.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		dr.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		Alert a = dr.switchTo().alert();
		Thread.sleep(2000);
		a.accept();
		
//----Confirm box
		dr.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		dr.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		Alert a1 = dr.switchTo().alert();
		Thread.sleep(2000);
		a1.dismiss();
		
//-----Alert with text box
		dr.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		dr.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		Alert a2 = dr.switchTo().alert();
		System.out.println(a2.getText());
		a2.sendKeys("Shaon");
		a2.accept();
		
		Thread.sleep(2000);
		
		
	}

}
