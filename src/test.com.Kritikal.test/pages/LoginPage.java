package pages;
//package test.com.Kritikal.test.Pages;


import com.kritikal.framework.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage{

    public LoginPage(){

    }

    @FindBy(how = How.NAME, using = "UserName")
    public WebElement txtUserName;

    @FindBy(how = How.NAME, using = "Password")
    public WebElement txtPassword;

    @FindBy(how = How.XPATH, using = "//input[@value='Log in']")
    public WebElement btnLogin;

    public BasePage Login(String userName, String password) throws InterruptedException {
        txtUserName.sendKeys(userName);
        txtPassword.sendKeys(password);
        Thread.sleep(2000);
        btnLogin.click();
        return GetInstance(HomePage.class);
    }

}