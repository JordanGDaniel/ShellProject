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
	
	@FindBy(css = "[routerlink='/dashboard/']")
	WebElement homeButton;
	
	@FindBy(css = "[routerlink*='myorders']")
	WebElement ordersButton;
	
	@FindBy(xpath = "//button/i[@class='fa fa-sign-out']")
	WebElement signOutButton;
	
	@FindBy(css=".btnn.action__submit.ng-star-inserted")
	WebElement placeOrderBtn;

	
	@FindBy(css="li[class='totalRow'] button[type='button']")
	WebElement checkOutBtn;
	
	
	public void waitForElementToAppear(By findBy) {
		WebDriverWait waitAppear = new WebDriverWait(driver, Duration.ofSeconds(5));
		waitAppear.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	}
	
	public void waitForElementToDisappear(WebElement ele) {
		WebDriverWait waitDisappear = new WebDriverWait(driver, Duration.ofSeconds(5));
		waitDisappear.until(ExpectedConditions.invisibilityOf(ele));
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

