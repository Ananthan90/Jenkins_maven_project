package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MergeLeadPage extends LeafTapsWrappers{

	public MergeLeadPage (RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Merge Leads | opentaps CRM")){
			reportStep("This is not Merge Lead Page", "FAIL");
		}
	}

	public MergeLeadPage clickFromLeadIcon(){
		clickByXpathNoSnap(prop.getProperty("mergeLead.fromIcon.xpath"));
		return this;
	}
	
	public MergeLeadPage clickToLeadIcon(){
		clickByXpathNoSnap(prop.getProperty("mergeLead.toIcon.xpath"));
		return this;
	}

	public MergeFindLeadsPage SwitchtoFindLeads(){
		switchToLastWindow();
		return new MergeFindLeadsPage(driver, test);

	}
	
	public MergeLeadPage clickMergeIcon() throws InterruptedException{
		clickByLinkNoSnap(prop.getProperty("mergeLead.mergeButton.link"));
		Thread.sleep(5000);
		return this;
	}
	
	public ViewLeadPage acceptMergeLeadAlert() throws InterruptedException{
		acceptAlert();
		Thread.sleep(5000);
		return new ViewLeadPage(driver, test);
		
	}

}
