package NewCustomerAdd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewCustomerAdd {

    public static WebDriver driver;
    public static void main(String[] args)
    {
        launch_Browser();
        open_LoginPage();
        TC_001();

        open_AddCustomer_Page();

        TC_002();
        //TC_003();
        ///TC_004();
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
        driver.get("http://demo.guru99.com/V1/index.php");
    }


    public static void TC_001()
    {
        WebElement Email=driver.findElement(By.cssSelector("body > form > table > tbody > tr:nth-child(1) > td:nth-child(2) > input[type=text]"));
        Email.sendKeys("mngr355629");


        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("jahupuz");

        WebElement LoginBtn=driver.findElement(By.cssSelector("body > form > table > tbody > tr:nth-child(3) > td:nth-child(2) > input[type=submit]:nth-child(1)"));
        LoginBtn.click();



    }

    public static void open_AddCustomer_Page()
    {
        driver.get("http://demo.guru99.com/V1/html/addcustomerpage.php");
    }

    public static void TC_002()
    {
        WebElement CustomerName=driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(4) > td:nth-child(2) > input[type=text]"));
        CustomerName.sendKeys("Anwar");


        WebElement Gender=driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=radio]:nth-child(1)"));
        Gender.click();

        WebElement DOB=driver.findElement(By.name("dob"));
        DOB.sendKeys("26/09/2021");

        WebElement Address=driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(7) > td:nth-child(2) > textarea"));
        Address.sendKeys("Uttra,H-12,R-6");

        WebElement City=driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(8) > td:nth-child(2) > input[type=text]"));
        City.sendKeys("Dhaka");

        WebElement State=driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(9) > td:nth-child(2) > input[type=text]"));
        State.sendKeys("uttra");

        WebElement PIN=driver.findElement(By.name("pinno"));
        PIN.sendKeys("321321");

        WebElement Telephone=driver.findElement(By.name("telephoneno"));
        Telephone.sendKeys("01712834711");

        WebElement Email=driver.findElement(By.name("emailid"));
        Email.sendKeys("alamin.h@testmail.com");

        WebElement Accinfosubmit=driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > tr:nth-child(13) > td:nth-child(2) > input[type=submit]:nth-child(1)"));
        Accinfosubmit.submit();

    }

    public static void close_Browser()
    {
        driver.close();
    }


}
