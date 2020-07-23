package pageFactory;

import module.Wait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class NbaStoreHomePageAnnotations {
    private final RemoteWebDriver driver;
    public NbaStoreHomePageAnnotations(RemoteWebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH,using = "//*[@id='0']")
    WebElement webElementShopByTeam;

    public void hoverOnWebElementShopByTeam(){
        //Actions builder = new Actions(driver);
        //Action mouseOverShopByTeam = (Action) builder.moveToElement(webElementShopByTeam).build();
        webElementShopByTeam.click();
    }

    @FindBy(how = How.XPATH,using = "/html/body/div[2]/div/div[1]/header/div[3]/nav/ul/li[1]/div/div[1]/div[1]/div[2]/div[2]/a[3]/div[3]")
    WebElement webElementTorontoRaptors;

    public String clickWebElementTorontoRaptors(){
        Wait.execute(driver, webElementTorontoRaptors);
        webElementTorontoRaptors.click();
        String actualTitle = driver.getTitle();
        return actualTitle;
    }

    @FindBy(how = How.XPATH,using = "/html/body/div[2]/div/div[1]/header/div[3]/nav/ul/li[1]/div/div[1]/div[2]/div[2]/div[2]/a[1]/div[3]")
    WebElement webElementLaLakers;

    public String clickWebElementLaLakers(){
        Wait.execute(driver, webElementLaLakers);
        webElementLaLakers.click();
        String actualTitle = driver.getTitle();
        return actualTitle;
    }
}
