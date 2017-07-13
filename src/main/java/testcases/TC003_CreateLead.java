package testcases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ViewLeadPage;
import wrappers.LeafTapsWrappers;

public class TC003_CreateLead extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="Create Lead";
		testDescription="Create lead using data details";
		browserName="chrome";
		dataSheetName="TC003";
		category="Smoke";
		authors="Ananthan";
	}

	@Test(dataProvider="fetchData")
	public void testCreateLead(String companyName, String firstName, String lastName, String emailID, String phoneNo){

		new LoginPage(driver, test)
		.enterUserName("DemoSalesManager")
		.enterPassword("crmsfa")
		.clickLogin()
		.clickCrmSFA()
		.clickOnLead()
		.clickleadlink()
		.enterCompanyNameInCL(companyName)
		.enterFirstNameInCL(firstName)
		.enterLastNameInCL(lastName)
		.enterEmailIdInCL(emailID)
		.enterPhoneNumberInCL(phoneNo)
		.clickOnCreateLeadButtonInCL()
		.verifyFirstname(firstName);
		
		ViewLeadPage vp = new ViewLeadPage(driver, test);
		String lead_id = vp.getLeadID();
		
		//to validate the 
		if (Pattern.matches("[a-zA-Z0-9]+( \\(\\d+\\))*", lead_id)){
			System.out.println(lead_id +"------ is in correct pattern");
		}
		else{
			System.out.println(lead_id +"------ is in wrong pattern");
		}
		
		
		Matcher m = Pattern.compile("\\(([^)]+)\\)").matcher(lead_id);
		while(m.find()) {
			System.out.println("Lead ID is ...."+m.group(1));    
		}


	}

}
