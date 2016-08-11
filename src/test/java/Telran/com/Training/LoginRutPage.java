package Telran.com.Training;

import Telran.com.LogLog4j;
import Telran.com.pages.Page;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

/**
 * Created by rut on 01.08.2016.
 */
public class LoginRutPage extends Page {

    public static String username = "5555Doctor";
    public static String password = "LinkCare!!11";
    private static Logger Log = Logger.getLogger(LogLog4j.class.getName());

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
    @FindBy(id = "Top1_HeadLoginStatus")
    WebElement loginStatusButton;

    //checkBoxes
    @FindBy(id = "MainContent_LoginUser_CBAgreeToTerms")
    WebElement agreeCheckbox;

    //warnings
    @FindBy(xpath = "//*[@id='MainContent_LoginUser_LoginUserValidationSummary']/ul/li[1]")
    WebElement emptyUserNameWarning;
    @FindBy(xpath = "//*[@id='MainContent_LoginUser_LoginUserValidationSummary']/ul/li[2]")
    WebElement emptyPasswordWarning;

    //errors
    @FindBy(xpath = "//span[@class='failureNotification'][contains(text(),'ניסיון ההתחברות שלך לא הצליח. אנא נסה שוב')]")
    WebElement connectionError;

    public LoginRutPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public void openLoginPage() {
        driver.get("http://dhclinicappv2stg.item-soft.co.il/Login.aspx");
    }

    //fill the fields
    public void fillUsernameField(String username) {
        setElementText(usernameField, username);
    }
    public void fillPasswordField(String password) {
        setElementText(passwordField, password);
    }

    //clicking on the buttons
    public void clickToAddNewUser() {
        Log.info("Clicking to addNewUserButton");
        clickElement(addNewUserButton);
    }

    public LoginRutPage clickToForgotPassword() {
        clickElement(forgotPasswordButton);
        return this;
    }

    public LoginRutPage clickToContinue() {
        clickElement(continueButton);
        return this;
    }

    public boolean isOnLoginPage() {
        return exists(loginStatusButton);
    }

    public LoginRutPage waitUntilLoginPageIsLoded() throws IOException, InterruptedException {
        waitUntilElementIsLoaded(continueButton);
        return this;
    }

    public LoginRutPage loginDoctor() {
        fillUsernameField(username);
        fillPasswordField(password);
        clickToContinue();
        return this;
    }
}
