package com.example.tt.steps;

import com.example.tt.pages.CommonAppointmentPage;

public class CommonAppointmentSteps {

    private CommonAppointmentPage commonAppointmentPage;

    public CommonAppointmentSteps(CommonAppointmentPage commonAppointmentPage){
        this.commonAppointmentPage = commonAppointmentPage;
    }

    public void setAppointmentParameter(final String parameterValue) {
        commonAppointmentPage.setAppointmentParameter(parameterValue);
        commonAppointmentPage.clickNextButton();
    }
}
