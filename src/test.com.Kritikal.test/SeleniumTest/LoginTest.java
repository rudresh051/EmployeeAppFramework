package SeleniumTest;

import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginTest {
    private WebDriver driver; // Declare WebDriver instance

    @BeforeMethod
    public void Initialize(){
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

//      Method1 - Skip SSL warnings entirely, you can configure ChromeOptions:
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-certificate-errors"); // Ignore SSL warnings

        driver = new ChromeDriver(options);

        driver.navigate().to("https://test.thestoryofamerica.us/signin?returnUrl=/");


        // Method2 - Handle SSL warning if present
//        try {
//            driver.findElement(By.id("details-button")).click(); // Click on "Advanced"
//            driver.findElement(By.id("proceed-link")).click();   // Click on "Proceed to site"
//        } catch (Exception e) {
//            System.out.println("SSL Warning not present, continuing...");
//        }

    }

    @Test
    public void login(){
//        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("test");
//        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("test");
//        driver.findElement(By.xpath("//div[contains(text(),'Sign in')]")).click();
//
        LoginPage page = new LoginPage(driver);
        page.Login("washstudent","history101");

    }
}
