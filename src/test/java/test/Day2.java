package test;

import helper.Base;
import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

public class Day2 extends Base {

    WebDriver driver;

    @BeforeTest
    public void initbrowser() throws MalformedURLException {
        System.out.println("BeforeTest Executed");

    }

    //@Parameters({"name"})
    @Test(groups ={"Smoke"})
    public void demo2() throws MalformedURLException {
        System.out.println("Going to launch Google ");
        //System.out.println(name);
        driver=getDriver();

        driver.get("https://www.google.com");

    }

    //@Parameters({"name"})
    @Test(groups ={"Regression"})
    public void demo3() throws MalformedURLException {
        System.out.println("Going to launch Youtube ");
        driver=getDriver();

        driver.get("https://www.youtube.com");
        //System.out.println(name);
    }

    @AfterTest
    public void closebrowser(){
        System.out.println("AfterTest Executed");
        driver.quit();
    }

    @BeforeMethod
    public void methodcheck3(){
        System.out.println("Before method executing of day2 ");

    }

    @AfterMethod
    public void methodcheck4(){
        System.out.println("After method executing of day2");

    }
}
