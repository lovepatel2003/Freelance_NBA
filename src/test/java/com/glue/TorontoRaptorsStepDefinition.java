package com.glue;

import Browser.OpenBrowser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import module.Constant;
import org.junit.Assert;
import org.openqa.selenium.remote.RemoteWebDriver;
import pageFactory.NbaStoreHomePageAnnotations;
import pageFactory.TorontoRaptorsShopHomePageAnnotations;

public class TorontoRaptorsStepDefinition {
    OpenBrowser objOpenBrowser = new OpenBrowser();
    RemoteWebDriver driver = objOpenBrowser.browserOpen();
    NbaStoreHomePageAnnotations objNbaStoreHomePageAnnotaions;
    TorontoRaptorsShopHomePageAnnotations objTorontoRaptorsShopHomePageAnnotations;

    @Given("Go to NBA store")
    public void go_to_NBA_store() {
        driver.get(Constant.nbaStoreURL);

        driver.manage().deleteAllCookies();

        String expectedTitle = "NBA Gear, NBA Jerseys | www.nbastore.ca";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Given("Select Toronto Raptors shop for purchase")
    public void select_Toronto_Raptors_shop_for_purchase() {
        objNbaStoreHomePageAnnotaions = new NbaStoreHomePageAnnotations(driver);

        objNbaStoreHomePageAnnotaions.hoverOnWebElementShopByTeam();

        String expectedTitle = "Toronto Raptors Gear, Raptors Jerseys, Store, Raptors Pro Shop, Apparel | www.nbastore.ca";
        String actualTitle = objNbaStoreHomePageAnnotaions.clickWebElementTorontoRaptors();

        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @When("Select men shop for")
    public void select_men_shop_for() {
        objTorontoRaptorsShopHomePageAnnotations = new TorontoRaptorsShopHomePageAnnotations(driver);

        String expectedTitle = "Men's Toronto Raptors Gear, Mens Raptors Apparel | www.nbastore.ca";
        String actualTitle = objTorontoRaptorsShopHomePageAnnotations.clickWebElementShopForMenRadioButton();

        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @When("Select size L")
    public void select_size_L() {
        objTorontoRaptorsShopHomePageAnnotations = new TorontoRaptorsShopHomePageAnnotations(driver);

        objTorontoRaptorsShopHomePageAnnotations.clickWebElementMenSizeLButton();
    }

    @When("Select T-Shirts in Features Departments")
    public void select_T_Shirts_in_Features_Departments() {
        objTorontoRaptorsShopHomePageAnnotations = new TorontoRaptorsShopHomePageAnnotations(driver);

        objTorontoRaptorsShopHomePageAnnotations.clickWebElementTShirtsFeaturedDepartments();
    }

    @Then("Add four random items to the cart")
    public void add_four_random_items_to_the_cart() {
        objTorontoRaptorsShopHomePageAnnotations = new TorontoRaptorsShopHomePageAnnotations(driver);

        objTorontoRaptorsShopHomePageAnnotations.clickWebElementNumber1Item();
        objTorontoRaptorsShopHomePageAnnotations.clickWebElementNumber1ItemSizeM();
        objTorontoRaptorsShopHomePageAnnotations.clickWebElementAddToCart();
        objTorontoRaptorsShopHomePageAnnotations.clickWebElementContinueShoppingLabel();

        objTorontoRaptorsShopHomePageAnnotations.clickWebElementNumber2Item();
        objTorontoRaptorsShopHomePageAnnotations.clickWebElementNumber1ItemSizeM();
        objTorontoRaptorsShopHomePageAnnotations.clickWebElementAddToCart();
        objTorontoRaptorsShopHomePageAnnotations.clickWebElementContinueShoppingLabel();

        objTorontoRaptorsShopHomePageAnnotations.clickWebElementNumber3Item();
        objTorontoRaptorsShopHomePageAnnotations.clickWebElementNumber3ItemSize3XL();
        objTorontoRaptorsShopHomePageAnnotations.clickWebElementAddToCart();
        objTorontoRaptorsShopHomePageAnnotations.clickWebElementContinueShoppingLabel();

        objTorontoRaptorsShopHomePageAnnotations.clickWebElementNumber4Item();
        objTorontoRaptorsShopHomePageAnnotations.clickWebElementNumber4ItemSizeS();
        objTorontoRaptorsShopHomePageAnnotations.clickWebElementAddToCart();
        objTorontoRaptorsShopHomePageAnnotations.clickWebElementContinueShoppingLabel();
    }

    @Then("verify all the items are added to the cart")
    public void verify_all_the_items_are_added_to_the_cart() {
        objTorontoRaptorsShopHomePageAnnotations = new TorontoRaptorsShopHomePageAnnotations(driver);

        objTorontoRaptorsShopHomePageAnnotations.goToCart();
    }

}
