package Telran.com.Training;

import Telran.com.pages.Page;
import org.openqa.selenium.WebDriver;

/**
 * Created by rut on 01.08.2016.
 */
public class CreateUserRutPage extends Page {


    public CreateUserRutPage(WebDriver driver) {
        super(driver);
    }

    public void openLoginPage() {
        driver.get("http://dhclinicappv2stg.item-soft.co.il/SitePages/createUser.aspx?ReturnUrl=HomePage");
    }
}
