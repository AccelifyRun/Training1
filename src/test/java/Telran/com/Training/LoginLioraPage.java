package Telran.com.Training;

import Telran.com.pages.RegistrationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Telran.com.pages.Page;

import java.io.IOException;

/**
 * Created by Liora on 8/1/2016.
 */
public class LoginLioraPage extends Page{

    @FindBy(id = "MainContent_LoginUser_UserName")
    WebElement usernameField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_firstNameTxt")
    WebElement firstName;
    @FindBy(id = "MainContent_LoginUser_RegisterHyperLink")
    WebElement AddNewUser;
    @FindBy (id="MainContent_AddNewUser")
    WebElement saveDoctorBtn;

    public LoginLioraPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    public void fillusernameField(String username) {

        setElementText(usernameField, username);

    }


    public void clickToAddNewUser() {
        clickElement(AddNewUser);
    }

    public void openLoginPage() {
        driver.get("http://dhclinicappv2stg.item-soft.co.il/SitePages/createUser.aspx?ReturnUrl=HomePage");
    }

    public LoginLioraPage waitUntilRegPageIsLoaded() {
        try {
            waitUntilElementIsLoaded(saveDoctorBtn);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }
}
