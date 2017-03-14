package com.example.tt.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.example.tt.WebDriverManager;

public abstract class AbstractPage {

    private static final Long TIMEOUT = 30L;

    public void openUrl(final String url) {
        getDriver().get(url);
    }

    protected void waitForElementPresent(final By locator) {
        new WebDriverWait(getDriver(), TIMEOUT).until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    protected void waitForElementValueNotEmpty(final By locator) {
        waitForElementPresent(locator);
        new WebDriverWait(getDriver(), TIMEOUT).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver wd) {
                return getDriver().findElement(locator).getAttribute("value").length() != 0;
            }
        });
    }

    protected void scrollToElementAndType(final By locator, final String text) {
        waitForElementPresent(locator);
        Actions actions = new Actions(getDriver());
        actions.moveToElement(getDriver().findElement(locator)).click().sendKeys(text).build().perform();
    }

    protected String getElementText(final By locator) {
        waitForElementPresent(locator);
        return getDriver().findElement(locator).getText().trim();
    }

    protected WebDriver getDriver() {
        return WebDriverManager.getDriver();
    }
}
