package com.tutorialninja.testbase;

import com.tutorialninja.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {

    String browser = "chrome";
    @BeforeMethod
    public  void setup(){
        selectBrowser(browser);
    }
    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }

    public void clickOnLaptop() {
    }

    public void clickOnShowAllLaptopsAndNoteBooks() {
    }

    public void selectSortByPriceHighToLow() {
    }

    public void selectCurrencyTab() {
    }

    public void changeCurrencyToSterling() {
    }

    public void selectProductMacBook() {
    }

    public
    String verifyTextMacBook() {
        return null;
    }
}
