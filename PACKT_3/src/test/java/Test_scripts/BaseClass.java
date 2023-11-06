package Test_scripts;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClass {
	public static WebDriver staticdriver; 
	public  WebDriver driver;
	
	
	@BeforeClass
	public void launchBrowser() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
	}
	
	@BeforeMethod
	public void oppApp() throws Throwable {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://subscription.packtpub.com/register");
     	driver.findElement(By.xpath("//div[@class='text-center']")).click();
	    driver.findElement(By.xpath("//input[@id='login-input-email']")).sendKeys("darshandevaraj10@gmail.com");
	    driver.findElement(By.xpath("//input[@id='login-input-password']")).sendKeys("Karekal79$");
	    driver.findElement(By.xpath("//button[@ng-show='!loginController.loadingLogin']")).click();
	    System.out.println("oppenapplication");
		
	}
	
	@AfterMethod
	public void closeApp() {
		driver.findElement(By.xpath("//a[@class='style-1 d-none d-lg-inline nav-link']")).click();
		System.out.println("closeapplication");	
	}

	@AfterClass
	public void closeBrowser() {
    driver.close();
	System.out.println("closeBrowser");	
	}
}
