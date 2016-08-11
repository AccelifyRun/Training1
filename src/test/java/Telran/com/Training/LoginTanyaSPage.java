package Telran.com.Training;

import Telran.com.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

/**
 * Created by Boss on 25.07.2016.
 */
public class LoginTanyaSPage extends Page {

    @FindBy(id = "MainContent_LoginUser_RegisterHyperLink")
    WebElement registerHyperLink;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_UserName")
    WebElement fillUsernameField;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_firstNameTxt")
    WebElement firstNameTxt;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_lastNameTxt")
    WebElement lastNameTxt;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_Email")
    WebElement Email;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_Password")
    WebElement Password;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_ConfirmPassword")
    WebElement ConfirmPassword;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_PersonalIdTxt")
    WebElement PersonalIdTxt;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_rolesDDl")
    WebElement rolesDD1;
    @FindBy(id = "ctl00_MainContent_RegisterUser_CreateUserStepContainer_birthdayTxt_dateInput")
    WebElement dateInput;
    @FindBy(id = "ctl00_MainContent_RegisterUser_CreateUserStepContainer_ContactCellTxt")
    WebElement ContactCellTxt;
    @FindBy(id = "ctl00_MainContent_RegisterUser_CreateUserStepContainer_ContactPhoneTxt")
    WebElement ContactPhoneTxt;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_AddressTxt")
    WebElement AddressTxt;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_HouseNumberTxt")
    WebElement HouseNumberTxt;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_CityTxt")
    WebElement CityTxt;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_CountryTxt")
    WebElement CountryTxt;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_IsClinicAdmin")
    WebElement IsClinicAdmin;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_clinicNameTxt")
    WebElement clinicNameTxt;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_OrganizationDDL")
    WebElement organizationNameDropDown;

    @FindBy(id = "MainContent_AddNewUser")
    WebElement AddNewUser;

    @FindBy(id = "MainContent_LinkButton1")
    WebElement LinkButton1;

    public LoginTanyaSPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public LoginTanyaSPage fillUsernameField(String username) {

        setElementText(fillUsernameField, username);

        return this;
    }


    public LoginTanyaSPage fillFirstNameField(String firstName) {
        setElementText(firstNameTxt, firstName);
        return this;
    }

    public LoginTanyaSPage fillLastNameField(String lastname) {
        setElementText(lastNameTxt, lastname);
        return this;
    }

    public LoginTanyaSPage fillEmailField(String email) {
        setElementText(Email, email);

        return this;
    }

    public LoginTanyaSPage fillPassword(String password) {
        setElementText(Password, password);
        return this;
    }

    public LoginTanyaSPage fillConfirmPassword(String conPassword) {
        setElementText(ConfirmPassword, conPassword);
        return this;
    }

    public LoginTanyaSPage fillPersonalId(String perID) {
        setElementText(PersonalIdTxt, perID);
        return this;
    }


    public LoginTanyaSPage fillBirthday(String birthday) {
        setElementText(dateInput, birthday);
        return this;
    }

    public LoginTanyaSPage fillContactCellTxt(String mobPhone) {
        setElementText(ContactCellTxt, mobPhone);
        return this;
    }

    public LoginTanyaSPage fillContactPhoneTxt(String housePhone) {
        setElementText(ContactPhoneTxt, housePhone);
        return this;
    }

    public LoginTanyaSPage fillAddressTxt(String address) {
        setElementText(AddressTxt, address);
        return this;
    }

    public LoginTanyaSPage fillHouseNumberTxt(String houseNum) {
        setElementText(HouseNumberTxt, houseNum);
        return this;
    }

    public LoginTanyaSPage fillCityTxt(String city) {
        setElementText(CityTxt, city);
        return this;
    }

    public LoginTanyaSPage fillCountryTxt(String country) {
        setElementText(CountryTxt, country);
        return this;
    }

    public LoginTanyaSPage fillClinicaName(String clinicName) {
        setElementText(clinicNameTxt, clinicName);
        return this;
    }


    public LoginTanyaSPage clickRegisterHyperLink() {
        clickElement(registerHyperLink);
        return this;
    }

    public LoginTanyaSPage clickRolesDD1() {
        clickElement(rolesDD1);
        selectValueInDropdown(rolesDD1, "1");

        return this;
    }

    public LoginTanyaSPage clickFieldClinicAdmin() {
        clickElement(IsClinicAdmin);

        return this;
    }



    public void clickDropdownNameField() {
        clickElement(organizationNameDropDown);
        selectValueInDropdown(organizationNameDropDown, "2");
    }






    public void clickToAddNewUser() {

        clickElement(AddNewUser);
    }

    public void clickBy() {
        clickElement(LinkButton1);
    }

    public LoginTanyaSPage waitUntilLoginPageIsLoaded() {
        try {
            waitUntilElementIsLoaded(registerHyperLink);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return this;
    }

    public LoginTanyaSPage waitUntilLoginPageIsLoaded2() {
        try {
            waitUntilElementIsLoaded(AddNewUser);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return this;
    }

    public LoginTanyaSPage waitUntilLoginPageIsLoaded3() {
        try {
            waitUntilElementIsLoaded(fillUsernameField);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return this;
    }


}


