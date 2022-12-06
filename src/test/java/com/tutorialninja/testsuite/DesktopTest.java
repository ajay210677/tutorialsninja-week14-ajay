package com.tutorialninja.testsuite;

import com.tutorialninja.browserfactory.Desktop;
import com.tutorialninja.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DesktopTest extends BaseTest {
    Desktop desktop = new Desktop();

    @Test
    public void verfiyThatUserShouldNavigateToDesktopPageSuccessfully(){
        desktop.clickOnDesktop();
        desktop.clickOnShowAllDesktopMenu();
        desktop.getDesktopText();


    }
}
