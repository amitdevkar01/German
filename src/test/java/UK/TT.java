package UK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TT {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
    	driver.manage().window().maximize();
    	
        driver.get("https://app.germanyiscalling.com/");
        Thread.sleep(3000);
        
        WebElement EmailF = driver.findElement(By.id("username"));
        EmailF.click();
        EmailF.sendKeys("raspbiansec@gmail.com");

        Thread.sleep(2000);

        WebElement passF = driver.findElement(By.id("password"));
        passF.sendKeys("Priya@4545");

        Thread.sleep(2000);

        WebElement logBut = driver.findElement(By.xpath("//button[text()='Log In']"));
        Thread.sleep(2000);

        logBut.click();
       System.out.println(  driver.getTitle()); 
     
        String expectedUrl = "Upload your CV | Germany Is Calling";
        		
        String ActualT = driver.getTitle();
        Assert.assertEquals(expectedUrl, ActualT);
        
//        git add
        
	}

}
