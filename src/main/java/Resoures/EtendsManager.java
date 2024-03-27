package Resoures;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class EtendsManager {
	
	public static ExtentReports report;
	public static ExtentTest test;
	public static ExtentSparkReporter htmlreporter;
	
	
     public static void setup () {  
    	 
    	 htmlreporter= new ExtentSparkReporter(System.getProperty("user.dir")+"/test-output/ResultReports/"+"Myreport_"+ Baseclass.geturentdate()+".html");
    	 
    	 htmlreporter.config().setTheme(Theme.DARK);
    	 htmlreporter.config().setDocumentTitle("automation report");
    	 htmlreporter.config().setReportName("Appliation");
    	 htmlreporter.config().setReporter(htmlreporter);
    	 
    	 
    	 
    	 report =new ExtentReports();
    	 
    	 report.attachReporter(htmlreporter);
    	 report.setSystemInfo("window10", "IOS");
    	 report.setSystemInfo("Loal host", "host name");
    	 report.setSystemInfo("tester name", "test");
		
	}
     
     
   public static void endreport () {
	   
	   report.flush();
	
}
     
     
     
     
     
     
     
     
     
}
