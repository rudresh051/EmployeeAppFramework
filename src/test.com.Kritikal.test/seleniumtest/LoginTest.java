package seleniumtest;

import com.kritikal.framework.base.Base;
import com.kritikal.framework.base.BrowserType;
import com.kritikal.framework.base.BrowserType;
import com.kritikal.framework.base.DriverContext;
import com.kritikal.framework.base.FrameworkInitialize;
import com.kritikal.framework.utilities.ExcelUtil;
import jxl.read.biff.BiffException;
import pages.HomePage;
import pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.kritikal.framework.base.Base.CurrentPage;


public class LoginTest extends FrameworkInitialize {


    @BeforeMethod
    public void Initialize() throws BiffException, IOException {
        InitializeBrowser(BrowserType.Chrome);
        DriverContext.Browser.GoToUrl("http://localhost:64429/");

        try {
            ExcelUtil util = new ExcelUtil("C:\\Users\\rudre\\Downloads\\UdemyCourse_UntilExcelUtil\\UdemyCourse\\data.xls");
        }
        catch (Exception e){

        }
    }




//    private WebDriver driver; // Declare WebDriver instance

//    @BeforeMethod
//    public void Initialize(){
//        // Setup ChromeDriver using WebDriverManager
//        WebDriverManager.chromedriver().setup();
//
////      Method1 - Skip SSL warnings entirely, you can configure ChromeOptions:
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--ignore-certificate-errors"); // Ignore SSL warnings
//
//        DriverContext.Driver = new ChromeDriver(options);
//
////        driver.navigate().to("https://test.thestoryofamerica.us/signin?returnUrl=/");
//        DriverContext.Driver.navigate().to("http://localhost:64429/");
//
//
//        // Method2 - Handle SSL warning if present
////        try {
////            driver.findElement(By.id("details-button")).click(); // Click on "Advanced"
////            driver.findElement(By.id("proceed-link")).click();   // Click on "Proceed to site"
////        } catch (Exception e) {
////            System.out.println("SSL Warning not present, continuing...");
////        }
//
//    }

    @Test
    public void Login() throws InterruptedException {
//        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("test");
//        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("test");
//        driver.findElement(By.xpath("//div[contains(text(),'Sign in')]")).click();
//

        CurrentPage = GetInstance(HomePage.class);
        CurrentPage = CurrentPage.As(HomePage.class).ClickLogin();

        Thread.sleep(3000);

        // Hardcoded
//        CurrentPage.As(LoginPage.class).Login("admin","password");

        // DDT from Excel
//        CurrentPage.As(LoginPage.class).Login(ExcelUtil.ReadCell(0,1), ExcelUtil.ReadCell(1,1));
//        CurrentPage.As(LoginPage.class).Login(ExcelUtil.ReadCell(ExcelUtil.GetCell("UserName"), 1),
//                ExcelUtil.ReadCell(ExcelUtil.GetCell("Password"),1));


        CurrentPage.As(LoginPage.class).Login(ExcelUtil.ReadCell("UserName", 1),
                ExcelUtil.ReadCell("Password",1));
    }


}
