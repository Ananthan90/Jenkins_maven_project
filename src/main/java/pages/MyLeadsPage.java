package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MyLeadsPage extends LeafTapsWrappers {
	
	public MyLeadsPage (RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("My Leads | opentaps CRM")){
			reportStep("This is not my Leads Page", "FAIL");
		}
	}
	
	public CreateLeadPage clickleadlink(){
		clickByLink(prop.getProperty("MyLead.CreateLead.link"));
		return new CreateLeadPage(driver, test);
	}
	
	public FindLeadPage clickFindLead(){
		clickByLink(prop.getProperty("Mylead.findLead.link"));
		return new FindLeadPage(driver, test);
		
	}
	
	public MergeLeadPage clickMergeLead(){
		clickByLink(prop.getProperty("Mylead.mergeLead.link"));
		return new MergeLeadPage(driver, test);
		
	}
	
	
	

}
