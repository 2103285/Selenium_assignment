package Amazon.QA.TestCases;

import org.testng.annotations.Test;

import Amazon.QA.Business.BusinessFunction;
import Amazon.QA.Config.StartBrowser;

public class TestCases_001 extends StartBrowser{
	@Test
	public void testcases_001()throws Exception {
		BusinessFunction b=new BusinessFunction();
		b.Login();
		Thread.sleep(3000);
		b.Search();
		Thread.sleep(3000);
		b.Amazon();
		Thread.sleep(3000);
		b.MintoMaxRange();
		Thread.sleep(3000);
		b.Starts();
		Thread.sleep(3000);
	}

}
