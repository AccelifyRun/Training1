package Telran.com.Training;

import Telran.com.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by rut on 01.08.2016.
 */
public class LoginRutPage extends Page {

    //fields
    @FindBy(id = "MainContent_LoginUser_UserName")
    WebElement usernameField;
    @FindBy(id = "MainContent_LoginUser_Password")
    WebElement passwordField;

    //buttons
    @FindBy(xpath = "//*[@class ='forgot'][contains(text(),'שכחת סיסמא?')]")
    WebElement forgotPasswordButton;
    @FindBy(id = "MainContent_LoginUser_RegisterHyperLink")
    WebElement addNewUserButton;
    @FindBy(id = "MainContent_LoginUser_LoginButton")
    WebElement continueButton;
    @FindBy(xpath = "//*[@target='_blank']")
    WebElement agreeTermsButton;

    //checkBoxes
    @FindBy(id = "MainContent_LoginUser_CBAgreeToTerms")
    WebElement agreeCheckbox;

    public LoginRutPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    //fill the fields
    public void fillUsernameField(String username) {
        setElementText(usernameField, username);
    }

    public void fillPasswordField(String password) {
        setElementText(passwordField, password);
    }

    //clicking the buttons
    public void clickToAddNewUser() {
        clickElement(addNewUserButton);
    }

    public void clickToForgotPassword() {
        clickElement(forgotPasswordButton);
    }

    public void clickToContinue() {
        clickElement(continueButton);
    }

    public void openLoginPage() {
        driver.get("http://dhclinicappv2stg.item-soft.co.il/Login.aspx");
    }

}
