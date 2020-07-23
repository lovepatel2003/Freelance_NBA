#@FeatureTags
Feature: Toronto Raptors store purchase functionality
#@ScenarioTags
  Scenario: order 4 merchandise items from Toronto Raptors shop
    Given Go to NBA store
    And Select Toronto Raptors shop for purchase
    When Select men shop for
    And Select size L
    And Select T-Shirts in Features Departments
    Then Add four random items to the cart
    And verify all the items are added to the cart