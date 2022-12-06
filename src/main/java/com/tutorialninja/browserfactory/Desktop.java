package com.tutorialninja.browserfactory;

import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;

public class Desktop extends Utility {
    By desktop = (By.linkText("Desktops"));
    By showAllDesktop=(By.xpath("//a[contains(text(),'Show All Desktops')]"));
    By DesktopText = By.xpath("//h2[contains(text(),'Desktops')]\");");

    public void clickOnDesktop(){
        clickOnElement(desktop);
    }
    public void clickOnShowAllDesktopMenu(){
        clickOnElement(showAllDesktop);
    }
    public String getDeskTopText(){
        return getTextFromElement(desktop);
    }
}
