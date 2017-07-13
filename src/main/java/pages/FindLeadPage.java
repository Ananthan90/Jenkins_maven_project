package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class FindLeadPage extends LeafTapsWrappers {

	 
	public FindLeadPage (RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Find Leads | opentaps CRM")){
			reportStep("This is not Find Lead Page", "FAIL");
		}
	}


	public FindLeadPage clickPhoneTab(){
		clickByXpath(prop.getProperty("findLead.phoneTab.xpath"));
		return this;

	}

	public FindLeadPage enterPhoneNumber(String phone){
		enterByXpath(prop.getProperty("findLead.phoneNumber.xpath"),phone);
		return this;

	}
	
	public FindLeadPage enterLeadId(String lead){
		enterByXpath(prop.getProperty("findLead.leadIdField.xpath"),lead);
		return this;

	}
	public FindLeadPage enterFirstName(String name){
		enterByXpath(prop.getProperty("findLead.firstName.xpath"),name);
		return this;

	}	
	public FindLeadPage verifyMessageResult(){
		
		verifyTextByXpath(prop.getProperty("findLead.message.xpath"), "No records to display");
		return this;
		
	}

	public FindLeadPage clickFindLead() throws InterruptedException{
		clickByXpath(prop.getProperty("findLead.findButton.xpath"));
		Thread.sleep(5000);
		return this;

	}

	public String getLeadId(){
		return getTextByXpath(prop.getProperty("findLead.firstLeadID.xpath"));
	}

	public ViewLeadPage clickFirstLead() throws InterruptedException{
		clickByXpath(prop.getProperty("findLead.firstLeadID.xpath"));
		return new ViewLeadPage(driver, test);

	}

	
	

}
