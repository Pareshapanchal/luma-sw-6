package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MenPage extends Utility {
    private static final Logger log = LogManager.getLogger(MenPage.class.getName());
    public MenPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-5']")
    WebElement men;
    @CacheLookup
    @FindBy(xpath= "//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]")
    WebElement bottom ;
    @CacheLookup
    @FindBy(xpath= "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pants  ;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]")
    WebElement cronusYogaPant;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
    WebElement size32;
    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']")
    WebElement colourBlack ;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath="//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement addedShoppingCartText;
    @CacheLookup
    @FindBy(xpath="//a[@class='action showcart']")
    WebElement shoppingCartLink;
    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement shoppingCartText;
    @CacheLookup
    @FindBy(xpath= "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement productName;
    @CacheLookup
    @FindBy(xpath="//dd[contains(text(),'32')]")
    WebElement productSize ;
    @CacheLookup
    @FindBy(xpath= "//dd[contains(text(),'Black')]")
    WebElement productColour;
    @CacheLookup
    @FindBy(xpath="//span[normalize-space()='View and Edit Cart']")
    WebElement viewAndEditCart ;
    public void mouseHoverOnMenMenu(){
        log.info("Mouse hover on Men from the top Menu " + men.getText());
        mouseHoverToElement(men);
    }
    public void mouseHoverOnBottoms()
    {   log.info("Mouse hover on Bottoms option " +bottom.getText());
        mouseHoverToElement(bottom);
    }
    public void clickOnPants(){
        log.info("Click on Pants option" +pants.getText());
        clickOnElement(pants);
    }
    public void mouseHoverOnCronusYogaPant(){
        log.info("Mouse hover on Cronus Yoga Pant");
        mouseHoverToElement(cronusYogaPant);
    }
    public void clickOnSize32(){
        log.info(" click on Size32()" +size32.getText());
        mouseHoverToElementAndClick(size32);
    }
    public void clickOnColourBlack(){
        log.info("Click on colour Black" +colourBlack.getText());
        mouseHoverToElementAndClick(colourBlack);
    }
    public void clickOnAddToCartButton(){
        log.info(" click on AddToCart button"+addToCart.getText());
        mouseHoverToElementAndClick(addToCart);
    }

    public String getActualYouAddedCronusYogaPantToYourShoppingCartMessage(){
        log.info("Get Add CronusYogaPant added message "+addedShoppingCartText.getText());
        return getTextFromElement(addedShoppingCartText);
    }
    public void clickOnShoppingCartLink(){
        log.info("Click on Shopping Cart Link "+shoppingCartLink.getText());
        mouseHoverToElementAndClick(shoppingCartLink);
        clickOnViewAndEditCart();
    }
    public String getShoppingCartText(){
        log.info("Get Shopping Cart text "+shoppingCartText.getText());
        return getTextFromElement(shoppingCartText);
    }
    public String getActualProductName(){
        log.info("Get actual product name "+productName.getText());
        return getTextFromElement(productName);
    }
    public String getActualProductSize(){
        log.info("Get actual product size "+productSize.getText());
        return getTextFromElement(productSize);
    }
    public String getActualProductColour(){
        log.info("Get actual product colour "+productColour.getText());
        return getTextFromElement(productColour);
    }
    public void clickOnViewAndEditCart(){
        log.info("Click on ViewAndEdit cart "+ viewAndEditCart.getText());
        mouseHoverToElementAndClick(viewAndEditCart);
    }
    public void verifyYouaddedCronusYogaPantToYourShoppingCart(){
        // * Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
        log.info("Verify \"You added Cronus Yoga Pant to your shopping cart.\"");
        String expectedCronusYogaPantAddedMessage ="You added Cronus Yoga Pant to your shopping cart.";
        String actualCronusYogaPantAddedMessage = getActualYouAddedCronusYogaPantToYourShoppingCartMessage();
        Assert.assertEquals(actualCronusYogaPantAddedMessage,expectedCronusYogaPantAddedMessage,"Not Match");
    }

    public void verifyShoppingCartText(){
        log.info("Verify : \"Shopping Cart\"");
        // verify the text ‘Shopping Cart.’

        String expectedShoppingCartText = "Shopping Cart";
        String actualShoppingCartText = getShoppingCartText();
        Assert.assertEquals(actualShoppingCartText,expectedShoppingCartText,"Not Match");
    }
    public void verifyTheProductNameCronusYogaPant(){
        // * Verify the product name ‘Cronus Yoga Pant’
        log.info("Verify : \"Cronus Yoga Pant\"");
        String expectedProductName ="Cronus Yoga Pant";
        String actualProductName =getActualProductName();
        Assert.assertEquals(actualProductName,expectedProductName,"Not Match");
    }
    public void verifyTheProductSize32(){
        log.info("Verify the product size ‘32’");
        // * Verify the product size ‘32’
        String expectedProductSize="32";
        String actualProductSize = getActualProductSize();
        Assert.assertEquals(actualProductSize,expectedProductSize,"Not Match");
    }

        public void verifyTheProductColourBlack(){
                log.info("Verify the product colour ‘Black’");
            // * Verify the product colour ‘Black’
            String expectedProductColour="Black";
            String actualProductColour = getActualProductColour();
            Assert.assertEquals(actualProductColour,expectedProductColour,"Not match");
        }
}
