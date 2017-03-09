package com.example.tt.step_definitions;

import com.example.tt.pages.CommonAppointmentPage;

import cucumber.api.java.en.Given;

public class CommonDefinitions {

    CommonAppointmentPage commonAppointmentPage;

    public CommonDefinitions(CommonAppointmentPage commonAppointmentPage) {
        this.commonAppointmentPage = commonAppointmentPage;
    }

    @Given("^user is navigated to url '(.*)'$")
    public void navigateToUrl(final String url) {
        commonAppointmentPage.openUrl(url);
    }
}
