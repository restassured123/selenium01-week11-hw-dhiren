package project01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeComNopcommerce {

    public static void main(String[] args) throws InterruptedException {

        String BaseUrl= ("https://demo.nopcommerce.com/login?returnUrl=%2F");

        //Setup Chrome browser
        WebDriver driver = new ChromeDriver();

        //Open URL
        driver.get(BaseUrl);
        driver.manage().window().maximize();

        //Print the title of the page
        String title=driver.getTitle();
        System.out.println(title);

        //Print the current url
        System.out.println(driver.getCurrentUrl());

        //Print the page source
        System.out.println(driver.getPageSource());

        //Enter the email to email field
        WebElement emailField=driver.findElement(By.id("Email"));
        emailField.sendKeys("dhiren@gmail.com");

        Thread.sleep(3000);

        //Enter the password to password field
        driver.findElement(By.name("Password")).sendKeys("abc123");
        Thread.sleep(3000);



        driver.close();




    }
}
