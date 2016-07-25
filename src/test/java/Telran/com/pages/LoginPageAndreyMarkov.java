package Telran.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Andrey on 25/07/2016.
 */
public class LoginPageAndreyMarkov extends Page {
    @FindBy(id = "ctl00_MainContent_RegisterUser_CreateUserStepContainer_birthdayTxt_dateInput")
    WebElement riTextBox;
    @FindBy(id = "MainContent_AddNewUser_SmallBtn")
    WebElement inline;
    @FindBy(id = "ctl00_MainContent_RegisterUser_CreateUserStepContainer_birthdayTxt_CalendarPopupButton")
    WebElement alt;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_clinicNameTxt")
    WebElement name;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_ConfirmPasswordLabel")
    WebElement titleDetails;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_Email")
    WebElement textEntry;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_Label1")
    WebElement MainContent;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_UserNameRequired")
    WebElement failureNotification;

    public LoginPageAndreyMarkov(WebDriver driver) {
        super(driver);
    }

}
