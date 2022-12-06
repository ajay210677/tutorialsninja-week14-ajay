package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By desktop = By.xpath("//a[normalize-space()='Desktops']");
    By lapTopAndNotebooks = By.xpath("//a[@class='dropdown-toggle'][normalize-space()='Laptops & Notebooks']");
    By components = By.xpath("//a[text() = 'Components']");
    By tablets = By.xpath("//a[contains(text(),'Tablets')]");
    By software = By.xpath("//a[text() = 'Software']");
    By phoneAndPads = By.xpath("//a[text() = 'Phones & PDAs']");
    By camera = By.xpath("//a[text() = 'Cameras']");
    By Mp3Players = By.xpath("//a[text() = 'MP3 Players']");

    public void clickOnDesktopTab() throws InterruptedException{
        clickOnElement(desktop);
    }
    public void lapTopAndNotebooksTab () throws InterruptedException{
        clickOnElement(lapTopAndNotebooks);
    }
   public void clickOnComponentsTab() throws InterruptedException{
        clickOnElement(components);
    }

}
