package project02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Scanner;

public class MultiBrowserComOrangehrmLive {
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;


    public static void main(String[] args) throws InterruptedException {

        System.out.println("Enter 1 for ChromeBrowser\nEnter 2 for FireFoxBrowser\nEnter 3 for EdgeBrowser ");
        System.out.print("Enter the Number : ");
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
                System.out.println("Enter the valid number");
                System.exit(0);
        }
        //Open URL
        driver.get(baseUrl);

        ////Maximize browser
        driver.manage().window().maximize();

        //we give implicit wait to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        //Print the title of the page
        String title = driver.getTitle();
        System.out.println("Title of the page is :" + title);

        //Print the current url
        String url = driver.getCurrentUrl();
        System.out.println("The url is : " + url);

        //Print the page source
        String PageSource = driver.getPageSource();
        System.out.println("Page source is :" + PageSource);

        //Enter the email to email field
        WebElement email = driver.findElement(By.name("username"));
        email.sendKeys("dhiren@gmail.com");

        //Enter the password to password field
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("abc123");

        //Wait for 10 seconds
        Thread.sleep(3000);

        //Close the browser
        driver.close();
    }
}
