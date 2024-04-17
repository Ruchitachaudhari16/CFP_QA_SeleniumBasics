package Selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb_Login {
    public WebDriver driver;

    @Test
    public  void fbLogin() throws InterruptedException {
        //Automate Facebook signin using selenium
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("abc123@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("pass")).sendKeys("abcd1234@fb");
        Thread.sleep(2000);
        driver.findElement(By.name("login")).click();
        driver.findElement(By.linkText("Forgotten password?")).click();
    }
}
