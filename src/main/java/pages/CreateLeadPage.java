package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class CreateLeadPage extends LeafTapsWrappers {
	
	public CreateLeadPage (RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Create Lead | opentaps CRM")){
			reportStep("This is not CreateLead Page", "FAIL");
		}
	}
	
	//CL means Create lead
	public CreateLeadPage enterCompanyNameInCL(String companyName)
	{
		enterById(prop.getProperty("CreateLead.companyName.id"), companyName);
		return this;
	}
	public CreateLeadPage enterFirstNameInCL(String firstName)
	{
		enterById(prop.getProperty("CreateLead.firstName.id"), firstName);
		return this;
	}
	public CreateLeadPage enterLastNameInCL(String lastName)
	{
		enterById(prop.getProperty("CreateLead.lastName.id"), lastName);
		return this;
	}
	
	public CreateLeadPage enterPhoneNumberInCL(String phoneNo)
	{
		enterById(prop.getProperty("CreateLead.phoneNumber.id"), phoneNo);
		return this;
	}
	public CreateLeadPage enterEmailIdInCL(String emailID)
	{
		enterById(prop.getProperty("CreateLead.Mail.id"),emailID);
		return this;
	}
	
	
	public ViewLeadPage clickOnCreateLeadButtonInCL()
		{
					
		clickByClassName(prop.getProperty("CreateLead.createLeadButton.class"));
		return new ViewLeadPage(driver, test);
	}
	
	

}
