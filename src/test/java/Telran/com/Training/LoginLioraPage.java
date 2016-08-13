package Telran.com.Training;

import Telran.com.TraningTest.LogLog4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Telran.com.pages.Page;
import java.util.logging.Logger;


import java.io.IOException;

/**
 * Created by Liora on 8/1/2016.
 */
public class LoginLioraPage extends Page{

    public RegistrationLioraPage registrationLioraPage;
    private static Logger Log = Logger.getLogger(LogLog4j.class.getName()) ;
    @FindBy(id = "MainContent_LoginUser_UserName")
    WebElement userNameField;
    @FindBy(id="MainContent_LoginUser_Password")
    WebElement userPasswordField;
    @FindBy(id="MainContent_LoginUser_LoginButton")
    WebElement loginBtn;
    @FindBy(id = "MainContent_LoginUser_RegisterHyperLink")
    WebElement addNewUserLink;


    public LoginLioraPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    public LoginLioraPage fillUserNameField(String userName) {

        setElementText(userNameField, userName);
        Log.info("Value for 'userName' specified");
        return this;
    }

    public LoginLioraPage fillUserPasswordField(String userPassword) {

        setElementText(userPasswordField, userPassword);
        Log.info("Value for 'userPassword' specified");
        return this;
    }



    public LoginLioraPage clickLoginButton() {

        clickElement(loginBtn);
        Log.info("Clicked 'loginBtn'");
        return this;
    }


    public LoginLioraPage clickToAddNewUser() {
        clickElement(addNewUserLink);
        Log.info("Clicked 'addNewUserLink'");
        return this;
    }

    public LoginLioraPage openLoginPage() {
        //driver.get("http://dhclinicappv2stg.item-soft.co.il/SitePages/createUser.aspx?ReturnUrl=HomePage");
        driver.get("http://dhclinicappv2stg.item-soft.co.il/Login.aspx");
        Log.info("Opened 'Login Page'");
        return this;
    }


    public LoginLioraPage waitUntilRegPageIsLoaded() {
        registrationLioraPage = PageFactory.initElements(driver, RegistrationLioraPage.class);
        try {
            waitUntilElementIsLoaded(registrationLioraPage.saveDoctorBtn);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Log.info("Registration page loaded successfully");
        return this;
    }
}
