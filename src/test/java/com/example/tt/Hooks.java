package com.example.tt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    private static WebDriver driver;

    @Before
    public void maximizeBrowser() {
        getDriver().manage().window().maximize();
    }

    @After
    public void closeBrowser() {
        getDriver().quit();
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }
}
