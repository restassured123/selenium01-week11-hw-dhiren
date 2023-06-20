package project04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class MultiBrowserComSauceDemo {

    static String baseUrl = "https://www.saucedemo.com";
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {


        System.out.println("Enter 1 for Chrome browser\nEnter 2 for Firefox browser\nEnter 3 for Edge browser\n");
        System.out.println("Enter the number: \n");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch (num) {
            case 1:
                driver = new ChromeDriver();
                break;
            case 2:
                driver = new FirefoxDriver();
                break;
            case 3:
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("Enter number between 1 to 3");
                System.exit(0);
        }
        //Open URL
        driver.get(baseUrl);

        driver.manage().window().maximize();

        //Print the title of the page
        String title = driver.getTitle();
        System.out.println("The title of the page is :" +title);

        //Print the current url
        String url = driver.getCurrentUrl();
        System.out.println("The url is :" + url);

        //Print the page source
        String pageSource = driver.getPageSource();
        System.out.println("The page source is :" + pageSource);

        //Enter the email to email field
        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("dhiren@gmail.com");

        //Enter the password to password field
        WebElement passWord = driver.findElement(By.id("password"));
        passWord.sendKeys("asd123");

        Thread.sleep(2000);

        driver.close();

    }
}
