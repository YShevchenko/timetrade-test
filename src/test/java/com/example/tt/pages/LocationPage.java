package com.example.tt.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class LocationPage extends CommonAppointmentPage {

    private By searchLocationInput = By.id("location");

    public void setSearchLocationInput(final String locationSearchText) {
        waitForElementValueNotEmpty(searchLocationInput);
        WebElement searchLocation = getDriver().findElement(searchLocationInput);
        searchLocation.clear();
        searchLocation.sendKeys(locationSearchText);
        searchLocation.sendKeys(Keys.TAB);
    }

}
