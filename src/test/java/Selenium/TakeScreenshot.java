package Selenium;

import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;


public class TakeScreenshot {
    public WebDriver driver;

    @Test
    public void fbtakescreenshot() throws InterruptedException, IOException
    {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        TakesScreenshot ts = (TakesScreenshot) driver; // Corrected interface name
        File SFile = ts.getScreenshotAs(OutputType.FILE);
        File DFile = new File("C:\\Users\\www.abcom.in\\IdeaProjects\\ProjectSelenium\\src\\main\\java\\Screenshot\\abc.png"); // Fixed the path separator and added missing "\" before "abc.png"
        FileHandler.copy(SFile, DFile);
    }


}