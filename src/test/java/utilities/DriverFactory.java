package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by francisco.moreno on 04/02/2016.
 */


public class DriverFactory {

    public enum Browsers {FIREFOX, CHROME}

    static String remoteURL = System.getProperty("url");

    public static WebDriver getDriver(Browsers browser) throws MalformedURLException {

        switch (browser) {
            case FIREFOX:
                return new RemoteWebDriver(new URL(remoteURL),
                        DesiredCapabilities.firefox());

            case CHROME:
                return new RemoteWebDriver(new URL(remoteURL),
                        DesiredCapabilities.chrome());

            default:
                return null;
        }

    }
}