package Telran.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by Iakov on 7/21/2016.
 */
public class LoginPage extends Page {

    @FindBy(id = "MainContent_LoginUser_UserName")
    WebElement usernameField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_firstNameTxt")
    WebElement firstName;
    @FindBy(id = "MainContent_AddNewUser")
    WebElement AddNewUser;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    public void fillusernameField(String username) {

        setElementText(usernameField, username);

    }

    public void ClickToAddNewUser() {
        clickElement(AddNewUser);
    }

}
