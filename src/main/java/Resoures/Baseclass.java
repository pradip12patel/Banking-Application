package Resoures;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.Status;

public class Baseclass {
	
	public static WebDriver d;
	Properties p;
	
	public void Driverinitilie() throws IOException {
		
	
	FileInputStream file=new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\Projet17\\data.properties");

	
	 p=new Properties();
	
	p.load(file);
	
	
	String s1=p.getProperty("browser");
	
	
	if(s1.equalsIgnoreCase("chrome")) {
		
		System.setProperty("webdriver.driver.chrome","G:\\chromedriver-win32\\chromedriver.exe");
		
		ChromeOptions op=new ChromeOptions();
		
		op.addArguments("--remote-allow-origins=*");
		op.setBinary("C:\\Users\\LENOVO\\.cache\\selenium\\chrome\\win64\\116.0.5845.49\\chrome.exe");
		
		 d=new ChromeDriver(op);
	}
	
	else if (s1.equalsIgnoreCase("firefo")) {
		
		d=new FirefoxDriver();
		
	}
	
	else {
		
		System.out.println("hek the browser name");
		
	       }
	
         }
	
	
	@BeforeSuite
	public void beforesuite() { 
		
		EtendsManager.setup();
		
	}
	
	   @BeforeMethod
	  public void openURL() throws IOException  {
		  
		  Driverinitilie();
		  
		  String s2=p.getProperty("url");
		  
		  d.get(s2);
	  }
	  
	  @AfterMethod
	  public void down(ITestResult result) {
		  
		  d.manage().window().maximize();
		
	}
	  
	  @AfterSuite
	  public void close() {
		  
		  EtendsManager.endreport();
		
	}
  
	  
	  public static String geturentdate() {  
		  
		  String currentdate = new SimpleDateFormat("yyyy-MM-ddhhmmss").format(new Date());
		  
		  return currentdate;  
		
	}
	  
	  
	  public static String sreenshot(String sreenshotname, WebDriver d) throws IOException {
		  
		  String dateformate = new SimpleDateFormat("yyyy-MM-ddhhmmss").format(new Date());
		  
		  TakesScreenshot ts= (TakesScreenshot) d;
		  
		 File soure= ts.getScreenshotAs(OutputType.FILE);
		 
		 String destination = System.getProperty("user.dir")+"/sreenshot/"+sreenshotname + dateformate + ".png";
		 
		 File finaldestination = new File(destination);
		 
		 FileUtils.copyFile(soure, finaldestination);
		 
		 return destination;
		 
		  }
	         }
	  
	  



   







