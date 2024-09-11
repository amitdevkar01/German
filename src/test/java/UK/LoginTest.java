package UK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	    WebDriver driver;

	    @BeforeMethod
	    public void setup() throws InterruptedException {
	    	 driver =new ChromeDriver();
	    	driver.manage().window().maximize();
	    	
	        driver.get("https://app.germanyiscalling.com/");
	        Thread.sleep(3000);
	    }

	    @Test(priority = 1 )
	    public void testSuccLogin() throws InterruptedException {
	        WebElement EmailF = driver.findElement(By.id("username"));
	        EmailF.click();
	        EmailF.sendKeys("raspbiansec@gmail.com");

	        Thread.sleep(2000);

	        WebElement passF = driver.findElement(By.id("password"));
	        passF.sendKeys("Priya@4545");

	        Thread.sleep(2000);

	        WebElement logBut = driver.findElement(By.xpath("//button[text()='Log In']"));
	        Thread.sleep(2000);


	        logBut.click();//
	        System.out.println(  driver.getTitle()); 
     
	         String expectedUrl = "Upload your CV | Germany Is Calling";
         		
	         String ActualT = driver.getTitle();
	         Assert.assertEquals(expectedUrl, ActualT);
////	         
//	        
	    }

	    @Test(priority = 2)
	    public void UnsuccessfulLogin() throws InterruptedException {
	        WebElement EmaiFi = driver.findElement(By.id("username"));
	        EmaiFi.clear();
	        EmaiFi.sendKeys("defefemail@example.com");
	        Thread.sleep(2000);

	        WebElement passFi = driver.findElement(By.id("password"));
	        passFi.clear();
	        passFi.sendKeys("feffe5");
	        Thread.sleep(2000);

	        WebElement loginB = driver.findElement(By.xpath("//button[text()='Log In']"));
	        Thread.sleep(2000);

	        loginB.click();
	        Thread.sleep(2000);

	        
	        WebElement Msg = driver.findElement(By.xpath("//div[@class=\"alert alert-danger\"]/child::ul/child::li"));
	        Assert.assertTrue(Msg.isDisplayed());
	        Assert.assertEquals(Msg.getText(), "Please enter a correct username and password. Note that both fields may be case-sensitive.");
		    driver.close();

	    }

	    @AfterMethod
	    public void lod() {
	      
	            driver.quit();  
	        }
	    
	    
	}



