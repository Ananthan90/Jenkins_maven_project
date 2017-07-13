package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;


public class MyHomePage extends LeafTapsWrappers {




	public MyHomePage (RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("My Home | opentaps CRM")){
			reportStep("This is not MyHome Page", "FAIL");
		}
	}
	
	public MyLeadsPage clickOnLead(){
		clickByLink(prop.getProperty("MyHome.leads.link"));
		return new MyLeadsPage(driver, test);
		
		
	}
	
	
	
	
	
	
}
