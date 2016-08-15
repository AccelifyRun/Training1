package Telran.com.Training;

import Telran.com.TraningTest.LogLog4j;
import Telran.com.pages.Page;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

//import org.testng.log4testng.Logger;

/**
 * Created by Natalia on 7/24/2016.
 */
public class RegisrtationAfoninaPage extends Page {
    private static Logger Log = Logger.getLogger(LogLog4j.class.getName());

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_UserName")
    WebElement userName;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_firstNameTxt")
    WebElement firstName;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_lastNameTxt")
    WebElement lastName;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_Email")
    WebElement Email;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_Password")
    WebElement Password;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_ConfirmPassword")
    WebElement ConfirmPassord;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_PersonalIdTxt")
    WebElement PersonalId;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_rolesDDl")
    WebElement rolesDDI;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_IsClinicAdmin")
    WebElement IsClinicAdmin;
    @FindBy(xpath = " //*[@id='MainContent_RegisterUser_CreateUserStepContainer_clinicNameTxt']")
    WebElement clinicName;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_OrganizationDDL")
    WebElement OrganizationDDL;
    @FindBy(id = "ctl00_MainContent_RegisterUser_CreateUserStepContainer_birthdayTxt_dateInput")
    WebElement birthday;
    @FindBy(id = "ctl00_MainContent_RegisterUser_CreateUserStepContainer_birthdayTxt_CalendarPopupButton")
    WebElement CalendarPopupButton;
    @FindBy(id = "ctl00_MainContent_RegisterUser_CreateUserStepContainer_ContactCellTxt")
    WebElement ContactCell;
    @FindBy(xpath = "//input[@id = 'ctl00_MainContent_RegisterUser_CreateUserStepContainer_ContactPhoneTxt']")
    WebElement ContactPhone;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_AddressTxt")
    WebElement Address;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_HouseNumberTxt")
    WebElement HouseNumber;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_CityTxt")
    WebElement City;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_CountryTxt")
    WebElement Country;
    @FindBy(id = "MainContent_AddNewUser")
    WebElement AddNewUser;
    @FindBy(id = "MainContent_LinkButton1")
    WebElement LinkButton1;


    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_organizationNameTxt")
    WebElement OrganizationNameTxt;

    @FindBy(xpath = " //*[@id='MainContent_RegisterUser_CreateUserStepContainer_OrganizationDDL']//option[@value=\"2\"]")
    WebElement PrivateDoctor;

    @FindBy(xpath = " //*[@id='MainContent_RegisterUser_CreateUserStepContainer_OrganizationDDL']//option[@value=\"6\"]")
    WebElement LetOrganization;

    @FindBy(xpath = " //*[@id='MainContent_RegisterUser_CreateUserStepContainer_OrganizationDDL']//option[@value=\"19\"]")
    WebElement MindyTest;

    @FindBy(xpath = " //*[@id='MainContent_RegisterUser_CreateUserStepContainer_OrganizationDDL']//option[@value=\"32\"]")
    WebElement MCHC;

    @FindBy(id = "Top1_HeadLoginView_DisplayName")
    WebElement AddedUser;

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_UserNameRequired")
    WebElement userNameRequired;
    @FindBy(id = " MainContent_RegisterUser_CreateUserStepContainer_RegularExpressionValidator2")
    WebElement userNameValidstor2;

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_FirsNameRequired")
    WebElement firstNameRequired;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_RegularExpressionValidator1")
    WebElement firstNameValidator1;

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_LastNameRequired")
    WebElement lastNameRequaired;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_RegularExpressionValidator3")
    WebElement lastNameValidator3;

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_EmailRequired")
    WebElement EmaiRequired;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_regexEmailValid")
    WebElement EmaiValid;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_CustomValidator2")
    WebElement EmaiValidator2;

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_PasswordRequired")
    WebElement PasswordRequired;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_CustomValidator3")
    WebElement PasswordValidator3;

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_ConfirmPasswordRequired")
    WebElement ConfirmPassordRequired;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_PasswordCompare")
    WebElement ConfirmPassordCompare;

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_RequiredFieldValidator1")
    WebElement PersonalIdValidator1;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_CVPersonalId")
    WebElement PersonalIdCV;

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_RequiredFieldValidator2")
    WebElement ContactCellRequiredFieldValidator2;

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_RequiredFieldValidator3")
    WebElement AddressRequired;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_RegularExpressionValidator4")
    WebElement AddressValidator4;

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_RequiredFieldValidator5")
    WebElement HouseNumbeRequired;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_RegularExpressionValidator5")
    WebElement HouseNumbeValidator5;

    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_RequiredFieldValidator4")
    WebElement CityRequired;
    @FindBy(id = "MainContent_RegisterUser_CreateUserStepContainer_RegularExpressionValidator6")
    WebElement CityValidator6;


    public RegisrtationAfoninaPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, this);
    }

    public RegisrtationAfoninaPage clickEmail() {
        clickElement(Email);
        Log.info("Click Email");
        return this;
    }

    public RegisrtationAfoninaPage fillEmail(String email) {
        setElementText(Email, email);
        Log.info("Fill Email");
        return this;
    }

    public RegisrtationAfoninaPage fillUserNameField(String username) {
        setElementText(userName, username);
        Log.info("Fill UserNameField");
        return this;
    }

    public RegisrtationAfoninaPage fillFirstName(String firstNameTxt) {
        setElementText(firstName, firstNameTxt);
        Log.info("Fill FirstName");
        return this;
    }

    public RegisrtationAfoninaPage fillLastName(String lastNameTxt) {
        setElementText(lastName, lastNameTxt);
        Log.info("Fill LasttName");
        return this;
    }

    public RegisrtationAfoninaPage fillPassword(String password) {
        setElementText(Password, password);
        Log.info("Fill Password");
        return this;
    }

    public RegisrtationAfoninaPage fillConfirmPassord(String confirmPassord) {
        setElementText(ConfirmPassord, confirmPassord);
        Log.info("Fill ConfirmPassord");
        return this;
    }

    public RegisrtationAfoninaPage fillPersonalId(String PersonalIdTxt) {
        setElementText(PersonalId, PersonalIdTxt);
        Log.info("Fill PersonalId");
        return this;
    }

    public RegisrtationAfoninaPage fillrolesDDI(String RolesDDI) {
        setElementText(rolesDDI, RolesDDI);
        Log.info("Fill rolesDDI");
        return this;
    }

    public RegisrtationAfoninaPage fillIsClinicAdmin(String isClinicAdmin) {
        setElementText(IsClinicAdmin, isClinicAdmin);
        Log.info("Fill IsClinicAdmin");
        return this;
    }

    public RegisrtationAfoninaPage fillclinicName(String clinicNameTxt) throws InterruptedException {
        scrolltoelement(clinicName);
        setElementText(clinicName, clinicNameTxt);
        Log.info("Fill clinicName");
        return this;
    }

    public RegisrtationAfoninaPage fillOrganizationDDL(String organizationDDL) {
        setElementText(OrganizationDDL, organizationDDL);
        Log.info("Fill OrganizationDDL");
        return this;
    }

    public RegisrtationAfoninaPage fillbirthday(String dateInput) {
        setElementText(birthday, dateInput);
        Log.info("Fill birthday");
        return this;
    }

    public RegisrtationAfoninaPage fillCalendarPopupButton(String calendarPopupButton) {
        setElementText(CalendarPopupButton, calendarPopupButton);
        Log.info("Fill CalendarPopupButton");
        return this;
    }

    public RegisrtationAfoninaPage fillContactCell(String ContactCellTxt) {
        setElementText(ContactCell, ContactCellTxt);
        Log.info("Fill ContactCell");
        return this;
    }

    public RegisrtationAfoninaPage fillContactPhone(String ContactPhoneTxt) {
        setElementText(ContactPhone, ContactPhoneTxt);
        Log.info("Fill contactPhone");
        return this;
    }

    public RegisrtationAfoninaPage fillAddress(String AddressTxt) {
        setElementText(Address, AddressTxt);
        Log.info("Fill address");
        return this;
    }

    public RegisrtationAfoninaPage fillHouseNumber(String HouseNumberTxt) {
        setElementText(HouseNumber, HouseNumberTxt);
        Log.info("Fill HouseNumber");
        return this;
    }

    public RegisrtationAfoninaPage fillCity(String CityTxt) {
        setElementText(City, CityTxt);
        Log.info("Fill City");
        return this;
    }

    public RegisrtationAfoninaPage fillCountry(String CountryTxt) {
        setElementText(Country, CountryTxt);
        Log.info("Fill country");
        return this;
    }

    public RegisrtationAfoninaPage fillLinkButton1(String linkButton1) {
        setElementText(LinkButton1, linkButton1);
        Log.info("Fill linkButton1");
        return this;
    }

    public RegisrtationAfoninaPage fillAddNewUser(String newUser) {
        setElementText(AddNewUser, newUser);
        Log.info("Fill AddNewUser");
        return this;
    }

    public RegisrtationAfoninaPage fillConfirmPassorw(String Password) {
        setElementText(ConfirmPassord, Password);
        Log.info("Fill ConfirmPassord");
        return this;
    }

    public RegisrtationAfoninaPage clickUserName() {
        clickElement(userName);
        Log.info("Click userName");
        return this;
    }

    public RegisrtationAfoninaPage clickFirstName() {
        clickElement(firstName);
        Log.info("Click firstName");
        return this;
    }

    public RegisrtationAfoninaPage clickLastName() {
        clickElement(lastName);
        Log.info("Click lastName");
        return this;
    }

    public RegisrtationAfoninaPage clickPassord() {
        clickElement(Password);
        Log.info("Click Password");
        return this;
    }

    public RegisrtationAfoninaPage clickConfirmPassord() {
        clickElement(ConfirmPassord);
        Log.info("Click ConfirmPassord");
        return this;
    }

    public RegisrtationAfoninaPage clickPersonalId() {
        clickElement(PersonalId);
        Log.info("Click PersonalId");
        return this;
    }

    public RegisrtationAfoninaPage clickrolesDDI() {
        clickElement(rolesDDI);
        Log.info("Click rolesDDI");
        return this;
    }

    public RegisrtationAfoninaPage clickIsClinicAdmin() {
        clickElement(IsClinicAdmin);
        Log.info("Click IsClinicAdmin");
        return this;
    }

    public RegisrtationAfoninaPage clickclinicName() {
        clickElement(clinicName);
        Log.info("Click clinicName");
        return this;
    }

    public RegisrtationAfoninaPage clickOrganizationDDL() {
        clickElement(OrganizationDDL);
        Log.info("Click OrganizationDDL");
        return this;
    }

    public RegisrtationAfoninaPage clickbirthday() {
        clickElement(birthday);
        Log.info("Click birthday");
        return this;
    }

    public RegisrtationAfoninaPage clickCalendarPopupButton() {
        clickElement(CalendarPopupButton);
        Log.info("Click CalendarPopupButton");
        return this;
    }

    public RegisrtationAfoninaPage clickContactCell() {
        clickElement(ContactCell);
        Log.info("Click ContactCell");
        return this;
    }

    public RegisrtationAfoninaPage clickContactPhone() {
        clickElement(ContactPhone);
        Log.info("Click ContactPhone");
        return this;
    }

    public RegisrtationAfoninaPage clickAddress() {
        clickElement(Address);
        Log.info("Click Address");
        return this;
    }

    public RegisrtationAfoninaPage clickHouseNumber() {
        clickElement(HouseNumber);
        Log.info("Click HouseNumber");
        return this;
    }

    public RegisrtationAfoninaPage clickCity() {
        clickElement(City);
        Log.info("Click City");
        return this;
    }

    public RegisrtationAfoninaPage clickCountry() {
        clickElement(Country);
        Log.info("click Country");
        return this;
    }

    public RegisrtationAfoninaPage clickAddNewUser() {
        clickElement(AddNewUser);
        Log.info("Click AddNewUser");
        return this;
    }

    public RegisrtationAfoninaPage clickLinkButton1() {
        clickElement(LinkButton1);
        Log.info("Click LinkButton1");
        return this;
    }

    public RegisrtationAfoninaPage selectValueInOrganizationDDLText(String value) {
        Select select = new Select(OrganizationDDL);
        select.selectByVisibleText(value);
        Log.info("selectValueInOrganizationDDLText");
        return this;

    }


    public RegisrtationAfoninaPage openLoginRegistrationPage() {
        driver.get("http://dhclinicappv2stg.item-soft.co.il/SitePages/createUser.aspx?ReturnUrl=HomePage");
        Log.info("Open LoginRegistrationPage ");
        return this;
    }

    public RegisrtationAfoninaPage waitUntilAddNewUserIsLoaded() {
        try {
            new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(AddNewUser));
        } catch (Exception e) {
            Log.info("---------------------------------");
            Log.info("element " + AddNewUser + " can not be found by ExpectedConditions.visibilityOf(element)");
            Log.info("---------------------------------");
            e.printStackTrace();
        }
        return this;
    }

    public RegisrtationAfoninaPage waitUntilClinicNameIsLoaded() {
        try {
            new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(clinicName));
        } catch (Exception e) {
            Log.info("---------------------------------");
            Log.info("element " + clinicName + " can not be found by ExpectedConditions.visibilityOf(element)");
            Log.info("---------------------------------");
            e.printStackTrace();
        }
        return this;
    }


    public RegisrtationAfoninaPage waitUntilAddNewUserIsDisappeared(String id) throws IOException, InterruptedException {
        new WebDriverWait(driver, 25).until(ExpectedConditions.invisibilityOfElementLocated(By.id(id)));
        Log.info("WaitUntilAddNewUserIsDisappeared");
        return this;
    }

    public RegisrtationAfoninaPage waitUntilAddedUserIsLoaded() {
        try {
            new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(AddedUser));
        } catch (Exception e) {
            Log.info("---------------------------------");
            Log.info("element " + AddedUser + " can not be found by ExpectedConditions.visibilityOf(element)");
            Log.info("---------------------------------");
            e.printStackTrace();
        }
        return this;
    }

    public boolean isOnLoginPage() {
        return exists(AddedUser);
    }
}

