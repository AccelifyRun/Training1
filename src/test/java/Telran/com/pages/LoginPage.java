package Telran.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * Created by Iakov on 7/21/2016.
 */
public class LoginPage extends Page {

    @FindBy(id = "MainContent_LoginUser_UserName")
    WebElement usernameField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_firstNameTxt")
    WebElement firstName;

    public LoginPage(WebDriver driver) {
        super(driver);
    }


}
