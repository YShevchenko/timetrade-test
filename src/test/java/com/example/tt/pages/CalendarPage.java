package com.example.tt.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CalendarPage extends CommonAppointmentPage {

    private static final String SELECT_TIME_XPATH = "//td[@id='%s']//select";

    public void setDateAndEarliestTime(final String date) {
        By selectTime = By.xpath(String.format(SELECT_TIME_XPATH, date));
        waitForElementPresent(selectTime);
        Select timeSelect = new Select(getDriver().findElement(selectTime));
        timeSelect.selectByIndex(1);
    }
}
