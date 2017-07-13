package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC005_EditLead extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="Edit Lead";
		testDescription="Updating the first name of lead by finding Lead ID using first Name";
		browserName="chrome";
		dataSheetName="TC005";
		category="Smoke";
		authors="Ananthan";
	}

	@Test(dataProvider="fetchData")
	public void testDuplicateLead(String firstName,  String updateName) throws InterruptedException{

		new LoginPage(driver, test)
		.enterUserName("DemoSalesManager")
		.enterPassword("crmsfa")
		.clickLogin()
		.clickCrmSFA()
		.clickOnLead()
		.clickFindLead()
		.enterFirstName(firstName)
		.clickFindLead()
		.clickFirstLead()
		.clickOnEditLead()
		.updateFirstName(updateName)
		.clickUpdateButton()
		.verifyFirstname(updateName);
		
	}

}
