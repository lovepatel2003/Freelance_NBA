package pageFactory;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

public class ChicagoBullsAnnotations {
    private final RemoteWebDriver driver;

    public ChicagoBullsAnnotations(RemoteWebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


}
