package com.glue;

import Browser.OpenBrowser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.remote.RemoteWebDriver;
import pageFactory.LaLakersShopHomePageAnnotations;
import pageFactory.NbaStoreHomePageAnnotations;
import pageFactory.TorontoRaptorsShopHomePageAnnotations;

public class LaLakersStepDefinition {
    //OpenBrowser objOpenBrowser = new OpenBrowser();
    //RemoteWebDriver driver = objOpenBrowser.browserOpen();
    NbaStoreHomePageAnnotations objNbaStoreHomePageAnnotaions;
    LaLakersShopHomePageAnnotations objLaLakersShopHomePageAnnotations;

    @Given("Select Los Angeles Lakers shop for purchase")
    public void select_Los_Angeles_Lakers_shop_for_purchase() {
        objNbaStoreHomePageAnnotaions = new NbaStoreHomePageAnnotations(TorontoRaptorsStepDefinition.driver);

        objNbaStoreHomePageAnnotaions.hoverOnWebElementShopByTeam();

        String expectedTitle = "Los Angeles Lakers Gear, Lakers Jerseys, Store, Lakers Pro Shop, Apparel | www.nbastore.ca";
        String actualTitle = objNbaStoreHomePageAnnotaions.clickWebElementLaLakers();
        //System.out.println(actualTitle);

        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @When("Select women shop for")
    public void select_women_shop_for() {
        objLaLakersShopHomePageAnnotations = new LaLakersShopHomePageAnnotations(TorontoRaptorsStepDefinition.driver);

        String expectedTitle = "Women's Los Angeles Lakers Gear, Womens Lakers Apparel | www.nbastore.ca";
        String actualTitle = objLaLakersShopHomePageAnnotations.clickWebElementShopForWomenRadioButton();
        System.out.println(actualTitle);

        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @When("Select size No size")
    public void select_size_No_size() {
        objLaLakersShopHomePageAnnotations = new LaLakersShopHomePageAnnotations(TorontoRaptorsStepDefinition.driver);

        objLaLakersShopHomePageAnnotations.clickWebElementWomenSizeNoButton();
    }

    @When("Select Face Coverings in Departments")
    public void select_Face_Coverings_in_Departments() {
        objLaLakersShopHomePageAnnotations = new LaLakersShopHomePageAnnotations(TorontoRaptorsStepDefinition.driver);

        objLaLakersShopHomePageAnnotations.clickWebElementWomenHoodiesAndSweatshirts();
    }

    @Then("Add five quantity of face mask to the cart")
    public void add_five_quantity_of_face_mask_to_the_cart() {
        objLaLakersShopHomePageAnnotations = new LaLakersShopHomePageAnnotations(TorontoRaptorsStepDefinition.driver);

        objLaLakersShopHomePageAnnotations.clickWebElementWomenBlackHoodie();
        objLaLakersShopHomePageAnnotations.clickWebElementWomenBlackHoodieSizeL();
        objLaLakersShopHomePageAnnotations.clickWebElementWomenBlackHoodieQuantitySelector();
        objLaLakersShopHomePageAnnotations.clickWebElementWomenBlackHoodieQuantityFiveSelect();
        objLaLakersShopHomePageAnnotations.clickWebElementWomenBlackHoodieAddToCart();
    }

    @Then("verify items are added to the cart")
    public void verify_items_are_added_to_the_cart() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
