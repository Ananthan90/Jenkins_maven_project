package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindLeadPage;
import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC004_DeleteLead extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="Delete Lead";
		testDescription="Delete Lead by findindno. Lead ID using phone  details";
		browserName="chrome";
		dataSheetName="TC004";
		category="sanity";
		authors="Ananthan";
	}

	@Test(dataProvider="fetchData")
	public void testDeleteLead(String phoneNo) throws InterruptedException{

		new LoginPage(driver, test)
		.enterUserName("DemoSalesManager")
		.enterPassword("crmsfa")
		.clickLogin()
		.clickCrmSFA()
		.clickOnLead()
		.clickFindLead()
		.clickPhoneTab()
		.enterPhoneNumber(phoneNo)
		.clickFindLead();

		FindLeadPage fp= new FindLeadPage(driver, test);
		String leadId = fp.getLeadId();
		
		fp.clickFirstLead()
		.clickDeleteLead()
		.clickFindLead()
		.enterLeadId(leadId)
		.clickFindLead()
		.verifyMessageResult();



	}

}
