package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MergeFindLeadsPage extends LeafTapsWrappers {

	public MergeFindLeadsPage (RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Find Leads")){
			reportStep("This is not Find Leads Page", "FAIL");
		}
	}

	public MergeFindLeadsPage enterLeadID(String leadId){
		enterByXpath(prop.getProperty("MergeFindLeads.LeadIdField.xpath"), leadId);
		return this;
	}

	public MergeFindLeadsPage clickFindLeads() throws InterruptedException{
		clickByXpath(prop.getProperty("MergeFindLeads.findLeadsButton.xpath"));
		Thread.sleep(4000);
		return this;
	}

	public MergeLeadPage clickFirstLeadID() throws InterruptedException{
		clickByXpathNoSnap(prop.getProperty("MergeFindLeads.firstLeadID.xpath"));
		switchToParentWindow();
		Thread.sleep(3000);
		return new MergeLeadPage(driver, test);
	}

}
