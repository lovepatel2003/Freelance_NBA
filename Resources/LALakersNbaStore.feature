#@FeatureTags
Feature: Los Angeles Lakers store purchase functionality
# @ScenarioTags
  Scenario: order merchandise from Los Angeles Lakers shop
    Given Go to NBA store
    And Select Los Angeles Lakers shop for purchase
    When Select women shop for
    And Select size No size
    And Select Face Coverings in Departments
    Then Add five quantity of face mask to the cart
    And verify items are added to the cart