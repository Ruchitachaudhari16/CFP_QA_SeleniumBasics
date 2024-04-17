package Selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb_Signup {
    public WebDriver driver;
    @Test
    public void SignupFb() throws InterruptedException
    {
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Ruchita");
        driver.findElement(By.name("lastname")).sendKeys("Chaudhari");
        driver.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("abc@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Ruchita@1611");
        driver.findElement(By.name("birthday_day")).sendKeys("16");
        driver.findElement(By.id("month")).sendKeys("Aug");
        driver.findElement(By.id("year")).sendKeys("1997");
        driver.findElement(By.name("sex")).sendKeys("Female");
        //driver.findElement(By.className("_8esa")).sendKeys("Female");
        driver.findElement(By.name("websubmit")).click();
    }
}
