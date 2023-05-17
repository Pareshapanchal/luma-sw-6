Feature: Men Page Test
  As user I want to selects Jackets from Women option
  @smoke@regression
  Scenario: User should be able to click on Pants from top menu Men and bottom and add the product in Shopping cart
    Given I am on the homepage
    When I mouse hover on Men
    And  I mouse hover on Bottoms
    And  I click on Pants
    And  I mouse hover on CronusYogaPant
    And  I click on Size"32"
    And  I click on colour "Black"
    And  I click on Add to cart button
    And  I verify that product is added to shopping cart successfully
    And  I click on Shopping cart
    And  I verify title "Shopping Cart"
    And  I verify product title "Cronus Yoga Pant"
    And  I verify Size "32"
    Then I verify Colour "Black"



