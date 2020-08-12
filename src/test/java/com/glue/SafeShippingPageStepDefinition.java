package com.glue;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageFactory.NbaStoreHomePageAnnotations;
import pageFactory.SafeShippingPageAnnotations;

public class SafeShippingPageStepDefinition {
    NbaStoreHomePageAnnotations objNbaStoreHomePageAnnotations;
    SafeShippingPageAnnotations objSafeShippingPageAnnotations;

    @When("Click Safe Shipping label")
    public void click_Safe_Shipping_label() throws InterruptedException {
        objNbaStoreHomePageAnnotations = new NbaStoreHomePageAnnotations(TorontoRaptorsStepDefinition.driver);

        Thread.sleep(7000);

        String expectedTitle = "Security & Safe Shopping";
        String actualTitle = objNbaStoreHomePageAnnotations.clickWebElementSafeShoppingLabel();

        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Then("Click return policy")
    public void click_return_policy() {
        objSafeShippingPageAnnotations = new SafeShippingPageAnnotations(TorontoRaptorsStepDefinition.driver);
        objSafeShippingPageAnnotations.clickWebElementWhatIsReturnPolicyLabel();
    }

    @Then("Click return instructions")
    public void click_return_instructions() {
        objSafeShippingPageAnnotations = new SafeShippingPageAnnotations(TorontoRaptorsStepDefinition.driver);
        objSafeShippingPageAnnotations.clickWebElementReturnInstructions();
    }

    @Then("Type payment and click Ask")
    public void type_payment_and_click_Ask() {
        objSafeShippingPageAnnotations = new SafeShippingPageAnnotations(TorontoRaptorsStepDefinition.driver);
        objSafeShippingPageAnnotations.clickWebElementSearchBox();
        objSafeShippingPageAnnotations.clickWebElementAskButton();
    }
}
