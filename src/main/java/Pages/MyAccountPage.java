package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//a[@id=\"addresses-link\"]/span")
    private WebElement addressButton;
    @FindBy(xpath = "//*[contains(text(), \"Order history and details\"]")
    private WebElement ordersHistoryButton;


    public WebElement getAddressButton(){
        return getVisibleElement(addressButton);
    }
    public void clickAddressButton(){
        getAddressButton().click();
    }

    public void clickOrdersHistoryButton() {
        ordersHistoryButton.click();
    }
    public WebElement getOrder(){
//        WebElement order = By
    }
}
