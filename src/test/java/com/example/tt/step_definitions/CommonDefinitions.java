package com.example.tt.step_definitions;

import com.example.tt.steps.CommonSteps;

import cucumber.api.java.en.Given;

public class CommonDefinitions {

    CommonSteps commonSteps;

    public CommonDefinitions(CommonSteps commonSteps) {
        this.commonSteps = commonSteps;
    }

    @Given("^user is navigated to url '(.*)'$")
    public void navigateToUrl(final String url) {
        commonSteps.openUrl(url);
    }
}
