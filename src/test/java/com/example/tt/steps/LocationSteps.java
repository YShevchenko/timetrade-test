package com.example.tt.steps;

import com.example.tt.pages.LocationPage;

public class LocationSteps {

    private LocationPage locationPage;

    public LocationSteps(final LocationPage locationPage) {
        this.locationPage = locationPage;
    }

    public void searchLocation(final String location){
        locationPage.setSearchLocationInput(location);
    }

}
