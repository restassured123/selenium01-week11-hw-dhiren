package project04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeComSauceDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://www.saucedemo.com";

        driver.get(baseUrl);

        driver.manage().window().maximize();

        String titleOfPage = driver.getTitle();
        System.out.println("Title of Page is :" + titleOfPage);

        String url = driver.getCurrentUrl();
        System.out.println("The url is : " + url);

        String PageSource = driver.getPageSource();
        System.out.println("Page source is ; " + PageSource);

        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("dhiren@gmail.com");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("asd123");

        WebElement welcome = driver.findElement(By.tagName("div"));
        String text = welcome.getText();
        System.out.println("The text is :" +  text);

        Thread.sleep(2000);

        driver.close();


    }
}
