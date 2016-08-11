package Telran.com.Training;

import Telran.com.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

/**
 * Created by rut on 01.08.2016.
 */
public class RegistrationRutPage extends Page {

    //fields
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_UserName")
    WebElement usernameField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_firstNameTxt")
    WebElement firstNameField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_lastNameTxt")
    WebElement lastNameField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_Email")
    WebElement mailField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_Password")
    WebElement passwordField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_ConfirmPassword")
    WebElement confirmPasswordField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_PersonalIdTxt")
    WebElement idField;
    @FindBy(id = "ctl00_MainContent_RegisterUser_CreateUserStepContainer_birthdayTxt_dateInput")
    WebElement birthdayField;
    @FindBy(id = "ctl00_MainContent_RegisterUser_CreateUserStepContainer_ContactCellTxt")
    WebElement mobilePhoneField;
    @FindBy(id = "ctl00_MainContent_RegisterUser_CreateUserStepContainer_ContactPhoneTxt")
    WebElement phoneField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_AddressTxt")
    WebElement streetField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_HouseNumberTxt")
    WebElement houseField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_CityTxt")
    WebElement cityField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_CountryTxt")
    WebElement countryField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_clinicNameTxt")
    WebElement clinicNameField;

    //Buttons
    @FindBy(id = "MainContent_AddNewUser")
    WebElement addUserButton;
    @FindBy(id = "MainContent_LinkButton1")
    WebElement cancellationButton;
    @FindBy(id = "ctl00_MainContent_RegisterUser_CreateUserStepContainer_birthdayTxt_CalendarPopupButton")
    WebElement calendarButton;
    @FindBy(id = "Top1_HeadLoginStatus")
    WebElement loginStatusButton;

    //dropdowns
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_rolesDDl")
    WebElement roleDropdown;
    @FindBy(id = "//*[contains(text(), 'מטפל')]")
    WebElement roleClinicAdminDropdownOption;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_OrganizationDDL")
    WebElement organizationDropdown;

    //checkboxes
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_IsClinicAdmin")
    WebElement clinicAdminCheckbox;

    //warnings
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_UserNameRequired")
    WebElement userNameEmptyWarning;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_FirsNameRequired")
    WebElement firstNameEmptyWarning;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_LastNameRequired")
    WebElement lastNameEmptyWarning;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_EmailRequired")
    WebElement emailEmptyWarning;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_PasswordRequired")
    WebElement passwordEmptyWarning;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_ConfirmPasswordRequired")
    WebElement confirmPasswordEmptyWarning;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_RequiredFieldValidator1")
    WebElement idEmptyWarning;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_RequiredFieldValidator2")
    WebElement mobilePhoneEmptyWarning;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_RequiredFieldValidator3")
    WebElement streetEmptyWarning;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_RequiredFieldValidator5")
    WebElement houseEmptyWarning;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_RequiredFieldValidator4")
    WebElement cityEmptyWarning;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_ErrorMsgClinicName")
    WebElement nameOfClinicEmptyWarning;

    //errors
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_RegularExpressionValidator2")
    WebElement usernameError;   //15, not simbols, only letters and numbers
    @FindBy(xpath = "//*[@id='MainContent_RegisterUser_CreateUserStepContainer_RegisterUserValidationSummary']/ul/li")
    WebElement usernameExistsError; //The user name already exist
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_RegularExpressionValidator1")
    WebElement firstNameError;  //15, only letters
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_RegularExpressionValidator3")
    WebElement lastNameError;   //15, only letters
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_regexEmailValid")
    WebElement mailError;       //not valid
    @FindBy(xpath = "MainContent_RegisterUser_CreateUserStepContainer_CustomValidator2")
    WebElement emailExsistsError;   //מייל קיים במערכת
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_CustomValidator3")
    WebElement passwordError;   // 15, סיסמא לא יכולה להכיל את שם המשתמש.
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_PasswordCompare")
    WebElement confirmPasswordError;    //not valid
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_CVPersonalId")
    WebElement idError;
    @FindBy(xpath = "//*[@class='riTextBox riError']")
    WebElement birthdayError;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_RegularExpressionValidator4")
    WebElement streetError;   //30, only letters and numbers,  not simbols
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_RegularExpressionValidator5")
    WebElement houseError;  //10, not simbols, only letters and numbers
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_RegularExpressionValidator6")
    WebElement cityError;    //15, only letters and numbers, not simbols

    public RegistrationRutPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void openRegistrationPage() {
        driver.get("http://dhclinicappv2stg.item-soft.co.il/SitePages/createUser.aspx?ReturnUrl=HomePage");
    }

    //filling the fields
    public RegistrationRutPage fillUsernameField(String username) {
        setElementText(usernameField, username);
        return this;
    }

    public RegistrationRutPage fillFirstNameField(String firstName) {
        setElementText(firstNameField, firstName);
        return this;
    }

    public RegistrationRutPage fillLastNameField(String lastName) {
        setElementText(lastNameField, lastName);
        return this;
    }

    public RegistrationRutPage fillMailField(String mail) {
        setElementText(mailField, mail);
        return this;
    }

    public RegistrationRutPage fillPasswordField(String password) {
        setElementText(passwordField, password);
        return this;
    }

    public RegistrationRutPage fillConfirmPasswordField(String password) {
        setElementText(confirmPasswordField, password);
        return this;

    }

    public RegistrationRutPage filllDField(String id) {
        setElementText(idField, id);
        return this;
    }

    // TODO: 01.08.2016
    public RegistrationRutPage fillBirthdayField(String birthday) {
        setElementText(birthdayField, birthday);
        return this;
    }

    public RegistrationRutPage fillMobilePhoneField(String mobilePhone) {
        setElementText(mobilePhoneField, mobilePhone);
        return this;
    }

    public RegistrationRutPage fillPhoneField(String phone) {
        setElementText(phoneField, phone);
        return this;
    }

    public RegistrationRutPage fillStreetField(String street) {
        setElementText(streetField, street);
        return this;
    }

    public RegistrationRutPage fillHouseField(String house) {
        setElementText(houseField, house);
        return this;
    }

    public RegistrationRutPage fillCityField(String city) {
        setElementText(cityField, city);
        return this;
    }

    public RegistrationRutPage fillCountryField(String country) {
        setElementText(countryField, country);
        return this;
    }

    public RegistrationRutPage fillClinicNameField(String clinicName) {
        setElementText(clinicNameField, clinicName);
        return this;
    }

    //clicking on dropdowns
    public RegistrationRutPage clickOnOrganizationDropdown(String value) {
        clickElement(organizationDropdown);
        selectValueInDropdown(organizationDropdown, value);
        return this;
    }

    //clicking on the buttons
    public RegistrationRutPage clickOnAddUserButton() {
        clickElement(addUserButton);
        return this;
    }

    public RegistrationRutPage clickOnCancellationButton() {
        clickElement(cancellationButton);
        return this;
    }

    //waitings
    public RegistrationRutPage waitUntilRegPageIsLoaded() throws IOException, InterruptedException {
        waitUntilElementIsLoaded(addUserButton);
        return this;
    }

    public boolean isOnRegistrationPage() throws IOException, InterruptedException {
        return exists(addUserButton);
    }
}
