package Telran.com.Training;

import Telran.com.LogLog4j;
import Telran.com.pages.Page;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

/**
 * Created by rut on 01.08.2016.
 */
public class RegistrationRutPage extends Page {

    private static Logger Log = Logger.getLogger(LogLog4j.class.getName());

    //fields
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_UserName")
    WebElement usernameField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_firstNameTxt")
    WebElement firstNameField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_lastNameTxt")
    WebElement lastNameField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_Email")
    WebElement emailField;
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
    @FindBy(xpath = "//*[@id='MainContent_RegisterUser_CreateUserStepContainer_RegisterUserValidationSummary']/ul/li")
    WebElement passwordNotValidWarnig;
    //קריטריונים של סיסמא: מינימום 8 תוים. כולל 2 לפחות מתוך הקבוצות הבאות: אות גדולה, אות קטנה, מספר, תו מיוחד
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
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_CustomValidator2")
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
        Log.info("Opening Registration page");
        driver.get("http://dhclinicappv2stg.item-soft.co.il/SitePages/createUser.aspx?ReturnUrl=HomePage");
    }

    //filling the fields
    public RegistrationRutPage fillUsernameField(String username) {
        Log.info("Filling a Username field");
        setElementText(usernameField, username);
        return this;
    }

    public RegistrationRutPage fillFirstNameField(String firstName) {
        Log.info("Filling a First name field");
        setElementText(firstNameField, firstName);
        return this;
    }

    public RegistrationRutPage fillLastNameField(String lastName) {
        Log.info("Filling a Last name field");
        setElementText(lastNameField, lastName);
        return this;
    }

    public RegistrationRutPage fillMailField(String mail) {
        Log.info("Filling a Mail field");
        setElementText(emailField, mail);
        return this;
    }

    public RegistrationRutPage fillPasswordField(String password) {
        Log.info("Filling a Password field");
        setElementText(passwordField, password);
        return this;
    }

    public RegistrationRutPage fillConfirmPasswordField(String password) {
        Log.info("Filling a Confirm password field");
        setElementText(confirmPasswordField, password);
        return this;

    }

    public RegistrationRutPage filllDField(String id) {
        Log.info("Filling a Id field");
        setElementText(idField, id);
        return this;
    }

    // TODO: 01.08.2016
    public RegistrationRutPage fillBirthdayField(String birthday) {
        Log.info("Filling a Birthday field");
        setElementText(birthdayField, birthday);
        return this;
    }

    public RegistrationRutPage fillMobilePhoneField(String mobilePhone) {
        Log.info("Filling a Mobile phone field");
        setElementText(mobilePhoneField, mobilePhone);
        return this;
    }

    public RegistrationRutPage fillPhoneField(String phone) {
        Log.info("Filling a Phone field");
        setElementText(phoneField, phone);
        return this;
    }

    public RegistrationRutPage fillStreetField(String street) {
        Log.info("Filling a Street field");
        setElementText(streetField, street);
        return this;
    }

    public RegistrationRutPage fillHouseField(String house) {
        Log.info("Filling a House field");
        setElementText(houseField, house);
        return this;
    }

    public RegistrationRutPage fillCityField(String city) {
        Log.info("Filling a City field");
        setElementText(cityField, city);
        return this;
    }

    public RegistrationRutPage fillCountryField(String country) {
        Log.info("Filling Country field");
        setElementText(countryField, country);
        return this;
    }

    public RegistrationRutPage fillClinicNameField(String clinicName) {
        Log.info("Filling a Clinic name field");
        setElementText(clinicNameField, clinicName);
        return this;
    }

    //clicking on dropdowns
    public RegistrationRutPage clickOnOrganizationDropdown(String value) {
        Log.info("Selected value in Organization dropdown");
        clickElement(organizationDropdown);
        selectValueInDropdown(organizationDropdown, value);
        return this;
    }

    //clicking on the buttons
    public RegistrationRutPage clickOnAddUserButton() {
        Log.info("Clicking on Add user button");
        clickElement(addUserButton);
        return this;
    }

    public RegistrationRutPage clickOnCancellationButton() {
        Log.info("Clicking on Cancellation button");
        clickElement(cancellationButton);
        return this;
    }

    //waitings
    public RegistrationRutPage waitUntilRegPageIsLoaded() throws IOException, InterruptedException {
        Log.info("Waitining until Registration page is loaded");
        waitUntilElementIsLoaded(addUserButton);
        return this;
    }

    public boolean isOnRegistrationPage() throws IOException, InterruptedException {
        Log.info("Wen are on Registration page");
        return exists(addUserButton);
    }

    public boolean isIDFieldExists() throws IOException, InterruptedException {
        Log.info("Wen are on Registration page");
        return exists(emailField);
    }

    public String waitAndGetTextofSelectedMessage(String number) throws IOException, InterruptedException {
        String locator = "//*[@id='MainContent_RegisterUser_CreateUserStepContainer_RegularExpressionValidator" + number + "']";
        WebElement elem = driver.findElement(By.xpath(locator));
        waitUntilElementIsLoaded(elem);
        return elem.getText();
    }
}
