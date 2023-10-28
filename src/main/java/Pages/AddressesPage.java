package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressesPage extends BasePage{
    public AddressesPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//div[@class=\"addresses-footer\"]/a")
    private WebElement createNewAddressButton;
    @FindBy(className="alert-success")
    private WebElement alertSuccess;
    @FindBy(xpath = "(//*[@class=\"address-body\"])[last()]/h4")
    private WebElement lastAddressAlias;
    @FindBy(xpath = "(//*[@class=\"address-body\"])[last()]/address")
    private WebElement lastAddressDetails;
    @FindBy(xpath = "(//*[@class=\"address-footer\"])[last()]//*[contains(text(), \"Delete\")]")
    private WebElement addedAddressDeleteButton;



    public WebElement getCreateNewAddressButton() {
        return getVisibleElement(createNewAddressButton);
    }
    public void clickCreateNewAddressButton() {
        getCreateNewAddressButton().click();
    }
    public String getAlertAddSuccessText(){
        return getVisibleElement(alertSuccess).getText();
    }

    public WebElement getLastAddressAlias() {
        return getVisibleElement(lastAddressAlias);
    }
    public WebElement getAddedAddressDetails(){
        return getVisibleElement(lastAddressDetails);
    }
    public WebElement getAddedAddressDeleteButton(){
        return getVisibleElement(addedAddressDeleteButton);
    }
    public void clickAddedAddressDeleteButton(){
        getAddedAddressDeleteButton().click();
    }
    public String getAlertDeleteSuccessText(){
        return getVisibleElement(alertSuccess).getText();
    }


}
