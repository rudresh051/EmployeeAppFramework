package com.kritikal.framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.openqa.selenium.remote.Browser.IE;

public class FrameworkInitialize extends Base
{
    WebDriver driver=null;

    public void InitializeBrowser(BrowserType browserType){
        switch (browserType)
        {
            case Chrome:{
                driver = new ChromeDriver();
                break;
            }
            case Firefox:{
                System.setProperty("webdriver.gecko.driver","c:\\lib\\geckodriver.exe");
                DriverContext.Driver = new FirefoxDriver();
                break;
            }
            case IE:{
                break;
            }
        }
        DriverContext.setDriver(driver);
        // Browser
        DriverContext.Browser = new Browser(driver);
    }
}
