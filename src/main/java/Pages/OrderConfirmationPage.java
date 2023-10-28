package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderConfirmationPage extends BasePage{
    public OrderConfirmationPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[text()[contains(.,\"Your order is confirmed\")]]")
    private WebElement confirmationAlert;
    @FindBy(className = "definition-list")
    private WebElement confirmationCard;
    @FindBy(id="order-reference-value")
    private WebElement orderReferenceValue;
    @FindBy(className="account");
    private WebElement accountLink;

    public WebElement getConfirmationAlert() {
        return getVisibleElement(confirmationAlert);
    }
    public WebElement getConfirmationCard() {
        return getVisibleElement(confirmationCard);
    }
    public String getReferenceValueNumber(){
        String text = orderReferenceValue.getText();
        String orderNumber = text.replace("Order reference: ", "");
        return orderNumber;
    }
    public void goToAccount() {
        accountLink.click();
    }


}
