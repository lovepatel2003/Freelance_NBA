package pageFactory;

import module.ScrollPage;
import module.Wait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LaLakersShopHomePageAnnotations {
    private final RemoteWebDriver driver;
    public LaLakersShopHomePageAnnotations(RemoteWebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(how =How.XPATH, using = "//*[@id='side-nav']/div[2]/div/div[1]/div[2]/ul/li[2]/a")
    WebElement webElementShopForWomenRadioButton;

    public String clickWebElementShopForWomenRadioButton(){
        Wait.execute(driver, webElementShopForWomenRadioButton);
        webElementShopForWomenRadioButton.click();

        String actualTitle = driver.getTitle();
        return actualTitle;
    }

    @FindBy(how = How.XPATH, using = "//*[@id='side-nav']/div[2]/div[2]/div[1]/div[2]/ul/li[6]/a")
    WebElement webElementWomenSizeNoButton;

    public void clickWebElementWomenSizeNoButton(){
        Wait.execute(driver, webElementWomenSizeNoButton);
        webElementWomenSizeNoButton.click();
    }

    @FindBy(how = How.XPATH, using = "//*[@id='side-nav']/div[2]/div[2]/div[1]/div[2]/ul/li[1]/a")
    WebElement webElementWomenHoodiesAndSweatshirts;

    public void clickWebElementWomenHoodiesAndSweatshirts(){
        Wait.execute(driver, webElementWomenHoodiesAndSweatshirts);
        webElementWomenHoodiesAndSweatshirts.click();
    }

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[5]/div[2]/div[2]/div/div[2]/div[4]/div/div[1]/div[1]/div/a/img")
    WebElement webElementWomenBlackHoodie;

    public void clickWebElementWomenBlackHoodie(){
        Wait.execute(driver, webElementWomenBlackHoodie);
        ScrollPage.ScrollToElement(driver, webElementWomenBlackHoodie);
        webElementWomenBlackHoodie.click();
    }

    @FindBy(how = How.XPATH, using = "//*[@id='size-selector-list']/a[3]")
    WebElement webElementWomenBlackHoodieSizeL;

    public void clickWebElementWomenBlackHoodieSizeL(){
        Wait.execute(driver, webElementWomenBlackHoodieSizeL);
        webElementWomenBlackHoodieSizeL.click();
    }

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[3]/div[2]/div[12]/div/div/div[5]/div/div[1]/div/div/div/div/div[1]")
    WebElement webElementWomenBlackHoodieQuantitySelector;

    public void clickWebElementWomenBlackHoodieQuantitySelector(){
        Wait.execute(driver, webElementWomenBlackHoodieQuantitySelector);
        webElementWomenBlackHoodieQuantitySelector.click();
    }

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[3]/div[2]/div[12]/div/div/div[5]/div/div[1]/div/div/div/div/span/div[2]/div[2]/div[5]")
    WebElement webElementWomenBlackHoodieQuantityFiveSelect;

    public void clickWebElementWomenBlackHoodieQuantityFiveSelect(){
        Wait.execute(driver, webElementWomenBlackHoodieQuantityFiveSelect);
        webElementWomenBlackHoodieQuantityFiveSelect.click();
    }


    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[3]/div[2]/div[12]/div/div/div[5]/div/div[2]/div/div/div/button")
    WebElement webElementWomenBlackHoodieAddToCart;

    public void clickWebElementWomenBlackHoodieAddToCart(){
        Wait.execute(driver, webElementWomenBlackHoodieAddToCart);
        webElementWomenBlackHoodieAddToCart.click();
    }
}
