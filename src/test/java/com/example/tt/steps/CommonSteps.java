package com.example.tt.steps;

import com.example.tt.pages.CommonAppointmentPage;

public class CommonSteps {

    private CommonAppointmentPage commonAppointmentPage;

    public CommonSteps(final CommonAppointmentPage commonAppointmentPage) {
        this.commonAppointmentPage = commonAppointmentPage;
    }

    public void openUrl(final String url) {
        commonAppointmentPage.open(url);
    }
}
