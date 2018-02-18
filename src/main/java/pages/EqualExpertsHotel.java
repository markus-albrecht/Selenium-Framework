package pages;

import pageObject.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by Markus on 18/02/2018.
 */

public class EqualExpertsHotel extends PageObject {

    @FindBy(xpath = "//*[@id=\"firstname\"]")
    protected WebElement firstName, fNameField;

    @FindBy(xpath = "//*[@id=\"lastname\"]")
     protected WebElement lastName, lNameField;

    @FindBy(xpath = "//*[@id=\"depositpaid\"]")
    protected WebElement depositPaid, depositField;

    @FindBy(xpath = "//*[@id=\"totalprice\"]")
    protected WebElement price, priceField;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[2]")
    protected WebElement checkInToday, checkInSelection;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[2]/a")
    protected WebElement checkOutToday, checkOutSelection;

    public EqualExpertsHotel(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterFirstName(String fn){
        fNameField.sendKeys(fn);
    }

    public void enterLastName(String ln){
        lNameField.sendKeys(ln);
    }

    public void enterPrice(String pce){
        priceField.sendKeys(pce);
    }

   /*    public String getResultText(int resultPosition){
        waitForVisibility(resultStats);

        WebElement posResult = results.get(resultPosition);

        return posResult.findElement(By.tagName("h3")).getText();
    }

    public String getLink(int resultPosition){

        waitForVisibility(resultStats);

        WebElement posResult = results.get(resultPosition);

        return posResult.findElement(By.className("_Rm")).getText();
    }
*/
}

