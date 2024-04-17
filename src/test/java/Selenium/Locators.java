package Selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Locators {
    WebDriver driver;

    @Test
    public void getXpath()
    {
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc");
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("abc");
        driver.findElement(By.xpath("//button[@name='login']")).click();

    }

    }
