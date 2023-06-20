package project03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserComHerokuApp {
    static String browser = "Chrome";
    static WebDriver driver;
    static String Baseurl = "http://the-internet.herokuapp.com/login";

    public static void main(String[] args) throws InterruptedException {

        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Incorrect Browser name");
        }
        //Open URL
        driver.get(Baseurl);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        //Print the title of the page
        String title = driver.getTitle();
        System.out.println("The title of the page is :" + title);
            //Print the current url
       String url =  driver.getCurrentUrl();
        System.out.println("The url is :" + url);

        //Enter the email to email field
       WebElement id =  driver.findElement(By.id("username"));
       id.sendKeys("dhiren@gmail.com");

       //Enter the password to password field
       WebElement pass= driver.findElement(By.id("password"));
       pass.sendKeys("asd123");

       Thread.sleep(2000);
       driver.close();
    }
}