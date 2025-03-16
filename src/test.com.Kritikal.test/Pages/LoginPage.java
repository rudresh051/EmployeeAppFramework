package Pages;
//package test.com.Kritikal.test.Pages;


import com.kritikal.framework.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver){
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Username']")
    public WebElement txtUserName;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Password']")
    public WebElement txtPassword;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Sign in')]")
    public WebElement btnLogin;

    public void Login(String userName, String password){
        txtUserName.sendKeys(userName);
        txtPassword.sendKeys(password);
        btnLogin.click();
    }

}