package UK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zoma {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		WebElement DS= driver.findElement(By.xpath("//input[@inputmode=\"numeric\"]"));
		
		DS.sendKeys("7507745658");
		Thread.sleep(3000);
         driver.findElement(By.xpath("//span[text()='Send One Time Password']")).click();
		
	}

}
