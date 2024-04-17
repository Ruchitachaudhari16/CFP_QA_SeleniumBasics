package Selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

import static java.lang.Thread.sleep;

public class CssSelector {
    WebDriver driver;
    @Test
    public void getCssSelector() throws InterruptedException, IOException
    {
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
       // driver.findElement(By.cssSelector("input[id='email']"));

        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Ruchita");
        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Chaudhari");
    driver.findElement(By.cssSelector("select[id='day']")).sendKeys("16");
    }
}
