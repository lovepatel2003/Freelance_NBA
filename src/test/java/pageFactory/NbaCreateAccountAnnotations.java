package pageFactory;

import module.Wait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NbaCreateAccountAnnotations {
    private final RemoteWebDriver driver;

    public NbaCreateAccountAnnotations(RemoteWebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id='main-content-wrp']/div/section/div/form/div[1]/div[1]/span/a")
    WebElement webElementCreateAccountLabel;

    public void clickWebElementCreateAccountLabel(){
        Wait.execute(driver, webElementCreateAccountLabel);
        webElementCreateAccountLabel.click();
    }

    @FindBy(how = How.XPATH, using = "//*[@id='firstNameInput']")
    WebElement webElementFirstNameField;

    public void clickWebElementFirstNameField(String firstName){
        Wait.execute(driver, webElementFirstNameField);
        webElementFirstNameField.click();
        webElementFirstNameField.sendKeys(firstName);
    }

    @FindBy(how = How.XPATH, using = "//*[@id='lastNameInput']")
    WebElement webElementLastNameField;

    public void clickWebElementLastNameField(String lastName){
        Wait.execute(driver, webElementLastNameField);
        webElementLastNameField.click();
        webElementLastNameField.sendKeys(lastName);
    }

    @FindBy(how = How.XPATH, using = "//*[@id='emailInput']")
    WebElement webElementEmailField;

    public void clickWebElementEmailField(String email){
        Wait.execute(driver, webElementEmailField);
        webElementEmailField.click();
        webElementEmailField.sendKeys(email);
    }

    @FindBy(how = How.XPATH, using = "//*[@id='passwordInput']")
    WebElement webElementPasswordField;

    public void clickWebElementPasswordField(String password){
        Wait.execute(driver, webElementPasswordField);
        webElementPasswordField.click();
        webElementPasswordField.sendKeys(password);
    }

    @FindBy(how = How.XPATH, using = "//*[@id='passwordConfirmInput']")
    WebElement webElementConfirmPasswordField;

    public void clickWebElementConfirmPasswordField(String password){
        Wait.execute(driver, webElementConfirmPasswordField);
        webElementConfirmPasswordField.click();
        webElementConfirmPasswordField.sendKeys(password);
    }

    @FindBy(how = How.XPATH, using = "//*[@id='main-content-wrp']/div/section/div/form/div[3]/div[1]/div[1]/label/i")
    WebElement webElementCheckBox1;

    public void clickWebElementCheckBox1(){
        Wait.execute(driver, webElementCheckBox1);
        webElementCheckBox1.click();
    }

    @FindBy(how = How.XPATH, using = "//*[@id='main-content-wrp']/div/section/div/form/div[3]/div[1]/div[2]/label/i")
    WebElement webElementCheckBox2;

    public void clickWebElementCheckBox2(){
        Wait.execute(driver, webElementCheckBox2);
        webElementCheckBox2.click();
    }

    @FindBy(how = How.XPATH, using = "//*[@id='main-content-wrp']/div/section/div/form/div[4]/button")
    WebElement webElementCreateAnAccountButton;

    public void clickWebElementCreateAnAccountButton(){
        Wait.execute(driver, webElementCreateAnAccountButton);
        webElementCreateAnAccountButton.click();
    }
}
