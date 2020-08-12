#@FeatureTags
Feature: NBA Store Safe Shopping
#@ScenarioTags
  Scenario: Check the links in Safe Shopping label
    Given Go to NBA store
    When Click Safe Shipping label
    Then Click return policy
    And Click return instructions
    And Type payment and click Ask