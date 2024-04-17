package Selenium;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public WebDriver driver; // create object of webdriver class.

   @Test
   public void facebookLogin()
    {
        driver=new ChromeDriver(); //Open the chrome browser.
        driver.get("https://www.facebook.com/"); //Launch the application

        driver.manage().window().maximize();// Maximize the window

        //To get title of the browserwindow(Current window)
        String title=driver.getTitle();
        System.out.println(title);

        //To get current url
        String url=driver.getCurrentUrl();
        System.out.println(url);

        //To get PageSource(source code of particular Page)
        String source= driver.getPageSource();
        System.out.println(source);

        //To close the particular browser tab
        //driver.close();

        //to close all the browser by selenium
        //driver.quit();

        //Navigate to:- it will navigate to another url for same tab
        driver.navigate().to("https://www.flipkart.com/");

        //Naviagate back:- it will come back to previous url
        driver.navigate().back();

        //Navigate forward that takes you forward by one page on the browser's history
        driver.navigate().forward();

        //Navigate refresh it refresh the page.
        driver.navigate().refresh();
    }
}
