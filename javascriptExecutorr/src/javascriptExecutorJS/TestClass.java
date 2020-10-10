package javascriptExecutorJS;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utill.UtillJS;

public class TestClass {

	public static void main(String[] args) throws Exception  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		WebElement signUpButton=driver.findElement(By.id("loginbutton"));

		//UtillJS.Flash(signUpButton, driver);
		
		//UtillJS.borderJs(signUpButton, driver);
		
		//String title=UtillJS.titleJs(driver);
		//System.out.println(title);
		
		UtillJS.clickJs(signUpButton, driver);
		
		//UtillJS.alertJs("This is Home page", driver);
		
		//driver.findElement(By.id("email")).sendKeys("Madhesh");
		//UtillJS.refreshJS(driver);
		
		
		//Thread.sleep(3000);
		//UtillJS.forwardBackward(driver);
		//signUpButton.click();
		
		
		
		//WebElement privacy=driver.findElement(By.xpath("//*[@id=\"pageFooterChildren\"]/ul/li[23]/a"));
		//UtillJS.scrollIntoView(driver, privacy);
		//UtillJS.borderJs(privacy, driver);
		
		//UtillJS.scrollPageDown(driver);
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		
		//driver.quit();
		
		
		
	}
}
