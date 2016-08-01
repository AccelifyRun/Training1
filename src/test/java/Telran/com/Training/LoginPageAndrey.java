package Telran.com.Training;

import Telran.com.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Andrey on 25/07/2016.
 */
public class LoginPageAndrey extends Page {
    @FindBy(id = "ctl00_MainContent_RegisterUser_CreateUserStepContainer_birthdayTxt_dateInput")
    WebElement birthDateField;
    @FindBy(id = "MainContent_AddNewUser")
    WebElement addUserBtnField;
    @FindBy(id = "ctl00_MainContent_RegisterUser_CreateUserStepContainer_birthdayTxt_CalendarPopupButton")
    WebElement birthCalendarField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_clinicNameTxt")
    WebElement clinicNameField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_ConfirmPasswordLabel")
    WebElement confirmPasswordField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_Email")
    WebElement emailField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_Label1")
    WebElement labelField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_UserNameRequired")
    WebElement userNameField;

    public LoginPageAndrey(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void fillusernameField1(String username) {
        setElementText(birthDateField, username);
    }

    public void filladdUserBtnField(String useraddUserBtn) {
        setElementText(addUserBtnField, useraddUserBtn);
    }

    public void fillbirthCalendarField(String birthCalendar) {
        setElementText(birthCalendarField, birthCalendar);
    }

    public void fillclinicNameFieldField(String clinicName) {
        setElementText(clinicNameField, clinicName);
    }

    public void fillconfirmPasswordField(String confirmPassword) {
        setElementText(confirmPasswordField, confirmPassword);
    }

    public void fillemailField(String fillemail) {
        setElementText(emailField, fillemail);
    }

    public void labelField(String label) {
        setElementText(labelField, label);
    }

    public void userNameField(String userName) {
        setElementText(userNameField, userName);

    }
}