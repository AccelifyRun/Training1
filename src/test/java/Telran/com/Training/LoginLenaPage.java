
package Telran.com.Training;

import Telran.com.TraningTest.LogLog4j;
import Telran.com.pages.Page;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

/**
 * Created by Lena on 7/28/2016.
 */
public class LoginLenaPage extends Page {
    private static Logger Log = Logger.getLogger(LogLog4j.class.getName());
    @FindBy(id = "MainContent_LoginUser_UserName")
    WebElement loginUserNameField;
    @FindBy(id = "MainContent_LoginUser_Password")
    WebElement loginUserPasswordField;
    @FindBy(id = "MainContent_LoginUser_LoginButton")
    WebElement loginButton;
    @FindBy(id = "MainContent_LoginUser_RegisterHyperLink")
    WebElement registerUser;
    @FindBy(xpath = "//div[@class=\"loginInfo\"]//a[@class=\"forgot\"]")
    WebElement forgotPassword;
    @FindBy(id = "MainContent_LoginUser_CBAgreeToTerms")
    WebElement confirmUsingCheckBox;
    @FindBy(xpath = "//div[@class=\"loginInfo\"]//a[@target=\"_blank\"]")
    WebElement conditionConfirmUsing;
    @FindBy(xpath = "//div[@class=\"loginInfo\"]//a[@href=\"LoginOTP.aspx\"] ")
    WebElement QTP;
    //doctorPage
    @FindBy(id = "MainContent_ItemLinkButton3")
    WebElement exitButton;

    public LoginLenaPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public LoginLenaPage fillLoginUserName(String userName) {
        setElementText(loginUserNameField, userName);
        Log.info("Filling login user name");
        return this;
    }

    public LoginLenaPage fillLoginUserPassword(String userPassword) {
        setElementText(loginUserPasswordField, userPassword);
        Log.info("Filling user password");
        return this;
    }

    public LoginLenaPage clickLoginButton() {

        clickElement(loginButton);
        Log.info("Click 'login' button");
        return this;
    }

    public LoginLenaPage clickRegisterUser() {
        clickElement(registerUser);
        Log.info("Click 'register' button");
        return this;
    }

    public LoginLenaPage clickForgotPassword() {
        clickElement(forgotPassword);
        Log.info("Click 'Forgot your password?'");
        return this;
    }

    public LoginLenaPage clickConfirmUsing() {
        clickElement(confirmUsingCheckBox);
        Log.info("Click 'check box' button");
        return this;
    }

    public LoginLenaPage clickConditionConfirmUsing() {
        clickElement(conditionConfirmUsing);
        Log.info("Click 'condition confirm using'");
        return this;
    }

    public LoginLenaPage openLoginPage() {
        driver.get("http://dhclinicappv2stg.item-soft.co.il/Login.aspx?returnUrl=%2fLandingPage.aspx");
        //driver.get("http://dhclinicappv2stg.item-soft.co.il/Login.aspx");
        Log.info("'Login page' loaded successfully");
        return this;
    }

    //implicid waite method (waitUntilElementIsLoaded)
    public LoginLenaPage waitUntilLoginButtonIsLoaded() {
        try {
            waitUntilElementIsLoaded(loginButton);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return this;
    }

    public boolean isOnLoginPage() {
        Log.info("On Login page");
        return exists(exitButton);
    }


}