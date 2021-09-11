package listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;

public class TestListenerCheck implements ITestListener {

    public void onTestStart(ITestResult result){
        System.out.println("I'll run when test start");

    }

    public void onTestFailure(ITestResult result){

        System.out.println(result.getName() + "Taking Screenshot on Failure");
    }

    public void onTestSuccess(ITestResult result){

        System.out.println("On Test success I'll run ");

    }

    public void onTestSkipped(ITestResult result){

    }
}
