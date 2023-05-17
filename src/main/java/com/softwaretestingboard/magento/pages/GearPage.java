package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GearPage extends Utility {
    private static final Logger log = LogManager.getLogger(GearPage.class.getName());
    public GearPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[@id ='ui-id-6']")
    WebElement gear;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-25']")
    WebElement bags;
    @CacheLookup
    @FindBy(xpath="//a[normalize-space()='Overnight Duffle']")
    WebElement overnightDuffle ;
    @CacheLookup
    @FindBy(xpath="//span[contains(text(),'Overnight Duffle')]")
    WebElement overnightDuffleText;
    @CacheLookup
    @FindBy(xpath="//input[@id='qty']")
    WebElement quantity ;
    @CacheLookup
    @FindBy(id= "qty")
    WebElement changeQty ;
    @CacheLookup
    @FindBy(xpath="//button[@id='product-addtocart-button']")
    WebElement addToCartButton ;
    @CacheLookup
    @FindBy(xpath="//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement overnightDuffleAddedText ;
    @CacheLookup
    @FindBy(xpath="//a[@class='action showcart']")
    WebElement shoppingCartButton;
    @CacheLookup
    @FindBy(xpath="//span[normalize-space()='View and Edit Cart']")
    WebElement viewAndEditButton ;
    @CacheLookup
    @FindBy(xpath="//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement productOvernightDuffleText ;
    @CacheLookup
    @FindBy(xpath="//body[1]/div[1]/main[1]/div[3]/div[1]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/label[1]/input[1]")
    WebElement productQuantity ;
    @CacheLookup
    @FindBy(xpath="//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']")
    WebElement productPrice ;
    @CacheLookup
    @FindBy(xpath= "//span[normalize-space()='Update Shopping Cart']")
    WebElement updateShoppingCart ;
    @CacheLookup
    @FindBy(xpath="//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']")
    WebElement subTotalText ;
    public void mouseHoverOnGearMenu(){
        log.info("Mouse hover on Gear Menu   " + gear.toString());
        mouseHoverToElement(gear);

    }
    public void clickOnBags(){
        log.info("Click on Bags   :  "+ bags.toString());
        clickOnElement(bags);    }
    public void clickOnOvernightduffle(){
       log.info("Click on Overnight Duffle   :     "+overnightDuffle.toString());
       clickOnElement(overnightDuffle);
    }
    public String getActualOvernightDuffleText(){
       log.info("Get text OvernightDuffle   :"+ overnightDuffleText.toString());
       return getTextFromElement(overnightDuffleText);
    }
    public void changeQuantity(String qty){
       log.info("Change Quantity   : "+ changeQty.toString());
        clickOnElement(changeQty);
        clearTextFromField(changeQty);
        sendTextToElement(changeQty,qty);
    }
    public void clickOnAddToCartButton(){
       log.info("Click on AddToCart Button  :   "+addToCartButton.toString());
       clickOnElement(addToCartButton);
    }
    public String getOvernightDuffleAddedMessage(){
        log.info("Get OvernightDuffle added message   :  "+overnightDuffleAddedText.toString());
        return getTextFromElement(overnightDuffleAddedText);
    }
    public void clickOnShoppingCart(){
        log.info("Click on ShoppingCart   :" + shoppingCartButton.toString());
        mouseHoverToElementAndClick(shoppingCartButton);}
    public void clickOnViewAndEditButton(){
        clickOnElement(viewAndEditButton);
    }



    public String getProductNameOvernightDuffleText(){
        log.info("Get OvernightDuffle text");
        return getTextFromElement(productOvernightDuffleText);
    }
    public String getProductQuantity(){
       log.info("Get product quantity");
       return productQuantity.getAttribute("value");}
    public String getProductPrice(){
        log.info("Get Product Price");
        return getTextFromElement(productPrice);
    }
    public void changeProductQuantity(String qty){
        log.info("Change Product quantity");
        clearTextFromField(productQuantity);
        sendTextToElement(productQuantity,qty);
    }
    public void clickOnUpdateShoppingCartButton(){
        log.info("Click on Update Shopping Cart button");
        clickOnElement(updateShoppingCart);  }
    public String getSubtotalText(){
        return getTextFromElement(subTotalText);
    }
}
