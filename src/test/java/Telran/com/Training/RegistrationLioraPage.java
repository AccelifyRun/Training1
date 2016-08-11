package Telran.com.Training;

import Telran.com.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Liora on 8/6/2016.
 */
public class RegistrationLioraPage extends Page{

    //enter text fields
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_UserName")
    WebElement usernameField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_firstNameTxt")
    WebElement firstNameField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_lastNameTxt")
    WebElement lastNameField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_Email")
    WebElement emailField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_Password")
    WebElement passwordField; //15
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_ConfirmPassword")
    WebElement confirmPasswordField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_PersonalIdTxt")
    WebElement peronalIdField;
    @FindBy(id = "ctl00_MainContent_RegisterUser_CreateUserStepContainer_birthdayTxt_dateInput")
    WebElement birthdayField;
    @FindBy(id = "ctl00_MainContent_RegisterUser_CreateUserStepContainer_ContactCellTxt")
    WebElement contactCellField;
    @FindBy(id = "ctl00_MainContent_RegisterUser_CreateUserStepContainer_ContactPhoneTxt")
    WebElement phoneField;
    @FindBy(id = "ctl00_MainContent_RegisterUser_CreateUserStepContainer_ContactPhoneTxt")
    WebElement streetField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_HouseNumberTxt")
    WebElement houseField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_CityTxt")
    WebElement cityField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_CountryTxt")
    WebElement countryField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_clinicNameTxt")
    WebElement clinicNameField;

    //checkboxes
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_IsClinicAdmin")
    WebElement clinicAdminCheckbox;

    public RegistrationLioraPage(WebDriver driver) {
        super(driver);
    }
    public void CreateUserLioraPage() {
        driver.get("http://dhclinicappv2stg.item-soft.co.il/SitePages/createUser.aspx?ReturnUrl=HomePage");
    }

    //enter text
    public void fillUsernameField(String username) {
        setElementText(usernameField, username);
    }
    public void fillFirstNameField(String firstName) {
        setElementText(firstNameField, firstName);
    }
    public void fillLastNameField(String lastName) {
        setElementText(lastNameField, lastName);
    }
    public void fillEmailField(String mail) {
        setElementText(emailField, mail);
    }
    public void fillPasswordField(String password) {
        setElementText(passwordField, password);
    }
    public void fillConfirmPasswordField(String password) {
        setElementText(confirmPasswordField, password);
    }
    public void fillPersonallDField(String id) {
        setElementText(peronalIdField, id);
    }
    public void fillclinicNameField(String id) { setElementText(clinicNameField, id);  }
    public void fillBirthdayField(String id) {
        setElementText(birthdayField, id);
    }
    public void fillcontactCellField(String id) {
        setElementText(contactCellField, id);
    }
    public void fillphoneField(String id) { setElementText(phoneField, id);  }
    public void fillstreetField(String id) { setElementText(streetField, id);  }
    public void fillhouseField(String id) { setElementText(houseField, id);  }
    public void fillcityField(String id) { setElementText(cityField, id);  }
    public void fillcountryField(String id) { setElementText(countryField, id);  }



}
