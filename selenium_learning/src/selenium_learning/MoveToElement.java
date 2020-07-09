package selenium_learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		Actions actions=new Actions(driver);
		WebElement ElectronicsLiknk=driver.findElement(By.xpath("//span[text()='Electronics']"));
		actions.moveToElement(ElectronicsLiknk).build().perform();

		List<WebElement>list=driver.findElements(By.
				xpath("//span[text()='Electronics']//following::ul[1]/li/ul/li/ul/li/a"));
		for (WebElement webElement : list) {
			boolean status=webElement.isEnabled();
			String text=webElement.getText();
			System.out.println(text+" status is "   + status );
			
		}
		driver.quit();
	}

}
