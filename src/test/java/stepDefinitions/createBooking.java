package stepDefinitions;

import cucumber.api.java.en.Given;
import utilities.formData;
import cucumber.Hooks;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;


/**
 * Created by Markus on 18/02/2018.
 */



public class createBooking {

    WebDriver driver;

    public createBooking() {
        driver = Hooks.driver;
    }


    @Given("^I enter first(.*)$")
    public void enterCustomerFirstName(String fn) throws Throwable {
        String firstName = formData.getFirstName(fn);
        driver.get(System.getProperty("url"));





    }

    @Given("^I enter last(.*)$")
    public void enterCustomerLasName(String ln) throws Throwable {
        formData.getLastName(ln);

    }

}
