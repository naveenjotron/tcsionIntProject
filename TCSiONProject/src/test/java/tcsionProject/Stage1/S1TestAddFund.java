package tcsionProject.Stage1;

import org.testng.annotations.Test;

import net.phptravels.Stage1.S1AddFundPage;
import tcsionProject.Scripts.TestBase;

public class S1TestAddFund extends TestBase {
	
	S1AddFundPage objFund;
	
	@Test(priority=6)
	public void AddFund() throws InterruptedException {
		objFund= new S1AddFundPage(driver);
		
		objFund.setAddFund();
		objFund.setPaypalRdBtn();
		objFund.setAmount();
		objFund.setPayNowBtn();
		objFund.setCancelPay();
	}

}
