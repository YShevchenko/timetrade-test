package com.example.tt.pages;

import org.openqa.selenium.By;

public class CommonAppointmentPage extends AbstractPage {

    private static final String PARAMETERS_XPATH = "//div[@class='labelNode'][contains(text(),'%s')]";
    private By nextButton = By.id("nextBtn");

    public void setAppointmentParameter(final String parameterText) {
        final String parameterXpath = String.format(PARAMETERS_XPATH, parameterText);
        waitForElementPresent(By.xpath(parameterXpath));
        getDriver().findElement(By.xpath(parameterXpath)).click();
    }

    public void clickNextButton() {
        getDriver().findElement(nextButton).click();
    }
}
