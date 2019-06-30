package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_003 {
	
	@Test
	public void testCase3(){
		
		System.setProperty("wevdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver wd = new ChromeDriver();
		wd.get("https:/facebook.com");
		wd.findElementById("email").sendKeys("Hello");
		wd.findElementById("pass").sendKeys("Hello");
		wd.quit();		
	}
	

}
