package Telran.com.Training;

import Telran.com.TraningTest.LogLog4j;
import Telran.com.pages.Page;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Created by Natalia on 7/24/2016.
 */
public class LoginAfoninaPage extends Page {

    private static Logger Log = Logger.getLogger(LogLog4j.class.getName());
    @FindBy(id = "MainContent_LoginUser_UserName")
    WebElement usernameField;
    @FindBy(id = "MainContent_LoginUser_Password")
    WebElement password;
    @FindBy(id = "MainContent_LoginUser_LoginButton")
    WebElement loginButton;
    @FindBy(id = "MainContent_LoginUser_RegisterHyperLink")
    WebElement createUser;
    @FindBy(xpath = "//div[@class=\"loginInfo\"]//a[@class=\"forgot\"]")
    WebElement forgotYourPassword;
    @FindBy(id = "MainContent_LoginUser_CBAgreeToTerms")
    WebElement confirmUsingCheckBox;
    @FindBy(xpath = "//div[@class=\"loginInfo\"]//a[@target=\"_blank\"]")
    WebElement confirmUsing;
    @FindBy(xpath = "//div[@class=\"loginInfo\"]//a[@href=\"LoginOTP.aspx\"]")
    WebElement OTP;
    @FindBy(id = "MainContent_LUserName")
    WebElement identity;

    public LoginAfoninaPage(WebDriver driver) {
        super(driver);
    }

    public LoginAfoninaPage clickLoginButton() {
        clickElement(loginButton);
        Log.info("Click Login button");
        return this;
    }

    public LoginAfoninaPage clickUserName() {
        clickElement(usernameField);
        Log.info("Click use name");
        return this;
    }


    public LoginAfoninaPage clickPassord() {
        clickElement(password);
        Log.info("Click password");
        return this;
    }

    public LoginAfoninaPage clickcreateUser() {
        clickElement(createUser);
        Log.info("Click create user");
        return this;
    }

    public LoginAfoninaPage clickforgotYourPassword() {
        clickElement(forgotYourPassword);
        Log.info("Click 'Forgot your password?'");
        return this;
    }

    public LoginAfoninaPage clickconfirmUsingCheckBox() {
        clickElement(confirmUsingCheckBox);
        Log.info("Click check box");
        return this;
    }

    public LoginAfoninaPage clickconfirmUsing() {
        clickElement(confirmUsing);
        Log.info("Click confirm using");
        return this;
    }

    public LoginAfoninaPage clickOTP() {
        clickElement(OTP);
        Log.info("Click OTP");
        return this;
    }

    public LoginAfoninaPage fillUserNameField(String username) {
        setElementText(usernameField, username);
        Log.info("Fill user name");
        return this;
    }

    public LoginAfoninaPage fillPassword(String Password) {
        setElementText(password, Password);
        Log.info("Fill password");
        return this;
    }

    public LoginAfoninaPage openLoginPage() {
        driver.get("http://dhclinicappv2stg.item-soft.co.il/Login.aspx");
        Log.info("Open Login page");
        return this;
    }

    public LoginAfoninaPage waitUntilLoginButtonIsLoaded() {
        try {
            new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(loginButton));
        } catch (Exception e) {
            Log.info("---------------------------------");
            Log.info("element " + loginButton + " can not be found by ExpectedConditions.visibilityOf(element)");
            Log.info("---------------------------------");
            e.printStackTrace();
        }
        return this;
    }

    public boolean isOnLoginPage() {
        Log.info("isOnLoginPage");
        return exists(loginButton);

    }

}
