package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
	public WebDriver driver;

	
	public CheckoutPage(WebDriver driver)
	{
		this.driver = driver;
	}
	private By cartBag = By.cssSelector("[alt='Cart']");
	private By checkOutButton = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	private By promoBtn = By.cssSelector(".promoBtn");
	private By placeOrder = By.xpath("//button[contains(text(),'Place Order')]");

	
	
	public void CheckoutItems()
	{
		WebElement findElement = driver.findElement(cartBag);
		findElement.click();
		driver.findElement(checkOutButton).click();
	}
	
	public Boolean VerifyPromoBtn()
	{
		return driver.findElement(promoBtn).isDisplayed();
	}
	
	public Boolean VerifyPlaceOrder()
	{
		return driver.findElement(placeOrder).isDisplayed();
	}
	
	
	
	
}
