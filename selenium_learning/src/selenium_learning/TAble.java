package selenium_learning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TAble {  

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/table.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> Column= driver.findElements(By.tagName("th"));
		int columnCount=Column.size();
		System.out.println(columnCount);
		
		List<WebElement> Row= driver.findElements(By.tagName("tr"));
		int RowCount=Column.size();
		System.out.println(RowCount);
		
		String progressValue=driver.findElement
				(By.xpath("//td[text()='Learn to interact with Elements']/following::td")).getText();
		System.out.println(progressValue);
		
		List<WebElement> allProgress=driver.findElements(By.xpath(""));

	}

}
