package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC003_CreateLead extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="Create Lead";
		testDescription="Create lead using data details";
		browserName="chrome";
		dataSheetName="TC003";
		category="Smoke";
		authors="Babu";
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


	}

}
