package Telran.com.Training;

import Telran.com.LogLog4j;
import Telran.com.pages.Page;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

/**
 * Created by rut on 09.08.2016.
 */
public class DoctorRutPage extends Page {

    private static Logger Log = Logger.getLogger(LogLog4j.class.getName());

    @FindBy(id = "Top1_HeadLoginStatus")
    WebElement exitStatusButton;
    @FindBy(id = "ctl00_MainContent_RadGrid1_ctl00_ctl04_PatientTracking")
    WebElement toPatientPageLink;
    @FindBy(id = "MainContent_AddNewItem")
    WebElement addPatientButton;

    public DoctorRutPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void openDoctorPage() {
        Log.info("Opening Doctor's page");
        driver.get("http://dhclinicappv2stg.item-soft.co.il/SecurityInfrastructure/Accounts.aspx");
    }

    public boolean isOnDoctorPage() {
        Log.info("We are on Doctor's page");
        return exists(addPatientButton);
    }

    public void waitUntilDoctorPageIsLoaded() throws IOException, InterruptedException {
        Log.info("Waitining until Doctor's page is loaded");
        waitUntilElementIsLoaded(toPatientPageLink);
    }

    public void clickToAddPatient() {
        Log.info("Clicking on Add patient button");
        clickElement(addPatientButton);
    }
}
