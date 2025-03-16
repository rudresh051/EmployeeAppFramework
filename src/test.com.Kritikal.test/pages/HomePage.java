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

    public void ClickLogin() {
        lnkLogin.click();
    }
}
