package defaultproject.Tests;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import defaultproject.PageObjects.landingPage;
import defaultproject.TestComponents.BaseTest;
import defaultproject.TestComponents.Retry;

public class BasicTest extends BaseTest {

	@Test(dataProvider = "getData", groups = {"Error Handling"}, retryAnalyzer=Retry.class)
	public void basicTest(HashMap<String,String> input) throws IOException, InterruptedException{
		landingPage lPage = launchApplication();
		
	}
	
	@DataProvider
	public Object[][] getData() throws IOException {
		
		List<HashMap<String,String>> data = getJsonDataToMap(System.getProperty("user.dir")
				+ "\\src\\test\\java\\defaultproject\\Data\\TestDataSet1.json");
		return new Object[][] { {data.get(0)}, {data.get(1)} };

	}

}
