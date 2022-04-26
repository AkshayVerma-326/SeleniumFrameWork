package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager {
	
	static ExtentReports extent;
	
	public static ExtentReports getInstance()
	{
		if(extent==null)
		{
			createInstance();
		}
		return extent;
	}
	
	public static ExtentReports createInstance() {
		ExtentSparkReporter reporter=new ExtentSparkReporter("C:\\selenium_workspace\\HybridTestingFramework\\Reports\\AutomationReport"+System.currentTimeMillis()+".html");
		//ExtentSparkReporter reporter=new ExtentSparkReporter("C:\\selenium_workspace\\HybridTestingFramework\\Reports\\AutomationReport.html");
		reporter.getConf().setReportName("Automation Report");
		reporter.config().setDocumentTitle("Sprint 1");
		reporter.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		return extent;
		
	}

}


