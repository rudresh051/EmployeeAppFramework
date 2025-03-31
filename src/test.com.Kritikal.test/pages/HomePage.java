package pages;

import com.kritikal.framework.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {
    public HomePage() {
    }

    @FindBy(how = How.LINK_TEXT, using = "Login")
    public WebElement lnkLogin;
    @FindBy(how = How.LINK_TEXT, using = "Employee List")
    public WebElement lnkEmployeeList;

    // why are we using BaePage here?
    // All pages extends BasePage as our framework rules
    public BasePage ClickLogin() {
        lnkLogin.click();

        // return login page after click
        // why are we returning a new LoginPage()? Why not just return LoginPage()?
//        because we are returning a new instance of the LoginPage
//        if we return LoginPage() it will return the same instance of the LoginPage
//        which is not what we want
//        we want to return a new instance of the LoginPage
//        so that we can use the new instance to perform the login action
//        and not the same instance of the LoginPage
//        which will not be able to perform the login action
//        because the login action is not defined in the LoginPage
//        but in the HomePage
//        so we need to return a new instance of the LoginPage
        return new LoginPage();
    }
}
