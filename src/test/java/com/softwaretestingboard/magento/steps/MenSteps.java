package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.MenPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MenSteps {
    @When("^I mouse hover on Men$")
    public void iMouseHoverOnMen() {
        new MenPage().mouseHoverOnMenMenu();
    }

    @And("^I mouse hover on Bottoms$")
    public void iMouseHoverOnBottoms() {
        new MenPage().mouseHoverOnBottoms();
    }

    @And("^I click on Pants$")
    public void iClickOnPants() {
        new MenPage().clickOnPants();
    }
    @And("^I mouse hover on CronusYogaPant$")
    public void iMouseHoverOnCronusYogaPant() {
        new MenPage().mouseHoverOnCronusYogaPant();
    }

    @And("^I click on Size\"([^\"]*)\"$")
    public void iClickOnSize(String arg0) throws InterruptedException {
        Thread.sleep(2000);
        new MenPage().clickOnSize32();

    }

    @And("^I click on colour \"([^\"]*)\"$")
    public void iClickOnColour(String arg0)throws InterruptedException  {
        Thread.sleep(2000);
        new MenPage().clickOnColourBlack();

    }

    @And("^I click on Add to cart button$")
    public void iClickOnAddToCartButton() {
        new MenPage().clickOnAddToCartButton();
    }

    @And("^I verify that product is added to shopping cart successfully$")
    public void iVerifyThatProductIsAddedToShoppingCartSuccessfully() {
        new MenPage().verifyYouaddedCronusYogaPantToYourShoppingCart();
    }

    @And("^I click on Shopping cart$")
    public void iClickOnShoppingCart() {
        new MenPage().clickOnShoppingCartLink();
    }


    @And("^I verify title \"([^\"]*)\"$")
    public void iVerifyTitle(String arg0)  {
        new MenPage().verifyShoppingCartText();
    }

    @And("^I verify product title \"([^\"]*)\"$")
    public void iVerifyProductTitle(String arg0) {
        new MenPage().verifyTheProductNameCronusYogaPant();
    }

    @And("^I verify Size \"([^\"]*)\"$")
    public void iVerifySize(String arg0) {
        new MenPage().verifyTheProductSize32();
    }

    @Then("^I verify Colour \"([^\"]*)\"$")
    public void iVerifyColour(String arg0)  {
        new MenPage().verifyTheProductColourBlack();
    }
}
