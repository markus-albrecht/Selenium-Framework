package PageObject;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

/**
 * Created by Markus on 20/02/2018.
 */
public class BookingsPageObject {

        protected WebDriver driver;

        public WebDriver getDriver() {
            return driver;
        }

        public void waitForElementClickable(WebElement webElement, Integer... timeout) {
            int timeOut = timeout.length > 0 ? timeout[0] : 10;
            waitForCondition(ExpectedConditions.elementToBeClickable(webElement), timeOut);

        }

        public void waitForVisibility(WebElement webElement, Integer... timeout) {
            int timeOut = timeout.length > 0 ? timeout[0] : 10;
            waitForCondition(ExpectedConditions.visibilityOf(webElement), timeOut);
        }

        private void waitForCondition(ExpectedCondition<WebElement> condition, int timeOut) {
            WebDriverWait wait = new WebDriverWait(this.driver, timeOut);
            wait.until(condition);
        }


}
