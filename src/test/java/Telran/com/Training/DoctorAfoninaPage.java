package Telran.com.Training;

import Telran.com.TraningTest.LogLog4j;
import Telran.com.pages.Page;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import org.testng.log4testng.Logger;

/**
 * Created by Natalia on 7/24/2016.
 */
public class DoctorAfoninaPage extends Page {

    private static Logger Log = Logger.getLogger(LogLog4j.class.getName());
    @FindBy(id = "Top1_HeadLoginStatus")
    WebElement Exit;
    @FindBy(id = "Top1_HeadLoginView_DisplayName")
    WebElement DoctorName;
    @FindBy(id = "Top1_HeadLoginView_lastLogin")
    WebElement LastLogin;
    @FindBy(xpath = "div[@id=\"ctl00_DisplayImportantLinks1_myMenu\"]//li[@class=\"rmItem rmFirst selected\"]//img[@class=\"rmLeftImage")
    WebElement PatientsImage;
    @FindBy(xpath = "//div[@id=\"ctl00_DisplayImportantLinks1_myMenu\"]//li[@class=\"rmItem rmFirst selected\"]//span[@class=\"rmText\"]")
    WebElement PatientsText;
    @FindBy(xpath = "div[@id=\"ctl00_DisplayImportantLinks1_myMenu\"]//li[@class=\"rmItem\"]//img[@class=\"rmLeftImage")
    WebElement SosImage;
    @FindBy(xpath = "div[@id=\"ctl00_DisplayImportantLinks1_myMenu\"]//li[@class=\"rmItem\"]//img[@class=\"rmLeftImage")
    WebElement SosText;
    /* @FindBy(xpath = "div[@id=\"ctl00_DisplayImportantLinks1_myMenu\"]//li[@class=\"rmItem rmFirst selected\"]//img[@class=\"rmLeftImage")

     @FindBy(xpath = "div[@id=\"ctl00_DisplayImportantLinks1_myMenu\"]//li[@class=\"rmItem rmFirst selected\"]//img[@class=\"rmLeftImage")

     @FindBy(id = "BtnPrevPage")
     WebElement PrevPage;
 */
    @FindBy(id = "Div1")
    WebElement NextPage;
    @FindBy(xpath = "//*[@id='MainContent_RadPageView1']//label[@class=\"float\"]")
    WebElement FilterText;
    @FindBy(id = "ctl00_MainContent_RDP_AccountMeeting_wrapper")
    WebElement FilterParameter;
    @FindBy(id = "ctl00_MainContent_RDP_AccountMeeting_dateInput")
    WebElement Date;
    @FindBy(id = "ctl00_MainContent_RDP_AccountMeeting_popupButton")
    WebElement DateButton;
    @FindBy(id = "MainContent_ItemLinkButton3")
    WebElement Add;
    @FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid1_ctl00']//a[@href=\"javascript:__doPostBack('ctl00$MainContent$RadGrid1$ctl00$ctl02$ctl01$ctl02','')\"]")
    WebElement FirstNameFilterText;
    @FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid1_ctl00']//a[@href=\"javascript:__doPostBack('ctl00$MainContent$RadGrid1$ctl00$ctl02$ctl01$ctl03','')\"]")
    WebElement LastNameFilterText;
    @FindBy(xpath = "//*[@id='ctl00_MainContent_RadGrid1_ctl00']//a[@href=\"javascript:__doPostBack('ctl00$MainContent$RadGrid1$ctl00$ctl02$ctl01$ctl05','')\"]")
    WebElement NumberIdFilterText;
    @FindBy(id = "ctl00_MainContent_RadGrid1_ctl00_ctl02_ctl02_FilterTextBox_FirstName")
    WebElement FilterTextBox_FirstName;
    @FindBy(id = "ctl00_MainContent_RadGrid1_ctl00_ctl02_ctl02_Filter_FirstName")
    WebElement Filter_FirstName;
    @FindBy(id = "'ctl00_MainContent_RadGrid1_ctl00_ctl02_ctl02_FilterTextBox_LastName")
    WebElement FilterTextBox_LastName;
    @FindBy(id = "ctl00_MainContent_RadGrid1_ctl00_ctl02_ctl02_Filter_LastName")
    WebElement Filter_LastName;
    @FindBy(id = "ctl00_MainContent_RadGrid1_ctl00_ctl02_ctl02_FilterTextBox_PersonalId")
    WebElement FilterTextBox_PersonalId;
    @FindBy(id = "ctl00_MainContent_RadGrid1_ctl00_ctl02_ctl02_Filter_PersonalId")
    WebElement Filter_PersonalId;

    public DoctorAfoninaPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, this);
    }

    public DoctorAfoninaPage waitUntilExitIsLoaded() {
        try {
            new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(Exit));
        } catch (Exception e) {
            Log.info("---------------------------------");
            Log.info("element " + Exit + " can not be found by ExpectedConditions.visibilityOf(element)");
            Log.info("---------------------------------");
            e.printStackTrace();
        }
        return this;
    }

    /* public void clickEmail() {
         clickElement(Email);
     }

     public void fillEmail(String email) {
         setElementText(Email, email);
     }


     public void openDoctorPage() {
         driver.get("http://dhclinicappv2stg.item-soft.co.il/SitePages/createUser.aspx?ReturnUrl=HomePage");
     }

     public void waitUntilAddNewUserIsLoaded() {
         try {
             new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(AddNewUser));
         } catch (Exception e) {
             // Log.info("---------------------------------");
             // Log.info("element " + element + " can not be found by ExpectedConditions.visibilityOf(element)");
             //  Log.info("---------------------------------");
             e.printStackTrace();
         }
     }

     public void waitUntilClinicNameIsLoaded() {
         try {
             new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(clinicName));
         } catch (Exception e) {
             // Log.info("---------------------------------");
             // Log.info("element " + element + " can not be found by ExpectedConditions.visibilityOf(element)");
             //  Log.info("---------------------------------");
             e.printStackTrace();
         }
     }


     public void waitUntilAddNewUserIsDisappeared(String id) throws IOException, InterruptedException {
         new WebDriverWait(driver, 25).until(ExpectedConditions.invisibilityOfElementLocated(By.id(id)));
     }

     public void waitUntilAddedUserIsLoaded() {
         try {
             new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(AddedUser));
         } catch (Exception e) {
             // Log.info("---------------------------------");
             // Log.info("element " + element + " can not be found by ExpectedConditions.visibilityOf(element)");
             //  Log.info("---------------------------------");
             e.printStackTrace();
         }
     }

     public boolean verifyAddedUserIsPresent() {
         try {
             AddedUser.getTagName();
             return true;
         } catch (NoSuchElementException e) {
             //  Log.info("---------------------------------");
             //  Log.info("element " + element + " can not be found by  element.getTagName()");
             //   Log.info("---------------------------------");
             return false;
         }
     }*/
    public boolean isOnDoctorPage() {
        Log.info("isOnDoctorPage");
        return exists(Exit);

    }
}

