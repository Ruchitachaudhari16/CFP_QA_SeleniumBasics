package Selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locattext {
    WebDriver driver;
   @Test
   public void getlinkfb() throws InterruptedException {
        driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("abcd@gamil.com");
        driver.findElement(By.name("pass")).sendKeys("abc@1234");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Forgotten password?")).click();

   }
}
