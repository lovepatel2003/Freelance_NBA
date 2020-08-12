package com.glue;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.NbaStoreHomePageAnnotations;

public class ChicagoBullsStepDefinition {
    NbaStoreHomePageAnnotations objNbaStoreHomePageAnnotations;

    @When("Click on the Chicago Bulls store logo")
    public void click_on_the_Chicago_Bulls_store_logo() {
        //objNbaStoreHomePageAnnotations = new NbaStoreHomePageAnnotations(TorontoRaptorsStepDefinition.driver);
        //objNbaStoreHomePageAnnotations.clickWebElementChicagoBulls();
    }

    @Then("Click any random item for purchase and add to the cart")
    public void click_any_random_item_for_purchase_and_add_to_the_cart() {
        // Write code here that turns the phrase above into concrete actions
        a.PendingException
    }

}
