package com.kritikal.framework.base;

import org.openqa.selenium.WebDriver;

public class Browser {

    private WebDriver _driver;

    public Browser(WebDriver driver) {
        _driver = driver;
    }

    public BrowserType Type;

    public void GoToUrl(String url){
        _driver.get(url);
    }

    public void Maximize(){
        _driver.manage().window().maximize();
    }

}

