package jenkinsMavenGitDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testA {
	@Test
	public void test() {
		//String driverpath ="C:\\Softwares\\geckodriver-v0.9.0-win64\\geckodriver.exe";
		//System.setProperty("webdriver.gecko.driver",driverpath);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier");
 		driver.close();
		
	}

}