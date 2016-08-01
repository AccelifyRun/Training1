package Telran.com.Training;

import Telran.com.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by rut on 01.08.2016.
 */
public class CreateUserRutPage extends Page {

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

    //Buttons
    @FindBy(id = "MainContent_AddNewUser")
    WebElement addUserButton;
    @FindBy(id = "MainContent_LinkButton1")
    WebElement cancellationButton;

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

    public CreateUserRutPage(WebDriver driver) {
        super(driver);
    }

    public void CreateUserRutPage() {
        driver.get("http://dhclinicappv2stg.item-soft.co.il/SitePages/createUser.aspx?ReturnUrl=HomePage");
    }

    //filling the fields
    public void fillUsernameField(String username) {
        setElementText(usernameField, username);
    }

    public void fillFirstNameField(String firstName) {
        setElementText(firstNameField, firstName);
    }

    public void fillLastNameField(String lastName) {
        setElementText(lastNameField, lastName);
    }

    public void fillMailField(String mail) {
        setElementText(mailField, mail);
    }

    public void fillPasswordField(String password) {
        setElementText(passwordField, password);
    }

    public void fillConfirmPasswordField(String password) {
        setElementText(confirmPasswordField, password);
    }

    public void filllDField(String id) {
        setElementText(idField, id);
    }

    // TODO: 01.08.2016
    public void fillBirthdayField(String birthday) {
        setElementText(birthdayField, birthday);
    }

    public void fillMobilePhoneField(String mobilePhone) {
        setElementText(mobilePhoneField, mobilePhone);
    }

    public void fillPhoneField(String phone) {
        setElementText(phoneField, phone);
    }

    public void fillStreetField(String street) {
        setElementText(streetField, street);
    }

    public void fillHouseField(String house) {
        setElementText(houseField, house);
    }

    public void fillCityField(String city) {
        setElementText(cityField, city);
    }

    public void fillCountryField(String country) {
        setElementText(countryField, country);
    }

    public void fillClinicNameField(String clinicName) {
        setElementText(clinicNameField, clinicName);
    }

    //clicking on dropdowns
    public void clickOnOrganizationDropdown(String value) {
        clickElement(organizationDropdown);
        selectValueInDropdown(organizationDropdown, value);
    }

    //clicking on the buttons
    public void clickOnAddUserButton() {
        clickElement(addUserButton);
    }

    public void clickOnCancellationButton() {
        clickElement(cancellationButton);
    }
}
