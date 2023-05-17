
Feature: Women Page Test
  As user I want to selects Jackets from Women option and verify the Sort By field options
@smoke@regression
  Scenario: User should go to Jackets and able see products displayed in Alphabetical order after when filter Sort By Product Name
    Given I am on the homepage
    When I mouse hover on Women
    And I mouse hover on Tops
    And I click on Jackets
    And I select from Sort By filter "Product Name"
    Then I should see products display in alphabetical order
@sanity@regression
    Scenario: User should select Jackets and able see product displayed in Low to High order
      Given I am on the homepage
      When  I mouse hover on Women
      And I mouse hover on Tops
      And I click on Jackets
      And I select from Sort By filter "Price"
      Then I should see product's price displayed in Low to High order