package com.example.tt;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    @Before
    public void maximizeBrowser() {
        WebDriverManager.getDriver().manage().window().maximize();
    }

    @After
    public void closeBrowser() {
        WebDriverManager.getDriver().quit();
    }
}
