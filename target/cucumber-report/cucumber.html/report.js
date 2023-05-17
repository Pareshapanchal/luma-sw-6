$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("gear.feature");
formatter.feature({
  "line": 2,
  "name": "Gear Page Test",
  "description": "",
  "id": "gear-page-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 4921917801,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User should Add Product SuccessFully To Shopping Cart",
  "description": "",
  "id": "gear-page-test;user-should-add-product-successfully-to-shopping-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I mouse hover on Gear Menu",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I click on Bags",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on Product Name \"Overnight Duffle\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I change Qty \"3\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on Addtocart button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I verify the text\"You added Overnight Duffle to your shopping cart.\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on ShoppinCart Link",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I verify the product name \"Overnight Duffle\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I verify the Qty is \"3\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I verify the product price \"$135.00\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I change Qty to \"5\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on \"Update Shopping Cart\" button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I verify the final product price \"$225.00\"",
  "keyword": "Then "
});
formatter.match({
  "location": "WomenSteps.i_am_on_the_homepage()"
});
formatter.result({
  "duration": 49836099,
  "status": "passed"
});
formatter.match({
  "location": "GearSteps.iMouseHoverOnGearMenu()"
});
formatter.result({
  "duration": 546376200,
  "status": "passed"
});
formatter.match({
  "location": "GearSteps.iClickOnBags()"
});
formatter.result({
  "duration": 859693401,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Overnight Duffle",
      "offset": 25
    }
  ],
  "location": "GearSteps.iClickOnProductName(String)"
});
formatter.result({
  "duration": 714997700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 14
    }
  ],
  "location": "GearSteps.iChangeQty(String)"
});
formatter.result({
  "duration": 224915901,
  "status": "passed"
});
formatter.match({
  "location": "GearSteps.iClickOnAddtocartButton()"
});
formatter.result({
  "duration": 63471900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "You added Overnight Duffle to your shopping cart.",
      "offset": 18
    }
  ],
  "location": "GearSteps.iVerifyTheText(String)"
});
formatter.result({
  "duration": 1481615400,
  "status": "passed"
});
formatter.match({
  "location": "GearSteps.iClickOnShoppinCartLink()"
});
formatter.result({
  "duration": 3972201599,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Overnight Duffle",
      "offset": 27
    }
  ],
  "location": "GearSteps.iVerifyTheProductName(String)"
});
formatter.result({
  "duration": 2067661100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 21
    }
  ],
  "location": "GearSteps.iVerifyTheQtyIs(String)"
});
formatter.result({
  "duration": 76602400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$135.00",
      "offset": 28
    }
  ],
  "location": "GearSteps.iVerifyTheProductPrice(String)"
});
formatter.result({
  "duration": 49243000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 17
    }
  ],
  "location": "GearSteps.iChangeQtyTo(String)"
});
formatter.result({
  "duration": 211630300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Update Shopping Cart",
      "offset": 12
    }
  ],
  "location": "GearSteps.iClickOnButton(String)"
});
formatter.result({
  "duration": 89252799,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$225.00",
      "offset": 34
    }
  ],
  "location": "GearSteps.iVerifyTheFinalProductPrice(String)"
});
formatter.result({
  "duration": 2875731600,
  "status": "passed"
});
formatter.after({
  "duration": 727300301,
  "status": "passed"
});
});