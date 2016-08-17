package Telran.com.Training;

import Telran.com.TraningTest.LogLog4j;
import Telran.com.pages.Page;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

/**
 * Created by Boss on 25.07.2016.
 */
public class LoginTanyaSPage extends Page {
    private static Logger Log = Logger.getLogger(LogLog4j.class.getName());

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
        Log.info("Fill UernameFild");

        return this;
    }


    public LoginTanyaSPage fillFirstNameField(String firstName) {
        setElementText(firstNameTxt, firstName);
        Log.info("Fill FirsrName");
        return this;
    }

    public LoginTanyaSPage fillLastNameField(String lastname) {
        setElementText(lastNameTxt, lastname);
        Log.info("Fill LastName");
        return this;
    }

    public LoginTanyaSPage fillEmailField(String email) {
        setElementText(Email, email);
        Log.info("Fill email");

        return this;
    }

    public LoginTanyaSPage fillPassword(String password) {
        setElementText(Password, password);
        Log.info("Fill Password");
        return this;
    }

    public LoginTanyaSPage fillConfirmPassword(String conPassword) {
        setElementText(ConfirmPassword, conPassword);
        Log.info("Fill ConfirmPassword");
        return this;
    }

    public LoginTanyaSPage fillPersonalId(String perID) {
        setElementText(PersonalIdTxt, perID);
        Log.info("Fill PersonalID");
        return this;
    }


    public LoginTanyaSPage fillBirthday(String birthday) {
        setElementText(dateInput, birthday);
        Log.info("Fill BirthdayFild");
        return this;
    }

    public LoginTanyaSPage fillContactCellTxt(String mobPhone) {
        setElementText(ContactCellTxt, mobPhone);
        Log.info("Fill ContacteCell");
        return this;
    }

    public LoginTanyaSPage fillContactPhoneTxt(String housePhone) {
        setElementText(ContactPhoneTxt, housePhone);
        Log.info("Fill ContactePhone");
        return this;
    }

    public LoginTanyaSPage fillAddressTxt(String address) {
        setElementText(AddressTxt, address);
        Log.info("Fill Address");
        return this;
    }

    public LoginTanyaSPage fillHouseNumberTxt(String houseNum) {
        setElementText(HouseNumberTxt, houseNum);
        Log.info("Fill HouseNumber");
        return this;
    }

    public LoginTanyaSPage fillCityTxt(String city) {
        setElementText(CityTxt, city);
        Log.info("Fill City");
        return this;
    }

    public LoginTanyaSPage fillCountryTxt(String country) {
        setElementText(CountryTxt, country);
        Log.info("Fill Country");
        return this;
    }

    public LoginTanyaSPage fillClinicaName(String clinicName) {
        setElementText(clinicNameTxt, clinicName);
        Log.info("Fill ClinicName");
        return this;
    }


    public LoginTanyaSPage clickRegisterHyperLink() {
        clickElement(registerHyperLink);
        Log.info("Click RegisterHyperLink");
        return this;
    }

    public LoginTanyaSPage clickRolesDD1() {
        clickElement(rolesDD1);
        selectValueInDropdown(rolesDD1, "1");
        Log.info("Clck RolesDD1");

        return this;
    }

    public LoginTanyaSPage clickFieldClinicAdmin() {
        clickElement(IsClinicAdmin);
        Log.info("Click IslinicAdmin");

        return this;
    }


    public LoginTanyaSPage clickDropdownNameField() {
        clickElement(organizationNameDropDown);
        selectValueInDropdown(organizationNameDropDown, "2");
        Log.info("Click DropdownNameField");
        return this;
    }


    public LoginTanyaSPage clickToAddNewUser() {

        clickElement(AddNewUser);
        Log.info("Click ToAddNewUsre");
        return this;
    }

    public LoginTanyaSPage clickBy() {
        clickElement(LinkButton1);
        Log.info("Click By");
        return this;
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
            Log.info("element" + AddNewUser + "can not be found");
            e.printStackTrace();
        } catch (InterruptedException e) {
            Log.info("element" + AddNewUser + "can not be found");
            e.printStackTrace();
        }


        return this;
    }

    public LoginTanyaSPage waitUntilLoginPageIsLoaded3() {
        try {
            waitUntilElementIsLoaded(fillUsernameField);
        } catch (IOException e) {
            Log.info("element" + fillUsernameField + "can not be found");
            e.printStackTrace();
        } catch (InterruptedException e) {
            Log.info("element" + fillUsernameField + "can not be found");
            e.printStackTrace();
        }

        return this;
    }

    public boolean isOnLoginPage() {
        return exists(registerHyperLink);
    }


}


