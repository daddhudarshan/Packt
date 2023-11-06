package Test_scripts;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class TestScript3 extends BaseClass {

	
	
	@Test
	public void CarouselTest() throws InterruptedException {
		 List<WebElement> ele = driver.findElements(By.xpath("//span[@class='align-self-end']"));
		
		 
		for(WebElement list : ele){
		        Thread.sleep(500);
		        list.click();
		
		   String elementText = list.getText();
		   String expectedText = "Causal Inference and Discovery in Python";
		
		   if (elementText.equals(expectedText)) {
	            System.out.println("Validation passed: Element text is as expected.");
	        } else {
	            System.out.println("Validation failed: Element text does not match the expected text.");
	        }
		
	}
   }
}
