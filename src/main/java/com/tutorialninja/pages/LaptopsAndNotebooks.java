package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopsAndNotebooks extends Utility {

    By checkoutButton = By.xpath("//a[contains(text(),'Checkout')]");
    By checkoutText = By.xpath("//h1[contains(text(),'Checkout')]");
    By newCustomerText = By.xpath("//h2[contains(text(),'New Customer')]");
    By guestCheckoutRadio = By.xpath("//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/input[1]");
    By continueTab = By.id("button-account");
    By firstnameField = By.name("firstname");
    By lastnameField = By.name("lastname");
    By emailField = By.name("email");
    By telephoneField = By.name("telephone");
    By addressField = By.name("address_1");
    By city = By.name("city");
    By postcode = By.name("postcode");
    By dropdownMenuCountry = By.xpath("//select[@id='input-payment-country']");
    By dropdownMenuRegionState = By.xpath("//select[@id='input-payment-zone']");
    By continueButton = By.id("button-register");
    By passwordField = By.name("password");
    By passwordConfirmField = By.name("confirm");
    By commentArea = By.xpath("//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/p[2]/textarea[1]");
    By termsAndConditionCheckbox = By.name("comment");
    By continueButton2 = By.id("button-payment-method");
    By warningPaymentMethod = By.xpath("//div[text()='Warning: Payment method required!']");
    public void selectSortBy(String text) {
        selectByVisibleTextFromDropDown(sortBy, text);
    }
    public void selectFilterAndVerifyRequirement() {
        List<WebElement> beforeSortList = driver.findElements(By.xpath("//p[@class ='price']"));
        List<Double> beforeSortBy = new ArrayList<>();
        for (WebElement e : beforeSortList) {
            //System.out.println((e.getText()));
            String[] arr = e.getText().split("Ex Tax:");
            beforeSortBy.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(beforeSortBy);
        //Sortby reverse order
        Collections.sort(beforeSortBy, Collections.reverseOrder());
        System.out.println(beforeSortBy);
        //Select SortBy filter (Price High > Low)
        selectSortBy("Price (High > Low)");
        List<WebElement> afterSortList = driver.findElements(By.xpath("//p[@class ='price']"));
        ArrayList<Double> afterSortBy = new ArrayList<>();
        for (WebElement e : afterSortList) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortBy.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(afterSortBy);
        Assert.assertEquals(beforeSortBy, afterSortBy, "SortBy filter not working");
    }
    public void continueToFillForm() {
        clickOnElement(checkoutButton);
        Assert.assertEquals(getTextFromElement(checkoutText),"Checkout","Not on checkout Page");
        Assert.assertEquals(getTextFromElement(newCustomerText),"New Customer","Not on checkout Page");
        clickOnElement(guestCheckoutRadio);
        clickOnElement(continueTab);
    }
    public void formFilling() {
        sendTextToElement(firstnameField, "Abc");
        sendTextToElement(lastnameField, "Xyz");
        sendTextToElement(emailField, "test123@gmail.com");
        sendTextToElement(telephoneField, "0987654321");
        sendTextToElement(addressField, "10 London Bridge");
        sendTextToElement(city, "Westminster");
        sendTextToElement(postcode, "EC1B 2JL");
        selectByVisibleTextFromDropDown(dropdownMenuCountry, "United Kingdom");
        selectByVisibleTextFromDropDown(dropdownMenuRegionState, "London");
        sendTextToElement(passwordField, "test123");
        sendTextToElement(passwordConfirmField, "test123");
        clickOnElement(continueButton);
        sendTextToElement(commentArea, "Hello");
        clickOnElement(termsAndConditionCheckbox);
        clickOnElement(continueButton2);
        Assert.assertEquals(warningPaymentMethod, "Warning: Payment method required!", "No warning message is shown.");
    }
    By laptop = By.linkText("Laptops & Notebooks");
    By showAllLaptopsAndNotebooks = By.linkText("Show All Laptops & Notebooks");
    By productsPrice = By.xpath("//p[@class ='price']");
    By currencyTab = By.xpath("//span[contains(text(),'Currency')]");
    By currencyList1 = By.xpath("//ul[@class = 'dropdown-menu']/li");
    By sortBy = By.id("input-sort");
    By MacBook = By.linkText("MacBook");
    By MacBookText = By.xpath("//h1[contains(text(),'MacBook')]");
    By cartTab = By.xpath("//button[@id='button-cart']");
    By shoppingCartMsg = By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible");
    By shoppingcartLink = By.xpath("//a[contains(text(),'shopping cart')]");
    By getShoppingCartMsg = By.xpath("//div[@id='content']//h1");
    By macBookVerification = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    By quantity = By.xpath("//input[contains(@name, 'quantity')]");
    By updateTab = By.xpath("//button[contains(@data-original-title, 'Update')]");
    By modifiedShoppingCartMessage = By.xpath("//div[@id='checkout-cart']/div[1]");
    By checkOutButton = By.xpath("//a[@class='btn btn-primary']");
    By total = By.xpath("//div[@class='table-responsive']/table/tbody/tr/td[6]");
    By checkOutText = By.xpath("//h1[normalize-space()='Checkout']");
    By newCustomer = By.xpath("//div[@class='col-sm-6']/h2[normalize-space()='New Customer']");
    By guestCheckout = By.xpath("//input[@value='guest']");
    By continueTab = By.id("button-account");
    By continueButton = By.id("button-guest");
    By firstName = By.xpath("//input[@id='input-payment-firstname']");
    By lastName = By.xpath("//input[@id='input-payment-lastname']");
    By emailField = By.xpath("//input[@id='input-payment-email']");
    By telephone = By.xpath("//input[@id='input-payment-telephone']");
    By paymentAddress = By.xpath("//input[@id='input-payment-address-1']");
    By paymentCity = By.xpath("//input[@id='input-payment-city']");
    By paymentPostCode = By.xpath("//input[@id='input-payment-postcode']");
    By paymentCountry = By.xpath("//select[@id='input-payment-country']");
    By paymentZone = By.xpath("//select[@id='input-payment-zone']");
    By comments = By.xpath("//textarea[@name='comment']");
    By termsAndConditions = By.name("agree");
    By continueTab1 = By.id("button-payment-method");
    By warningMessage = By.xpath("//div[@class='alert alert-danger alert-dismissible']");


    public void clickOnLaptop() {
        mouseHoverToElementAndClick(laptop);

    }

    public void clickOnShowAllLaptopsAndNoteBooks() {
        clickOnElement(showAllLaptopsAndNotebooks);
    }

    public void selectSortByPriceHighToLow() {
        // Get all the products price and stored into array list
        List<WebElement> products = driver.findElements(productsPrice);
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        // Sort By Reverse order
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        // Select sort by Price (High > Low)
        selectByVisibleTextFromDropDown(By.id("input-sort"), "Price (High > Low)");
        // After filter Price (High > Low) Get all the products name and stored into array list
        products = driver.findElements(productsPrice);
        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        Assert.assertEquals(afterSortByPrice,originalProductsPrice);
    }


    public void selectCurrencyTab() {

        clickOnElement(currencyTab);
    }

    public void changeCurrencyToSterling() {
        List<WebElement> currencyList = driver.findElements(currencyList1);
        for (WebElement e : currencyList) {
            if (e.getText().equalsIgnoreCase("£ Pound Sterling")) {
                e.click();
                break;
            }
        }
    }

    public void selectProductMacBook() {
        clickOnElement(MacBook);
    }

    public String verifyTextMacBook() {
        return getTextFromElement(MacBookText);
    }

    public void clickOnAddToCart() {
        clickOnElement(cartTab);
    }

    public String shoppingCartMessage() {
        return getTextFromElement(shoppingCartMsg);
    }

    public void clickOnShoppingCart() {
        clickOnElement(shoppingcartLink);
    }

    public String verifyShoppingCartText() {
        return getTextFromElement(getShoppingCartMsg);
    }

    public String verifyProductNameMacBook() {
        return getTextFromElement(macBookVerification);
    }

    public void enterQuantity(String qty) {
        sendTextToElement(quantity, qty);
    }

    public void clickOnUpdateTab() {
        clickOnElement(updateTab);
    }

    public String modifyShoppingCartMessage() {
        return getTextFromElement(modifiedShoppingCartMessage);
    }

    public String verifyTotal() {

        return getTextFromElement(total);
    }

    public void clickOnCheckout() {
        clickOnElement(checkoutButton);
    }

    public String verifyCheckoutText() {
        return getTextFromElement(checkoutText);
    }

    public String verifyNewCustomer() {
        return getTextFromElement(newCustomer);
    }

    public void clickOnGuestCheckOut() {
        clickOnElement(guestCheckout);
    }

    public void clickOnContinueButton() {
        clickOnElement(continueTab);
    }

    public void clickOnContinue() {
        clickOnElement(continueButton);
    }

    public void addComments(String text) {
        sendTextToElement(comments, text);
    }

    public void clickonTermsAndConditions() {
        clickOnElement(termsAndConditions);
    }

    public void clickOnContinueTab() {
        clickOnElement(continueTab1);
    }

    public String paymentWarningMessage() {
        return getTextFromElement(warningMessage);
    }

    public void enterFirstName(String firstname) {
        sendTextToElement(firstName, firstname);
    }

    public void enterLastName(String lastname) {
        sendTextToElement(lastName, lastname);
    }

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterAddress1(String address1) {
        sendTextToElement(paymentAddress, address1);
    }

    public void enterTelephone(String number) {
        sendTextToElement(telephone, number);
    }

    public void enterCity(String cityname) {
        sendTextToElement(paymentCity, cityname);
    }

    public void enterPostcode(String postcode) {
        sendTextToElement(paymentPostCode, postcode);
    }

    public void selectCountry() {
        selectByVisibleTextFromDropDown(paymentCountry,"United Kingdom");
    }

    public void selectRegion(){
        selectByVisibleTextFromDropDown(paymentZone,"Aberdeen");
    }
}
