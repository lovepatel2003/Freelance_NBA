package pageFactory;

import module.ScrollPage;
import module.Wait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class TorontoRaptorsShopHomePageAnnotations {
    private final RemoteWebDriver driver;

    public TorontoRaptorsShopHomePageAnnotations(RemoteWebDriver driver) {
        this.driver = driver;
    }

    //@FindBy(how =How.XPATH, using = "//*[@id='side-nav']/div[2]/div/div[1]/div[2]/ul/li[1]/a")
    @FindBy(how =How.XPATH, using = "//*[@id='side-nav']/div[2]/div/div[1]/div[2]/ul/li")
    List<WebElement> webElementShopForMenRadioButton;

    public String clickWebElementShopForMenRadioButton(){
        //Wait.execute(driver, webElementShopForMenRadioButton);
        //webElementShopForMenRadioButton.click();
        System.out.println();
        //boolean actualFlag = webElementShopForMenRadioButton.isSelected();
        //return actualFlag;
        String actualTitle = driver.getTitle();
        return actualTitle;
    }

    //@FindBy(how = How.XPATH, using = "//*[@id='side-nav']/div[2]/div[2]/div[1]/div[2]/ul/li[3]/a")
    @FindBy(how = How.XPATH, using = "//*[@id='side-nav']/div[2]/div[2]/div[1]/div[2]/ul/li")
    List<WebElement> webElementMenSizeLButton;

    public void clickWebElementMenSizeLButton(){
        //Wait.execute(driver, webElementMenSizeLButton);
        //webElementMenSizeLButton.click();
        System.out.println();
        //boolean actualFlag = webElementMenSizeLButton.isSelected();
    }

    //@FindBy(how = How.XPATH, using = "//*[@id='side-nav']/div[2]/div[2]/div[1]/div[2]/ul/li[3]/a")
    @FindBy(how = How.XPATH, using = "//*[@id='side-nav']/div[2]/div[2]/div[1]/div[2]/ul/li")
    List<WebElement> webElementTShirtsFeaturedDepartments;

    public void clickWebElementTShirtsFeaturedDepartments(){
        //Wait.execute(driver, webElementTShirtsFeaturedDepartments);
        //webElementTShirtsFeaturedDepartments.click();
        System.out.println();
    }

    //Search, Click and Add to cart Item Number 1
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[6]/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div[1]/div/a/img")
    WebElement webElementNumber1Item;

    public void clickWebElementNumber1Item(){
        Wait.execute(driver, webElementNumber1Item);
        webElementNumber1Item.click();
    }

    @FindBy(how = How.XPATH, using = "//*[@id='size-selector-list']/a[2]")
    WebElement webElementNumber1ItemSizeM;

    public void clickWebElementNumber1ItemSizeM(){
        Wait.execute(driver, webElementNumber1ItemSizeM);
        webElementNumber1ItemSizeM.click();
    }

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[4]/div[2]/div[11]/div/div/div[5]/div/div[2]/div/div/div/button")
    WebElement webElementAddToCart;

    public void clickWebElementAddToCart(){
        Wait.execute(driver, webElementAddToCart);
        webElementAddToCart.click();
    }

    //Continue Shopping Label
    @FindBy(how = How.XPATH, using = "")
    WebElement webElementContinueShoppingLabel;

    public void clickWebElementContinueShoppingLabel(){
        Wait.execute(driver, webElementContinueShoppingLabel);
        ScrollPage.ScrollToElement(driver, webElementContinueShoppingLabel);
        webElementContinueShoppingLabel.click();
    }

    //Search, Click and Add to cart Item Number 2
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[6]/div[2]/div[2]/div/div[2]/div[3]/div/div[1]/div[1]/div/a/img")
    WebElement webElementNumber2Item;

    public void clickWebElementNumber2Item(){
        Wait.execute(driver, webElementNumber2Item);
        webElementNumber2Item.click();
    }

    @FindBy(how = How.XPATH, using = "//*[@id='size-selector-list']/a[5]")
    WebElement webElementNumber2ItemSize2XL;

    public void clickWebElementNumber2ItemSize2XL(){
        Wait.execute(driver, webElementNumber2ItemSize2XL);
        webElementNumber2ItemSize2XL.click();
    }

    //Search, Click and Add to cart Item Number 3
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[6]/div[2]/div[2]/div/div[2]/div[8]/div/div[1]/div[1]/div/a/img")
    WebElement webElementNumber3Item;

    public void clickWebElementNumber3Item(){
        Wait.execute(driver, webElementNumber3Item);
        ScrollPage.ScrollToElement(driver, webElementNumber3Item);
        webElementNumber3Item.click();
    }

    @FindBy(how = How.XPATH, using = "//*[@id='size-selector-list']/a[6]")
    WebElement webElementNumber3ItemSize3XL;

    public void clickWebElementNumber3ItemSize3XL(){
        Wait.execute(driver, webElementNumber3ItemSize3XL);
        webElementNumber3ItemSize3XL.click();
    }

    //Search, Click and Add to cart Item Number 4
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[6]/div[2]/div[2]/div/div[2]/div[13]/div/div[1]/div[1]/div/a/img")
    WebElement webElementNumber4Item;

    public void clickWebElementNumber4Item(){
        Wait.execute(driver, webElementNumber4Item);
        ScrollPage.ScrollToElement(driver, webElementNumber4Item);
        webElementNumber4Item.click();
    }

    @FindBy(how = How.XPATH, using = "//*[@id='size-selector-list']/a[1]")
    WebElement webElementNumber4ItemSizeS;

    public void clickWebElementNumber4ItemSizeS(){
        Wait.execute(driver, webElementNumber4ItemSizeS);
        webElementNumber4ItemSizeS.click();
    }

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[2]/header/div[1]/div[2]/a")
    WebElement webElementCart;

    public void goToCart(){
        Wait.execute(driver, webElementCart);
        webElementCart.click();
    }
}
