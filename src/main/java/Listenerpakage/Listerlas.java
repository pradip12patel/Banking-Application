package Listenerpakage;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import Resoures.Baseclass;
import Resoures.EtendsManager;

public class Listerlas extends EtendsManager implements ITestListener  {  
	
	
	
	public void onTestStart(ITestResult result) {
		
		test = report.createTest(result.getName());
	}
	
	
	public void onTestSuccess(ITestResult result) {
		
		if(result.getStatus() == ITestResult.SUCCESS) {
			
			test.log(Status.PASS, "test ase is :"+ result.getName());
		}
	}
	
	
	
	public void onTestFailure(ITestResult result) {
		
		if(result.getStatus() == ITestResult.FAILURE) {
			
			test.log(Status.FAIL, "test ase is fail :" + result.getName());
			
			test.log(Status.FAIL, "test ase is fail :" + result.getThrowable());
			
			String sreenshotpath ="";
			
			try {
				
				sreenshotpath = Baseclass.sreenshot(result.getName(), Baseclass.d);
				
				test.addScreenCaptureFromPath(sreenshotpath);
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	public void onTestSkipped(ITestResult result) {
		
		if(result.getStatus() == ITestResult.SKIP)  {
			
			test.log(Status.SKIP, "test ase is :" + result.getName());
		}
	}
	
	

}
