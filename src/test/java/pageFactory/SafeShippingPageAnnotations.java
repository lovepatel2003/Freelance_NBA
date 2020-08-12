package pageFactory;

import module.ScrollPage;
import module.Wait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SafeShippingPageAnnotations {
    private final RemoteWebDriver driver;

    public SafeShippingPageAnnotations(RemoteWebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id='yui_3_13_0_1_1597131421292_328']")
    WebElement webElementReturnPolicyLabel;

    public void clickWebElementReturnPolicyLabel(){
        Wait.execute(driver, webElementReturnPolicyLabel);
        webElementReturnPolicyLabel.click();
    }

    @FindBy(how = How.XPATH, using = "//*[@id='yui_3_13_0_1_1597131421292_338']")
    WebElement webElementWhatIsReturnPolicyLabel;

    public void clickWebElementWhatIsReturnPolicyLabel(){
        Wait.execute(driver, webElementWhatIsReturnPolicyLabel);
        ScrollPage.ScrollToElement(driver, webElementWhatIsReturnPolicyLabel);
        webElementWhatIsReturnPolicyLabel.click();
    }

    @FindBy(how = How.XPATH, using = "//*[@id='yui_3_13_0_1_1597207782671_369']")
    WebElement webElementReturnInstructions;

    public void clickWebElementReturnInstructions(){
        Wait.execute(driver, webElementReturnInstructions);
        ScrollPage.ScrollToElement(driver, webElementReturnInstructions);
        webElementReturnInstructions.click();
    }

    @FindBy(how = How.XPATH, using = "//*[@id='rn_KeywordTextWithPlaceholder_5_Text']")
    WebElement webElementSearchBox;

    public void clickWebElementSearchBox(){
        Wait.execute(driver, webElementSearchBox);
        webElementSearchBox.click();

        String searchBoxKeys = "payment return";
        webElementSearchBox.sendKeys(searchBoxKeys);
    }

    @FindBy(how = How.XPATH, using = "//*[@id='rn_SearchButton_6_SubmitButton']")
    WebElement webElementAskButton;

    public void clickWebElementAskButton(){
        Wait.execute(driver, webElementAskButton);
        webElementAskButton.click();
    }
}
