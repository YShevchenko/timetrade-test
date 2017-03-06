package com.example.tt.step_definitions;

import com.example.tt.steps.GeneralSteps;
import cucumber.api.java.en.Given;

public class GeneralDefinitions {

    GeneralSteps generalSteps;

    public GeneralDefinitions(GeneralSteps generalSteps){
        this.generalSteps = generalSteps;
    }

    @Given("^user is navigated to url '(.*)'$")
    public void navigateToUrl(final String url){
        generalSteps.openUrl(url);
    }
}
