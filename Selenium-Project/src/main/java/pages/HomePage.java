package pages;

import static browser.Browser.getPropertyValue; //use this in order to not write "userNameElement.sendKeys(Browser.getPropertyValue("userName"));"
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class HomePage {

    @FindBy(id = "txtUsername") private WebElement userNameElement; //private because we dont need to call userName anywhere else (we'll just call the whole class)
    @FindBy(id = "txtPassword") private WebElement passwordElement;
    @FindBy(id = "btnLogin") private WebElement loginButton;
    //@FindBy(how = How.ID,using = "btnLogin") private WebElement loginButton; //same as the line before

    public void logIn() {
        //userNameElement.sendKeys(Browser.getPropertyValue("userName")); //this works too if we have nonstatic import ("import browser.Browser")
        userNameElement.sendKeys(getPropertyValue("userName"));
        passwordElement.sendKeys(getPropertyValue("password"));
        loginButton.click();
    }
}
