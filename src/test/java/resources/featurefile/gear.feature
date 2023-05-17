@sanity@regression
Feature: Gear Page Test
  Scenario: User should Add Product SuccessFully To Shopping Cart
    Given I am on the homepage
    When  I mouse hover on Gear Menu
    And   I click on Bags
    And   I click on Product Name "Overnight Duffle"
    And   I change Qty "3"
    And   I click on Addtocart button
    And   I verify the text"You added Overnight Duffle to your shopping cart."
    And   I click on ShoppinCart Link
    And   I verify the product name "Overnight Duffle"
    And   I verify the Qty is "3"
    And   I verify the product price "$135.00"
    And   I change Qty to "5"
    And   I click on "Update Shopping Cart" button
    Then  I verify the final product price "$225.00"