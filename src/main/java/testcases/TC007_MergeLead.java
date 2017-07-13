package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindLeadPage;
import pages.LoginPage;
import pages.MergeLeadPage;
import wrappers.LeafTapsWrappers;

public class TC007_MergeLead extends LeafTapsWrappers{

	@BeforeClass
	public void setData() {
		testCaseName="MergeLead";
		testDescription="Getting two Lead IDs and merging both of them";
		browserName="chrome";
		dataSheetName="TC007";
		category="Regression";
		authors="Ananthan";
	}

	@Test(dataProvider="fetchData")
	public void testMergeLead(String fromLead, String toLead) throws InterruptedException{

		new LoginPage(driver, test)
		.enterUserName("DemoSalesManager")
		.enterPassword("crmsfa")
		.clickLogin()
		.clickCrmSFA()
		.clickOnLead()
		.clickMergeLead()
		.clickFromLeadIcon()
		.SwitchtoFindLeads()
		.enterLeadID(fromLead)
		.clickFindLeads()
		.clickFirstLeadID()
		.clickToLeadIcon()
		.SwitchtoFindLeads()
		.enterLeadID(toLead)
		.clickFindLeads()
		.clickFirstLeadID()
		.clickMergeIcon()
		.acceptMergeLeadAlert();
		/*MergeLeadPage mp = new MergeLeadPage(driver, test);

		mp.clickFindLead()
		.enterLeadId(fromLead)
		.clickFindLead()
		.verifyMessageResult();*/



	}

}
