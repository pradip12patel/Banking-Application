package Testcase;

import java.time.Duration;

import org.testng.annotations.Test;

import PageObjetMOdel.AppliationMOdels;
import Resoures.Baseclass;
import Resoures.constentmethod;

public class Logins extends Baseclass {
	
	@Test
	public void Login() {
		
		AppliationMOdels obj=new AppliationMOdels(d);
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		obj.username1().sendKeys(constentmethod.username);
		obj.password1().sendKeys(constentmethod.password);
		obj.login().click();             
		
		obj.openaout().click();
		
	}
	
	

}
