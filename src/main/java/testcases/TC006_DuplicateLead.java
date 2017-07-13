package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC006_DuplicateLead extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="Duplicate Lead";
		testDescription="create duplicate for lead by finding Lead ID using first Name";
		browserName="chrome";
		dataSheetName="TC006";
		category="sanity";
		authors="Ananthan";
	}

	@Test(dataProvider="fetchData")
	public void testDuplicateLead(String firstName) throws InterruptedException{

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
		.clickOnDuplicateLead()
		.verifySectionTitle()
		.clickDuplicateLead()
		.verifyTitleSection()
		.verifyFirstname(firstName);
	}

}
