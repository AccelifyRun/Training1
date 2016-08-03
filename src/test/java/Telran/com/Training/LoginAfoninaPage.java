package Telran.com.Training;

import Telran.com.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Natalia on 7/24/2016.
 */
public class LoginAfoninaPage extends Page {
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

    public void clickLoginButton() {
        clickElement(loginButton);
    }

    public void clickUserName() {
        clickElement(usernameField);
    }


    public void clickPassord() {
        clickElement(password);
    }

    public void clickcreateUser() {
        clickElement(createUser);
    }

    public void clickforgotYourPassword() {
        clickElement(forgotYourPassword);
    }

    public void clickconfirmUsingCheckBox() {
        clickElement(confirmUsingCheckBox);
    }

    public void clickconfirmUsing() {
        clickElement(confirmUsing);
    }

    public void clickOTP() {
        clickElement(OTP);
    }

    public void fillUserNameField(String username) {
        setElementText(usernameField, username);
    }

    public void fillPassword(String Password) {
        setElementText(password, Password);
    }

    public void openLoginPage() {
        driver.get("http://dhclinicappv2stg.item-soft.co.il/Login.aspx");
    }

    public void waitUntilLoginButtonIsLoaded() {
        try {
            new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(loginButton));
        } catch (Exception e) {
            // Log.info("---------------------------------");
            // Log.info("element " + element + " can not be found by ExpectedConditions.visibilityOf(element)");
            //  Log.info("---------------------------------");
            e.printStackTrace();
        }
    }


}
