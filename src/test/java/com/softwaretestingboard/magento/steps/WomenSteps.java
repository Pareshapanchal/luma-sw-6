package com.softwaretestingboard.magento.steps;


import com.softwaretestingboard.magento.pages.WomenPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class WomenSteps {
    @Given("^I am on the homepage$")
    public void i_am_on_the_homepage()  {

    }

    @When("^I mouse hover on Women$")
    public void i_mouse_hover_on_Women(){
        new WomenPage().mousehoverOnWomenMenu();
    }

    @When("^I mouse hover on Tops$")
    public void i_mouse_hover_on_Tops()  {
        new WomenPage().mouseHoverOnTops();
    }

    @When("^I click on Jackets$")
    public void i_click_on_Jackets()  {
        new WomenPage().clickOnJackets();

    }

    @When("^I select from Sort By filter \"([^\"]*)\"$")
    public void i_select_from_Sort_By_filter(String option)  {
        new WomenPage().sortProductsFromSortbyDropDown(option);

    }

    @Then("^I should see products display in alphabetical order$")
    public void i_should_see_products_display_in_alphabetical_order()  {
        Assert.assertEquals(new WomenPage().getActualProductsSortedByProductName(),new WomenPage().getExpectedProductsSortedByProductName(),
                "Products not dispalyed in Alphabetical order");
    }

    @Then("^I should see product's price displayed in Low to High order$")
    public void iShouldSeeProductSPriceDisplayedInLowToHighOrder() {
        Assert.assertEquals(new WomenPage().getActualProductsSortedByProductPrice(), new WomenPage().getExpectedProductsSortedByProductPrice(),
                "Products price are not displayed in Low to High order");
    }

}
