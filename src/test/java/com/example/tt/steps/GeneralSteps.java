package com.example.tt.steps;

import com.example.tt.pages.CommonAppointmentPage;
import com.example.tt.pages.LocationPage;

public class GeneralSteps {

    private CommonAppointmentPage commonAppointmentPage;

    public GeneralSteps(final CommonAppointmentPage commonAppointmentPage){
        this.commonAppointmentPage = commonAppointmentPage;
    }

    public void openUrl(final String url) {
        commonAppointmentPage.open(url);
    }
}
