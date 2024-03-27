package Testcase;

import java.time.Duration;

import org.testng.annotations.Test;

import PageObjetMOdel.AppliationMOdels;
import Resoures.Baseclass;
import Resoures.constentmethod;

public class Registration extends Baseclass {
	
	@Test
	public void Registrion() {  
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		AppliationMOdels obj=new AppliationMOdels(d);
		
		obj.register().click();
		obj.firstname().sendKeys(constentmethod.firstname);
		obj.lastname().sendKeys(constentmethod.lastname);
		obj.address().sendKeys(constentmethod.address);
		obj.ity().sendKeys(constentmethod.ity);
		obj.state().sendKeys(constentmethod.state);
		obj.ipode().sendKeys(constentmethod.ipeode);
		obj.phonenb().sendKeys(constentmethod.phone);
		obj.ssn().sendKeys(constentmethod.ssn);
		obj.username().sendKeys(constentmethod.username);
		obj.password().sendKeys(constentmethod.password);
		obj.oform().sendKeys(constentmethod.password);
		obj.registerlik().click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
