package SeleniumWebdriver.WebDriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		//WebDriver dr = new ChromeDriver();
		WebDriver dr = new FirefoxDriver();
		dr.manage().window().maximize();
		dr.get("https://jqueryui.com/");
		dr.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a")).click();
		WebElement fr = dr.findElement(By.className("demo-frame"));
		dr.switchTo().frame(fr);
		WebElement drag = dr.findElement(By.id("draggable"));
		WebElement drop = dr.findElement(By.id("droppable"));
		Actions act = new Actions (dr);
		act.dragAndDrop(drag, drop).build().perform();
	}

}
