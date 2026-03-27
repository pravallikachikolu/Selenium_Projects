package com.orangehrm.selniumuiframework.gernericUtility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportUtility {
	
		public static ExtentReports extent;
		public static ExtentReports getExtentInstance() {
			if(extent==null) {
				ExtentSparkReporter spark=new ExtentSparkReporter("./Reports/test_result.html");
				//ReporterConfiguration
				spark.config().setReportName("OrangeHrm UI Automation Report");
				spark.config().setDocumentTitle("Test Results");
				extent=new ExtentReports();
				extent.attachReporter(spark);
				extent.setSystemInfo("Automation Tester", "John");
				extent.setSystemInfo("UI Automation Framework", "Selenium+TestNG");
				
			}
			return extent;
		}

	
}
