package project01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxComNopcommerce {

    public static void main(String[] args) throws InterruptedException {

        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";

        //Setup FireFox browser
        WebDriver driver = new FirefoxDriver();

        //Open URL
        driver.get(baseUrl);

        driver.manage().window().maximize();

        //Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        //Print the current url
        System.out.println("The current url is " + driver.getCurrentUrl());

        //Print the page source
        System.out.println("The page source of current url is" + driver.getPageSource());

        //Enter the email to email field
        driver.findElement(By.name("Email"));
        WebElement userName = driver.findElement(By.name("Email"));
        userName.sendKeys("dhiren@gmail.com");

        //Enter the password to password field
        driver.findElement(By.id("Password")).sendKeys("abc123");

        Thread.sleep(3000);

        //Getting text using tag-name

        WebElement welcomeText = driver.findElement(By.tagName("h1"));
        //String text = welcomeText.getText();
        System.out.println(welcomeText.getText());




        driver.close();


    }
}
