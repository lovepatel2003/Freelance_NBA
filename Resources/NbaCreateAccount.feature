#@FeatureTags
Feature: NBA Create New Account
#@ScenarioTags
  Scenario: Test by creating a new NBA account
    Given Go to NBA store
    When Click on My Account in the Information section in the footer
    And Click Create Account
    Then Enter all account details
    And Click Create Account Button