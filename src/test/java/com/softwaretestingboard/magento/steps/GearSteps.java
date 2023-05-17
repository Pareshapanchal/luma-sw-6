package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.GearPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class GearSteps {
    @When("^I mouse hover on Gear Menu$")
    public void iMouseHoverOnGearMenu() {
        new GearPage().mouseHoverOnGearMenu();
    }

    @And("^I click on Bags$")
    public void iClickOnBags() {
        new GearPage().clickOnBags();
    }

    @And("^I click on Product Name \"([^\"]*)\"$")
    public void iClickOnProductName(String arg0)  {
        new GearPage().clickOnOvernightduffle();
    }

    @And("^I change Qty \"([^\"]*)\"$")
    public void iChangeQty(String qty)  {
        new GearPage().changeQuantity(qty);
    }

    @And("^I click on Addtocart button$")
    public void iClickOnAddtocartButton() {
        new GearPage().clickOnAddToCartButton();
    }

    @And("^I verify the text\"([^\"]*)\"$")
    public void iVerifyTheText(String text)  {
        // * Verify the text‘You added Overnight Duffle to your shopping cart.’
        //String expectedProductAddedMessage =text;
                //"You added Overnight Duffle to your shopping cart.";
        String actualProductAddedMessage = new GearPage().getOvernightDuffleAddedMessage();
        Assert.assertEquals(actualProductAddedMessage,text,"not match");
    }

    @And("^I click on ShoppinCart Link$")
    public void iClickOnShoppinCartLink()throws InterruptedException {
        new GearPage().clickOnShoppingCart();
        Thread.sleep(2000);
        new GearPage().clickOnViewAndEditButton();
    }

    @And("^I verify the product name \"([^\"]*)\"$")
    public void iVerifyTheProductName(String text)throws InterruptedException  {
        Thread.sleep(2000);
     Assert.assertEquals(new GearPage().getProductNameOvernightDuffleText(),text,"Product name doesnot match.");

    }

    @And("^I verify the Qty is \"([^\"]*)\"$")
    public void iVerifyTheQtyIs(String qty)  {
        Assert.assertEquals(new GearPage().getProductQuantity(),qty,"Quantity doesnot match");
    }

    @And("^I verify the product price \"([^\"]*)\"$")
    public void iVerifyTheProductPrice(String text)  {
        Assert.assertEquals(new GearPage().getProductPrice(),text,"Price doesnot match.");
    }

    @And("^I change Qty to \"([^\"]*)\"$")
    public void iChangeQtyTo(String qty)  {
        new GearPage().changeProductQuantity(qty);
    }

    @And("^I click on \"([^\"]*)\" button$")
    public void iClickOnButton(String arg0) {
    new GearPage().clickOnUpdateShoppingCartButton();
    }

    @Then("^I verify the final product price \"([^\"]*)\"$")
    public void iVerifyTheFinalProductPrice(String text)  {
        Assert.assertEquals(new GearPage().getSubtotalText(),text,"Total Price not matching");
    }
}
