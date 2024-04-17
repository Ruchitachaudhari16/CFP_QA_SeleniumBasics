package Selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationxy {
    WebDriver driver;

   @Test
   public void getCoordinates()
    {
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        WebElement element=driver.findElement(By.id("email"));
        int x=element.getLocation().getX();
        int y=element.getLocation().getY();

        System.out.println("x Coordinate value is:"+x);
        System.out.println("y Coordinate value is:"+y);
    }
}
