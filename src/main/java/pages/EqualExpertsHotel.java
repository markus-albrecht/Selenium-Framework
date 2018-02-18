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

    @FindBy(name = "q")
    protected WebElement searchField;

    @FindBy(id = "resultStats")
    WebElement resultStats;

    @FindBy(className = "rc")
    List<WebElement> results;

    public EqualExpertsHotel(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void search(String field){
        searchField.sendKeys(field);

        searchField.sendKeys(Keys.ENTER);
    }

    public String getResultText(int resultPosition){
        waitForVisibility(resultStats);

        WebElement posResult = results.get(resultPosition);

        return posResult.findElement(By.tagName("h3")).getText();
    }

    public String getLink(int resultPosition){

        waitForVisibility(resultStats);

        WebElement posResult = results.get(resultPosition);

        return posResult.findElement(By.className("_Rm")).getText();
    }

}

