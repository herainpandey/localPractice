package test;


import helper.Base;
import helper.Base2;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import java.net.MalformedURLException;


public class Day1 extends Base2{
    WebDriver driver;


    @BeforeSuite
    public void suiteCheck() {
        System.out.println("I m inside before Suite");
    }

    @BeforeTest
    public void initbrowser() throws MalformedURLException {
        System.out.println("BeforeTest Executed");

    }

    //@Parameters({"name"})
    @Test(groups = {"Smoke"})
    public void demo() throws MalformedURLException {
        System.out.println("Going to Launch Rahul Shetty ") ;
        driver=getDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
       // System.out.println(name);
    }

    //@Parameters({"name"})
    @Test(groups ={"Regression"})
    public void demo1() throws MalformedURLException {
        System.out.println("Going to launch WWE ") ;
        driver=getDriver();
         driver.get("https://www.wwe.com");
        //System.out.println(name);

    }



    @Test(groups ={"Regression"},dataProvider = "hello")
    public void demo4(String name,String passoword){
        System.out.println("Going to launch WWE via Data probider"); ;
        driver.get("https://www.wwe.com");
        System.out.println("Call made for "+name+ " and "+passoword);

    }

    @DataProvider(name="hello")
    public Object[][] getData(){
        return new Object[][]{{"U1","P1"},{"U2","P2"},{"U3","P3"}};
    }
    @AfterTest
    public void closebrowser(){
        System.out.println("AfterTest Executed");
        driver.quit();
    }

    @AfterSuite
    public void suiteCheck2(){
        System.out.println("I m inside After Suite");
    }

    @BeforeMethod
    public void methodcheck1(){
        System.out.println("Before method executing of day1");

    }

    @AfterMethod
    public void methodcheck2(){
        System.out.println("After method executing of day1");

    }
}
