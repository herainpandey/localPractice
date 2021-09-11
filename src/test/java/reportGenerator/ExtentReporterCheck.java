package reportGenerator;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.BeforeTest;

public class ExtentReporterCheck {

    ExtentReports extentReports;

    public void config() {
        String path = System.getProperty("user.dir") + "\\reports\\index.html";
        ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
        reporter.config().setReportName("Web Automation");
        reporter.config().setDocumentTitle("Document Title");

        extentReports = new ExtentReports();
        extentReports.attachReporter(reporter);
    }
}
