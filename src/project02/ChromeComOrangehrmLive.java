package project02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeComOrangehrmLive {

    public static void main(String[] args) {

        String baseUrl = "https://opensource-demo.orangehrmlive.com";

        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);

        driver.manage().window().maximize();

        String title = driver.getTitle();
        System.out.println("Title os page is : " + title);

        System.out.println("The current Url is : " + driver.getCurrentUrl());

        System.out.println("The page source is : " + driver.getPageSource());

        WebElement email = driver.findElement(By.name("username"));
        email.sendKeys("dhiren@gmail.com");

        WebElement passWord = driver.findElement(By.name("password"));
        passWord.sendKeys("abc123");

        WebElement text1=driver.findElement(By.tagName("p"));
        String text = text1.getText();
        System.out.println(text);


        driver.close();

    }
}
