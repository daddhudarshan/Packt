package Test_scripts;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;
import packt_pom.home_page;

public class TestScript2 extends BaseClass {
home_page h=new home_page();

@Test
public void Test1() {
	
	
	 WebElement topNavBar = driver.findElement(By.xpath("//button[@type='button']"));

		for (WebElement link : topNavBar.findElements(By.xpath("//button[@type='button']"))) {
            link.click();
            String expectedPageTitle = "Expected Page Title";
            Assert.assertEquals(driver.getTitle(), expectedPageTitle, "Page title doesn't match.");
            WebElement subMenu = link.findElement(By.cssSelector(".sub-menu"));
            if (subMenu != null) {
                for (WebElement subOption : subMenu.findElements(By.tagName("a"))) {
                    subOption.click();
                }
            }
		}
	}  
}
