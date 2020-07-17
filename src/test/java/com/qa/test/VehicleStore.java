package com.qa.test;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 

public class VehicleStore {

 

     @Test
     
      public void store() {   
         
         
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\neha\\Desktop\\neha\\driver\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("http://localhost:8585/VehicleStore/");
                    
                    
                        String actualTitle = driver.getTitle();
                        driver.manage().window().maximize();
                        String expectedTitle = "Vehicle Store";
                        if(actualTitle.equalsIgnoreCase(expectedTitle))
                            System.out.println("Title Matched");
                        else
                            System.out.println("Title didn't match");
                       
}
     
     }