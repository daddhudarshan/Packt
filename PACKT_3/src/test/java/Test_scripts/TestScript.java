package Test_scripts;

import java.awt.Color;
import javax.lang.model.element.Element;
import javax.lang.model.util.Elements;
import javax.swing.text.Document;

import org.jsoup.Jsoup;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;

import packt_pom.home_page;

public class TestScript extends BaseClass {
home_page h=new home_page();
	
	
	@Test
	
	public void Test1() throws Throwable {
	String pactktcolor=h.homebutton.getCssValue("color");
    String hexColor=org.openqa.selenium.support.Color.fromString(pactktcolor).asHex();
       if(hexColor.equals("#6d737d"))
		     System.out.println("Color is same");
	   else
			 System.out.println("Color is different");
		 
	}  
    public void Test2() throws Throwable {	
	String pactktcolor=h.browserlibrary.getCssValue("color");
	String hexColor=org.openqa.selenium.support.Color.fromString(pactktcolor).asHex();
		 if(hexColor.equals("#454a55"))
		     System.out.println("Color is same");
		 else
			 System.out.println("Color is different");
		 
	}  
  
    public void Test3() throws Throwable {
    String pactktcolor=h.advancesearch.getCssValue("color");
  	String hexColor=org.openqa.selenium.support.Color.fromString(pactktcolor).asHex();
  		 if(hexColor.equals("#ec6611"))
  		      System.out.println("Color is same");
  		 else
  			 System.out.println("Color is different");
  		 
  	} 
    
     public void Test4() throws Throwable {
     String pactktcolor=h.searchfield.getCssValue("color");
  	 String hexColor=org.openqa.selenium.support.Color.fromString(pactktcolor).asHex();
  		 if(hexColor.equals("#f5f6fa"))
  		     System.out.println("Color is same");
  		 else
  			 System.out.println("Color is different");
  		 
  	} 
     public void Test5() throws Throwable {
     String pactktcolor=h.librarydropdown.getCssValue("color");
     String hexColor=org.openqa.selenium.support.Color.fromString(pactktcolor).asHex();
       		 if(hexColor.equals("#454a55"))
         		 System.out.println("Color is same");
       		 else
       			 System.out.println("Color is different");
}
          
     public void Test6() throws Throwable {
     String pactktcolor=h.resentdropdown.getCssValue("color");
     String hexColor=org.openqa.selenium.support.Color.fromString(pactktcolor).asHex();
        	if(hexColor.equals("#454a55"))
              System.out.println("Color is same");
            else
        	  System.out.println("Color is different");
 }      
        
     public void Test7() throws Throwable {
     String pactktcolor=h.startfreetrail.getCssValue("color");
     String hexColor=org.openqa.selenium.support.Color.fromString(pactktcolor).asHex();
     	   if(hexColor.equals("#fff"))
     		     System.out.println("Color is same");
     		else
     			 System.out.println("Color is different");
}      
   
     public void Test8() throws Throwable {
     String pactktcolor=h.readnowbutton.getCssValue("color");
     String hexColor=org.openqa.selenium.support.Color.fromString(pactktcolor).asHex();
      	   if(hexColor.equals("#fff"))
      		 System.out.println("Color is same");
      	 else
      		System.out.println("Color is different");
 }   
     
     
     @Test
     
     public void TestSize1() {
    	 Point p=h.homebutton.getLocation();
    	 System.out.println("X-Cord--"+p.x + " "+p.getX());
    	 System.out.println("Y-Cord--"+p.x + " "+p.getY());
    	 
    	 Dimension d=h.homebutton.getSize();
    	 System.out.println("Width"+d.width + " "+d.getWidth());
    	 System.out.println("Length"+d.height + " "+d.getHeight());
    	 if(d.equals("74px"))
    		 System.out.println("Size is Same ");
      	 else
      		System.out.println("Size is different"); 
     }
     
     public void TestSize2() {
    	 Point p=h.browserlibrary.getLocation();
    	 System.out.println("X-Cord--"+p.x + " "+p.getX());
    	 System.out.println("Y-Cord--"+p.x + " "+p.getY());
    	 Dimension d=h.browserlibrary.getSize();
    	 System.out.println("Width"+d.width + " "+d.getWidth());
    	 System.out.println("Length"+d.height + " "+d.getHeight());
    	 if(d.equals("16px"))
    		 System.out.println("Size is Same ");
      	 else
      		System.out.println("Size is different"); 
     }  
     
     
     public void TestSize3() {
    	 Point p=h.advancesearch.getLocation();
    	 System.out.println("X-Cord--"+p.x + " "+p.getX());
    	 System.out.println("Y-Cord--"+p.x + " "+p.getY());
    	 Dimension d=h.advancesearch.getSize();
    	 System.out.println("Width"+d.width + " "+d.getWidth());
    	 System.out.println("Length"+d.height + " "+d.getHeight());
    	 if(d.equals("40px"))
    		 System.out.println("Size is Same ");
      	 else
      		System.out.println("Size is different"); 
     } 
     

     public void TestSize4() {
    	 Point p=h.searchfield.getLocation();
    	 System.out.println("X-Cord--"+p.x + " "+p.getX());
    	 System.out.println("Y-Cord--"+p.x + " "+p.getY());
    	 Dimension d=h.searchfield.getSize();
    	 System.out.println("Width"+d.width + " "+d.getWidth());
    	 System.out.println("Length"+d.height + " "+d.getHeight());
    	 if(d.equals("250px"))
    		 System.out.println("Size is Same ");
      	 else
      		System.out.println("Size is different"); 
     }
     
     public void TestSize5() {
    	 Point p=h.librarydropdown.getLocation();
    	 System.out.println("X-Cord--"+p.x + " "+p.getX());
    	 System.out.println("Y-Cord--"+p.x + " "+p.getY());
    	 Dimension d=h.librarydropdown.getSize();
    	 System.out.println("Width"+d.width + " "+d.getWidth());
    	 System.out.println("Length"+d.height + " "+d.getHeight());
    	 if(d.equals("16px"))
    		 System.out.println("Size is Same ");
      	 else
      		System.out.println("Size is different"); 
     }
     public void TestSize6() {
    	 Point p=h.resentdropdown.getLocation();
    	 System.out.println("X-Cord--"+p.x + " "+p.getX());
    	 System.out.println("Y-Cord--"+p.x + " "+p.getY());
    	 Dimension d=h.resentdropdown.getSize();
    	 System.out.println("Width"+d.width + " "+d.getWidth());
    	 System.out.println("Length"+d.height + " "+d.getHeight());
    	 if(d.equals("16px"))
    		 System.out.println("Size is Same ");
      	 else
      		System.out.println("Size is different"); 
     }
     
     @Test
      public void TestText1() {
    	 try {
    		 boolean display=h.homebutton.isDisplayed();
    		 if(display)
    			 System.out.println("Element is presrnt");
    	     }
    	 
    	 catch(NoSuchElementException e) {
    	 System.out.println("Element is not present");
	 }
     }
     
     public void TestText2() {
    	 try {
    		 boolean display=h.browserlibrary.isDisplayed();
    		 if(display)
    			 System.out.println("Element is presrnt");
    	     }
    	 
    	 catch(NoSuchElementException e) {
    	 System.out.println("Element is not present");
	 }
     }
     
     public void TestText3() {
    	 try {
    		 boolean display=h.advancesearch.isDisplayed();
    		 if(display)
    			 System.out.println("Element is presrnt");
    	     }
    	 
    	 catch(NoSuchElementException e) {
    	 System.out.println("Element is not present");
	 }
     }
     
     public void TestText4() {
    	 try {
    		 boolean display=h.searchfield.isDisplayed();
    		 if(display)
    			 System.out.println("Element is presrnt");
    	    }
    	 
    	 catch(NoSuchElementException e) {
    	 System.out.println("Element is not present");
	 }
     }
     public void TestText5() {
    	 try {
    		 boolean display=h.browserlibrary.isDisplayed();
    		 if(display)
    			 System.out.println("Element is presrnt");
    	    }
    	 
    	 catch(NoSuchElementException e) {
    	 System.out.println("Element is not present");
	 }
     }
     
     public void TestText6() {
    	 try {
    		 boolean display=h.resentdropdown.isDisplayed();
    		 if(display)
    			 System.out.println("Element is presrnt");
    	    }
    	 
    	 catch(NoSuchElementException e) {
    	 System.out.println("Element is not present");
	 }
     }
     public void TestText7() {
    	 try {
    		 boolean display=h.signoutbutton.isDisplayed();
    		 if(display)
    			 System.out.println("Element is presrnt");
    	     }
    	 
    	 catch(NoSuchElementException e) {
    	 System.out.println("Element is not present");
	 }
     }
}
