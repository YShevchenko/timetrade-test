package com.example.tt.step_definitions;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import com.example.tt.dto.AppointmentDto;
import com.example.tt.dto.ContactInfoDto;
import com.example.tt.steps.ConfirmationSteps;

import cucumber.api.Transpose;
import cucumber.api.java.en.Then;

public class ConfirmationDefinitions {

    ConfirmationSteps confirmationSteps;

    public ConfirmationDefinitions(final ConfirmationSteps confirmationSteps) {
        this.confirmationSteps = confirmationSteps;
    }

    @Then("^following appointment is scheduled:$")
    public void verifyAppointmentParameters(@Transpose final List<AppointmentDto> appointments) {
        final AppointmentDto expectedAppointmentDetails = appointments.get(0);
        final AppointmentDto actualAppointmentDetails = confirmationSteps.getAppointmentDetails();
        assertThat(actualAppointmentDetails).as("Appointment details differs from expected")
                .isEqualToIgnoringNullFields(expectedAppointmentDetails);
    }

    @Then("^following contact information is saved:$")
    public void verifyContactInfo(final List<ContactInfoDto> contacts) {
        final ContactInfoDto expectedContactDetails = contacts.get(0);
        final ContactInfoDto actualContactDetails = confirmationSteps.getContactDetails();
        assertThat(actualContactDetails).as("Contact info differs from expected")
                .isEqualToIgnoringNullFields(expectedContactDetails);
    }
}
