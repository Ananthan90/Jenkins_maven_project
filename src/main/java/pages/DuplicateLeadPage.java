package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class DuplicateLeadPage extends LeafTapsWrappers {

	public DuplicateLeadPage (RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Duplicate Lead | opentaps CRM")){
			reportStep("This is not duplicate Lead Page", "FAIL");
		}
	}

	public DuplicateLeadPage verifySectionTitle(){
		verifyTextById(prop.getProperty("duplicateLead.sectionTitle.id"), "Duplicate Lead");
		return this;

	}
	public ViewLeadPage clickDuplicateLead(){
		clickByClassName(prop.getProperty("duplicateLead.duplicateButton.class"));
		return new ViewLeadPage(driver, test);

	}







}
