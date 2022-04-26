package pages;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsDemo {
	
	@Test
	public void report()
	{
		//Start Reporters
		ExtentSparkReporter reporter=new ExtentSparkReporter("./Reports/AutomationReport.html");
		reporter.config().setReportName("Automation Report");
		reporter.config().setDocumentTitle("Sprint 1 Tests");
		reporter.config().setTheme(Theme.STANDARD);
		
		//create Extentreports and attach reporter(s)
		ExtentReports report=new ExtentReports();
		report.attachReporter(reporter);
		
		ExtentTest test1=report.createTest("First Test","This is a sample Test");
		 
		test1.info("Testing login functionality");
		test1.pass("Login passes");
		test1.log(Status.PASS, "passed");
		report.flush();
		
		
		
		
		
		
	}

}
