package PageObjetMOdel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AppliationMOdels {
	
	WebDriver d;
	
	
	By reg=By.xpath("//a[normalize-space()='Register']");
	By first=By.xpath("//input[@id='customer.firstName']");
	By last=By.xpath("//input[@id='customer.lastName']");
	By add=By.xpath("//input[@id='customer.address.street']");
	By ty=By.xpath("//input[@id='customer.address.city']");
	By stat=By.xpath("(//input[@type='text'])[6]");
	By ode=By.xpath("//input[@id='customer.address.zipCode']");
	By phone=By.xpath("//input[@id='customer.phoneNumber']");
	By ss=By.xpath("//input[@id='customer.ssn']");
	By user=By.xpath("//input[@id='customer.username']");
	By pass=By.xpath("//input[@id='customer.password']");
	By nfm=By.xpath("//input[@id='repeatedPassword']");
	By regs=By.xpath("//input[@value='Register']");
	By user1=By.xpath("//input[@name='username']");
	By pass1=By.xpath("//input[@name='password']");
	By log=By.xpath("//input[@type='submit']");
	By open=By.xpath("//a[normalize-space()='Open New Account']");
	
	
	
	
	
	
	
	
	
	
	
	public AppliationMOdels(WebDriver d2) {
		
		this.d = d2;
	}













	public WebElement register() {
		
	return	d.findElement(reg);
		
	}
	
	
	public WebElement firstname() {
		
		return	d.findElement(first);
			
		}
	
	public WebElement lastname() {
		
		return	d.findElement(last);
			
		}
	
	
	public WebElement address() {
		
		return	d.findElement(add);
			
		}
	
	public WebElement ity() {
		
		return	d.findElement(ty);
			
		}
	
	
	public WebElement state() {
		
		return	d.findElement(stat);
			
		}
	
	public WebElement ipode() {
		
		return	d.findElement(ode);
			
		}
	
	
	public WebElement phonenb() {
		
		return	d.findElement(phone);
			
		}
	
	
	public WebElement ssn() {
		
		return	d.findElement(ss);
			
		}
	
	public WebElement username() {
		
		return	d.findElement(user);
			
		}
	
	
	public WebElement password() {
		
		return	d.findElement(pass);
			
		}
	
	
	public WebElement oform() {
		
		return	d.findElement(nfm);
			
		}
	
	public WebElement registerlik() {
		
		return	d.findElement(regs);
			
		}
	
    public WebElement username1() {
		
		return	d.findElement(user1);
			
		}
	
    public WebElement password1() {
		
		return	d.findElement(pass1);
			
		}
	
	
	
    public WebElement login() {
		
		return	d.findElement(log);
			
		}
	
    public WebElement openaout() {
		
		return	d.findElement(open);
			
		}
	
}
