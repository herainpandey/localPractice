package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;

public class Base2  {

    WebDriver driver ;


    public WebDriver getDriver() throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver.exe");
        driver = new ChromeDriver();
        return  driver;
    }
}
