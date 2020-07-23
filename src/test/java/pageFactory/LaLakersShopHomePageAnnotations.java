package pageFactory;

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

    @FindBy(how =How.XPATH, using = "//*[@id='side-nav']/div[2]/div/div[1]/div[2]/ul/li")
    List<WebElement> webElementShopForWomenRadioButton;

    public String clickWebElementShopForWomenRadioButton(){
        //Wait.execute(driver, webElementShopForWomenRadioButton);
        //webElementShopForWomenRadioButton.click();
        System.out.println();

        String actualTitle = driver.getTitle();
        return actualTitle;
    }

    @FindBy(how = How.XPATH, using = "//*[@id='side-nav']/div[2]/div[2]/div[1]/div[2]/ul/li")
    List<WebElement> webElementWomenSizeNoButton;

    public void clickWebElementWomenSizeNoButton(){
        //Wait.execute(driver, webElementMenSizeLButton);
        //webElementMenSizeLButton.click();
        System.out.println();
    }
}
