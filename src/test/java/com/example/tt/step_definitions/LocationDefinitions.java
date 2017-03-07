package com.example.tt.step_definitions;

import com.example.tt.steps.CommonAppointmentSteps;
import com.example.tt.steps.LocationSteps;

import cucumber.api.java.en.When;

public class LocationDefinitions {

    private LocationSteps locationSteps;
    private CommonAppointmentSteps commonAppointmentSteps;

    public LocationDefinitions(CommonAppointmentSteps commonAppointmentSteps, LocationSteps locationSteps) {
        this.locationSteps = locationSteps;
        this.commonAppointmentSteps = commonAppointmentSteps;
    }

    @When("^(?:user |)looks for locations near '(.*)'$")
    public void searchNearLocation(final String location) {
        locationSteps.searchLocation(location);
    }

    @When("^(?:user |)selects location '(.*)'$")
    public void selectLocation(final String location) {
        commonAppointmentSteps.setAppointmentParameter(location);
    }

}
