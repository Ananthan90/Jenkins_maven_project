package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class ViewLeadPage extends LeafTapsWrappers {

	public ViewLeadPage (RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("View Lead | opentaps CRM")){
			reportStep("This is not View Lead Page", "FAIL");
		}
	}

	//method to verify  the first name
	public ViewLeadPage verifyFirstname(String firstName){

		verifyTextById(prop.getProperty("Viewlead.firstName.id"), firstName);
		return this;

	}
	
	public String getLeadID(){
		String lead = getTextById("viewLead_companyName_sp");
		return lead;
	}

	// method to click delete lead button
	public MyLeadsPage clickDeleteLead(){
		clickByXpath(prop.getProperty("Viewlead.deleteButton.xpath"));
		return new MyLeadsPage(driver, test);
	}

	//Method to verify the title section of view lead

	public ViewLeadPage verifyTitleSection(){
		verifyTextById(prop.getProperty("Viewlead.sectionTitle.id"),"View Lead");
		return this;
	}

	// method to click on edit lead
	public EditLeadPage clickOnEditLead(){
		clickByXpath(prop.getProperty("Viewlead.editButton.xpath"));
		return new EditLeadPage(driver, test);
	}

	// method to click on duplicate lead
	public DuplicateLeadPage clickOnDuplicateLead(){
		clickByLink(prop.getProperty("viewlead.duplicateButton.link"));
		return new DuplicateLeadPage(driver, test);
	}

	public FindLeadPage clickFindLead(){
		clickByLink(prop.getProperty("viewlead.findLead.link"));
		return new FindLeadPage(driver, test);
	}


}
