package defaultproject.AbstractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class AbstractComponents {
	
	WebDriver driver;

	public AbstractComponents(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "[routerlink*='cart']")
	WebElement cartButton;
	
	public void waitForElementToAppear(By findBy) {
		WebDriverWait waitAppear = new WebDriverWait(driver, Duration.ofSeconds(5));
		waitAppear.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	}
	
	public void waitForElementToDisappear(WebElement ele) {
		WebDriverWait waitDisappear = new WebDriverWait(driver, Duration.ofSeconds(5));
		waitDisappear.until(ExpectedConditions.invisibilityOf(ele));
	}
	
	public void waitForTextToAppear(By ele, String text) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(ele, text));
	}
	
	/*
	 * public cartPage goToCartPage() { cartButton.click(); cartPage CartPage = new
	 * cartPage(driver); return CartPage; }
	 */
	
	/*
	 * public void goToHomePage() { homeButton.click(); }
	 */
	
	/*
	 * public PaymentPage goToPaymentPage() { checkOutBtn.click(); PaymentPage
	 * paymentPage = new PaymentPage(driver); return paymentPage; }
	 */
	
	/*
	 * public OrderPage goToOrdersPage() { ordersButton.click(); OrderPage orderPage
	 * = new OrderPage(driver); return orderPage; }
	 */
	
	/*
	 * public ConfirmationPage goToConfirmationPage() { placeOrderBtn.click();
	 * ConfirmationPage confirmationPage = new ConfirmationPage(driver); return
	 * confirmationPage; }
	 */
	
	/*
	 * public void signOut() { signOutButton.click(); }
	 */
	
	
}

