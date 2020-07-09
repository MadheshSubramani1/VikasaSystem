package selenium_learning;

import java.io.File;
import java.util.HashMap;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class DownloadAndVerify {
	WebDriver driver;
	File folder;

	@Test
	public void Method() throws InterruptedException{
		folder=new File(UUID.randomUUID().toString());
		folder.mkdir();

		HashMap<String, Object> chromePrefs=new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory",folder.getAbsolutePath());
		ChromeOptions chromeOptions=new ChromeOptions();
		chromeOptions.setExperimentalOption("prefs", chromePrefs);

		driver=new ChromeDriver(chromeOptions);

		driver.get("http://leafground.com/pages/download.html");
		driver.findElement(By.linkText("Download Excel")).click();

		try {
			Thread.sleep(2000);
			File[] file=folder.listFiles();
			for (File file2 : file) {
				if(file2.getName().equals("testleaf.xlsx")) {
					System.out.println("file downloaded in successfully in try");
					break;
				}

				else if(file2.getName().equals("testleaf.xlsx")) {
					throw new Exception();

				}}

		} catch (Exception e) {
			Thread.sleep(2000);
			File[] file=folder.listFiles();
			for (File file2 : file) {
				if(file2.getName().equals("testleaf.xlsx")) {
					System.out.println("file downloaded in successfully in try");
					break;
				}}}}

	@AfterMethod public void tearDown() {
		driver.quit();
		for(File files:folder.listFiles()) {
			files.delete();
		} 
		folder.delete(); }


}
