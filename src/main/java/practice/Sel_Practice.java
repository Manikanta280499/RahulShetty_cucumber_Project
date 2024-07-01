package practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Sel_Practice {
	
//	@Test
	public void brokenLinks() throws MalformedURLException, IOException {
		WebDriver w = new ChromeDriver();
		w.get("https://rahulshettyacademy.com/AutomationPractice/");
		HttpURLConnection oc = (HttpURLConnection) new URL(w.findElement(By.linkText("Broken Link")).getAttribute("href")).openConnection();
//		oc.setRequestMethod("HEAD");
//		oc.connect();
		// the above commented steps are not required
		System.out.println(oc.getResponseCode());
		System.out.println(oc.getResponseMessage());
		w.close();
	}
//	@Test
	public void headLess() throws MalformedURLException, IOException {
		ChromeOptions o1 = new ChromeOptions();
		o1.addArguments("headless");
		WebDriver w = new ChromeDriver(o1);
		w.get("https://rahulshettyacademy.com/AutomationPractice/");
		HttpURLConnection oc = (HttpURLConnection) new URL(w.findElement(By.linkText("Broken Link")).getAttribute("href")).openConnection();
//		oc.setRequestMethod("HEAD");
//		oc.connect();
		// the above commented steps are not required
		System.out.println(oc.getResponseCode());
		System.out.println(oc.getResponseMessage());
		w.close();
	}
	
	@Test
	public void javaScriptPractice() throws MalformedURLException, IOException {
		WebDriver w = new ChromeDriver();
		w.get("https://tutorialsninja.com/demo/");
		w.findElement(By.cssSelector("[title*='Cart']")).sendKeys(Keys.ENTER);
//		w.findElement(By.cssSelector("#file-upload")).click();
//		WebElement ele1 = w.findElement(By.xpath("//span[text()='My Account']/following-sibling::span"));
//		w.findElement(By.cssSelector(".caret")).click();
//		w.findElement(By.xpath("//*[@class='caret']")).click();
//		ele1.sendKeys(Keys.ENTER);
//		w.findElement(By.cssSelector(".fa.fa-user+span+span")).click();
		
//		JavascriptExecutor j1 = (JavascriptExecutor)w;
//		j1.executeScript("document.querySelector('span:nth-of-type(2)').click()");
		
		
		Actions a1 = new Actions(w);
//		a1.moveToElement(w.findElement(By.cssSelector("#file-upload"))).click().build().perform();
//		w.close();
	}
	
//	@Test
	public void spanPractice() throws MalformedURLException, IOException {
		WebDriver w = new ChromeDriver();
		w.get("https://rahulshettyacademy.com/dropdownsPractise/");
		w.findElement(By.cssSelector(".myspice_trip")).click();
		w.findElement(By.cssSelector(".book_flight span")).sendKeys(Keys.ENTER);
//		JavascriptExecutor j1 = (JavascriptExecutor)w;
//		j1.executeScript("document.querySelector('.book_flight span').click()");
//		w.findElement(By.cssSelector("span")).click();
		Actions a1 = new Actions(w);
//		a1.moveToElement(w.findElement(By.cssSelector(".book_flight span:nth-child(2)"))).click().build().perform();
	}
	

}
