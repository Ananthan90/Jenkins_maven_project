package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class EditLeadPage extends LeafTapsWrappers{

	public EditLeadPage (RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		verifyTextByXpath(prop.getProperty("editLead.sectionTitle.id"), "Edit Lead");
		/*if(!verifyTitle("View Lead | opentaps CRM")){
			reportStep("This is not View Lead Page", "FAIL");
		}*/
	}

	// method to Update first name
	public EditLeadPage updateFirstName (String updateName){
		enterById(prop.getProperty("editLead.updateName.id"), updateName);
		return this;
	}

	//method to click on update 

	public ViewLeadPage clickUpdateButton(){
		clickByClassName(prop.getProperty("editLead.updateButton.class"));
		return new ViewLeadPage(driver, test);
	}



}
