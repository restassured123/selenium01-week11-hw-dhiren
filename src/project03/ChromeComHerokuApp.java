package project03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeComHerokuApp {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        String BaseUrl = "http://the-internet.herokuapp.com/login";

        //Open URL
        driver.get(BaseUrl);

        driver.manage().window().maximize();

        //Print the title of the page
        String title = driver.getTitle();
        System.out.println("The title of page is: " + title);

        //Print the current url
        String url = driver.getCurrentUrl();
        System.out.println("The Url is :" + url);

        //Print the page source
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

        //Enter the email to email field
        WebElement id =driver.findElement(By.id("username"));
        id.sendKeys("dhiren@gmail.com");

        Thread.sleep(2000);

        //Enter the password to password field
        driver.findElement(By.name("password")).sendKeys("abc123");

        Thread.sleep(2000);

        //getting text
        WebElement text =driver.findElement(By.tagName("h4"));
        System.out.println("The text showing is :" + text.getText());

        //close browser
        driver.close();




    }

}
