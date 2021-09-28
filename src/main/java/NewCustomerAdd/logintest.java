package NewCustomerAdd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.security.util.Password;

import javax.print.attribute.standard.RequestingUserName;

public class logintest {

    public static WebDriver driver;
    public static void main(String[] args)
    {
        launch_Browser();
        open_LoginPage();
        TC_001();
        close_Browser();
    }
    public static void launch_Browser()
    {
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    public static void open_LoginPage()
    {
        driver.get("http://demo.guru99.com");
    }



    public static void TC_001()
    {

        WebElement Email =driver.findElement(By.cssSelector("body > form > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=text]"));
        Email.sendKeys("faqeny@acrossgracealley.com");


        WebElement LoginBtn=driver.findElement(By.cssSelector("body > form > table > tbody > tr:nth-child(6) > td:nth-child(2) > input[type=submit]"));
        LoginBtn.click();
    }


    public static void close_Browser()
    {
        driver.close();
    }



}
