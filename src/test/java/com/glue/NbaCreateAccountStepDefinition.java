package com.glue;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.NbaCreateAccountAnnotations;
import pageFactory.NbaStoreHomePageAnnotations;

public class NbaCreateAccountStepDefinition {
    NbaStoreHomePageAnnotations objNbaStoreHomePageAnnotations;
    NbaCreateAccountAnnotations objNbaCreateAccountAnnotations;

    @When("Click on My Account in the Information section in the footer")
    public void click_on_My_Account_in_the_Information_section_in_the_footer() {
        objNbaStoreHomePageAnnotations = new NbaStoreHomePageAnnotations(TorontoRaptorsStepDefinition.driver);

        objNbaStoreHomePageAnnotations.clickWebElementMyAccount();
    }

    @When("Click Create Account")
    public void click_Create_Account() {
        objNbaCreateAccountAnnotations = new NbaCreateAccountAnnotations(TorontoRaptorsStepDefinition.driver);

        objNbaCreateAccountAnnotations.clickWebElementCreateAccountLabel();
    }

    @Then("Enter all account details")
    public void enter_all_account_details() {
        objNbaCreateAccountAnnotations = new NbaCreateAccountAnnotations(TorontoRaptorsStepDefinition.driver);

        String firstName = "abcd";
        objNbaCreateAccountAnnotations.clickWebElementFirstNameField(firstName);

        String lastName = "efgh";
        objNbaCreateAccountAnnotations.clickWebElementLastNameField(lastName);

        String email = "abcdef@gmail.com";
        objNbaCreateAccountAnnotations.clickWebElementEmailField(email);

        String password = "abcd@1234";
        objNbaCreateAccountAnnotations.clickWebElementPasswordField(password);
        objNbaCreateAccountAnnotations.clickWebElementConfirmPasswordField(password);

        objNbaCreateAccountAnnotations.clickWebElementCheckBox1();
        objNbaCreateAccountAnnotations.clickWebElementCheckBox2();
    }

    @Then("Click Create Account Button")
    public void click_Create_Account_Button() {
        objNbaCreateAccountAnnotations = new NbaCreateAccountAnnotations(TorontoRaptorsStepDefinition.driver);

        objNbaCreateAccountAnnotations.clickWebElementCreateAnAccountButton();
    }

}
