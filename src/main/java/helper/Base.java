package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Base {

    public static final String USERNAME="oauth-herainpandey-e5a92";
    public static final String ACCESS_KEY="3a0cb821-5cf6-4bfc-b852-85730e1c260b";
    public static final String URL="https://"+USERNAME+":"+ACCESS_KEY+"@ondemand.eu-central-1.saucelabs.com:443/wd/hub";

    WebDriver driver;

    public WebDriver getDriver() throws MalformedURLException {

        System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability("platform","Windows 7");
        capabilities.setCapability("version","51.0");

        driver= new RemoteWebDriver(new URL(URL),capabilities);
        return driver;
    }
}
