package pages;

import com.kritikal.framework.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EmployeeList extends BasePage {

    public EmployeeList() {

    }

    @FindBy(how = How.CSS, using = "[class='btn-primary']")
    public WebElement btnCreate;
}
