package Utill;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UtillJS {

	public static void Flash(WebElement element, WebDriver driver) {

		String backgroundColor = element.getCssValue("backgroundColor");

		for (int i = 0; i < 500; i++) {

			changeColor(element, driver, "#FF0000");
			changeColor(element, driver, backgroundColor);
		}
	}

	private static void changeColor(WebElement element, WebDriver driver, String color) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.backgroundColor=" + "'" + color + "'" + ";", element);
		// js.executeScript("arguments[0].style.backgroundColor='red';", element);
		try {
			Thread.sleep(20);
		} catch (Exception e) {

		}

	}

	public static void borderJs(WebElement element, WebDriver driver) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='red 5px double'", element);
	}

	public static String titleJs(WebDriver driver) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String title = js.executeScript("return document.title;").toString();

		return title;

	}

	public static void clickJs(WebElement element, WebDriver driver) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	public static void alertJs(String message, WebDriver driver) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('" + message + "')");

	}

	public static void refreshJS(WebDriver driver) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("history.go(0)");
	}

	public static void forwardBackward(WebDriver driver) throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.history.back()");
		Thread.sleep(3000);
		js.executeScript("window.history.forward()");
	}

	public static void scrollIntoView(WebDriver driver, WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public static void scrollPageDown(WebDriver driver) throws InterruptedException, AWTException {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		
		
		/*
		 * Robot robot=new Robot(); robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		 * robot.keyRelease(KeyEvent.VK_PAGE_DOWN); Thread.sleep(2000);
		 * robot.keyPress(KeyEvent.VK_PAGE_UP); robot.keyRelease(KeyEvent.VK_PAGE_UP);
		 */

		/*
		 * js.executeScript("window.scrollBy(0,1000)"); Thread.sleep(3000);
		 * js.executeScript("window.scrollTo(0,0)");
		 */

		/*
		 * js.executeScript("window.scroll(0,1000)"); Thread.sleep(3000);
		 * js.executeScript("window.scroll(0,-1000)");
		 */
	}

}
