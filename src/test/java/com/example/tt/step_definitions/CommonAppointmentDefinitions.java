package com.example.tt.step_definitions;

import java.util.List;

import com.example.tt.dto.AppointmentDto;
import com.example.tt.steps.CommonAppointmentSteps;

import cucumber.api.java.en.When;

public class CommonAppointmentDefinitions {

    CommonAppointmentSteps commonAppointmentSteps;

    public CommonAppointmentDefinitions(CommonAppointmentSteps commonAppointmentSteps) {
        this.commonAppointmentSteps = commonAppointmentSteps;
    }

    @When("^(?:user |)selects following parameters:$")
    public void selectAppointmentParameters(final List<AppointmentDto> appointments) {
        commonAppointmentSteps.setAppointmentParameter(appointments.get(0).getProgramType());
        commonAppointmentSteps.setAppointmentParameter(appointments.get(0).getAppointmentType());
        commonAppointmentSteps.setAppointmentParameter(appointments.get(0).getResource());
    }
}
