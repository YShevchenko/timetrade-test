package com.example.tt.step_definitions;

import java.util.List;

import com.example.tt.dto.AppointmentDto;
import com.example.tt.pages.CommonAppointmentPage;

import cucumber.api.java.en.When;

public class CommonAppointmentDefinitions {

    CommonAppointmentPage commonAppointmentPage;

    public CommonAppointmentDefinitions(CommonAppointmentPage commonAppointmentPage) {
        this.commonAppointmentPage = commonAppointmentPage;
    }

    @When("^(?:user |)selects following parameters:$")
    public void selectAppointmentParameters(final List<AppointmentDto> appointments) {
        commonAppointmentPage.setParameterAndNext(appointments.get(0).getProgramType());
        commonAppointmentPage.setParameterAndNext(appointments.get(0).getAppointmentType());
        commonAppointmentPage.setParameterAndNext(appointments.get(0).getResource());
    }
}
