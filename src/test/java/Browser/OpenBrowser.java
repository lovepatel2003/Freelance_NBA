package Browser;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class OpenBrowser {
    RemoteWebDriver driver;
    String browser="chrome";

    //@Before
    public RemoteWebDriver browserOpen(){

        if (browser.toLowerCase().equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
            driver = new ChromeDriver();
        }
        else if(browser.toLowerCase().equals("firefox")){
            System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver");
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();

        return driver;
    }

    //@After
    public void tearDown(){
        System.out.println("sbjdfkdsfjkdsfjds");
        driver.quit();
    }
}
