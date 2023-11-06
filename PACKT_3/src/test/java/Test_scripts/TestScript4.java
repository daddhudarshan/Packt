package Test_scripts;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import packt_pom.home_page;


public class TestScript4 extends BaseClass {
	@Test
	public void Test() {
		home_page h=new home_page();
		h.clkonbrowserlibrary();
		driver.findElement(By.xpath("//button[@class='reset-button']")).click();
		WebElement ele=driver.findElement(By.xpath("//div[contains(text(),'Published Year')]"));
		Select select=new Select(ele);
		select.selectByVisibleText("2021");
		WebElement w=driver.findElement(By.xpath("//div[@class='search-input-wrapper mr-2']"));
		
		w.sendKeys("Python");
        String enteredText1=w.getAttribute("value");
        String expectedEnteredText1="Python";
        if (enteredText1.equals(expectedEnteredText1)) {
            System.out.println("Validation passed: Entered text matches expected text.");
        } else {
            System.out.println("Validation failed: Entered text does not match expected text.");
        }
        
        w.sendKeys("Paint");
        String enteredText2=w.getAttribute("value");
        String expectedEnteredText2="Paint";
        if (enteredText2.equals(expectedEnteredText2)) {
            System.out.println("Validation passed: Entered text matches expected text.");
        } else {
            System.out.println("Validation failed: Entered text does not match expected text.");
        }
        
        w.sendKeys("Secure");
        String enteredText3=w.getAttribute("value");
        String expectedEnteredText3= "Secure";
        if (enteredText3.equals(expectedEnteredText3)) {
            System.out.println("Validation passed: Entered text matches expected text.");
        } else {
            System.out.println("Validation failed: Entered text does not match expected text.");
        }

        w.sendKeys("Tableau");
        String enteredText4=w.getAttribute("value");
        String expectedEnteredText4="Tableau";
        if (enteredText4.equals(expectedEnteredText4)) {
            System.out.println("Validation passed: Entered text matches expected text.");
        } else {
            System.out.println("Validation failed: Entered text does not match expected text.");
        }
	}
}
