package com.example.tt.step_definitions;

import com.example.tt.pages.LocationPage;

import cucumber.api.java.en.When;

public class LocationDefinitions {

    private LocationPage locationPage;

    public LocationDefinitions(LocationPage locationPage) {
        this.locationPage = locationPage;
    }

    @When("^(?:user |)looks for locations near '(.*)'$")
    public void searchNearLocation(final String location) {
        locationPage.setSearchLocationInput(location);
    }

    @When("^(?:user |)selects location '(.*)'$")
    public void selectLocation(final String location) {
        locationPage.setParameterAndNext(location);
    }

}
