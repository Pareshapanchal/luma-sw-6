package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenPage extends Utility {
    private static final Logger log = LogManager.getLogger(WomenPage.class.getName());
    public WomenPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-4']//span[contains(text(),'Women')]")
    WebElement women;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']")
    WebElement tops;
    @CacheLookup
    @FindBy(xpath = "//a[@id ='ui-id-11']")
    WebElement jackets;
    @CacheLookup
    @FindBy(xpath = "//div[2]//div[3]//select[1]")
    WebElement sortBy;
    @CacheLookup
    @FindBys(@FindBy( xpath ="//ol[@class='products list items product-items']/li/div/div/strong/a"))
    List<WebElement> listOfProductsName;
    @CacheLookup
    @FindBys(@FindBy( xpath ="//ol[@class='products list items product-items']/li/div/div/div/span/span/span/span"))
    List<WebElement> listOfProductsPrice;

    public void mousehoverOnWomenMenu() {
        log.info("Mouse Hover On Women in the top Menu" );
        mouseHoverToElement(women);
    }
    public void mouseHoverOnTops() {
        log.info("Mouse hover on the Tops" );
        mouseHoverToElement(tops);
    }
    public void clickOnJackets() {
        log.info("Mouse hover on Jackets" );
        clickOnElement(jackets);
    }
    public List<String> getExpectedProductsSortedByProductName() {
        log.info("Get list of products" );
         List<String> list = getTheListOfElementFromTheList(listOfProductsName);
        Collections.sort(list);
        return list;
    }

    public List<String> getActualProductsSortedByProductName() {
       log.info("get actual products in sorted order" );

        List<String> list = getTheListOfElementFromTheList(listOfProductsName);
        return list;
    }
    public List<Double> getActualProductsSortedByProductPrice(){
        List<Double> actualpricelist = new ArrayList<Double>();
        for(int i=0; i<listOfProductsPrice.size(); i++){
            String s = listOfProductsPrice.get(i).getText().substring(1);
            double price = Double.parseDouble(s);
            actualpricelist.add(price);
        }
        return actualpricelist;

    }
    public List<Double> getExpectedProductsSortedByProductPrice(){
        List<Double> expectedpricelist = new ArrayList<Double>();
        for(int i=0; i<listOfProductsPrice.size(); i++){
            String s = listOfProductsPrice.get(i).getText().substring(1);
            double price = Double.parseDouble(s);
            expectedpricelist.add(price);

        }
        Collections.sort(expectedpricelist);
        return expectedpricelist;
    }

    public void sortProductsFromSortbyDropDown(String text) {
        log.info("get actual products in sorted order" );
        selectByVisibleTextFromDropDown(sortBy, text);
    }
}
