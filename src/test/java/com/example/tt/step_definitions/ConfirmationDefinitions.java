package com.example.tt.step_definitions;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import com.example.tt.dto.AppointmentDto;
import com.example.tt.dto.ContactInfoDto;
import com.example.tt.pages.ConfirmationPage;
import com.example.tt.util.BeanUtilHelper;

import cucumber.api.Transpose;
import cucumber.api.java.en.Then;

public class ConfirmationDefinitions {

    ConfirmationPage confirmationPage;

    public ConfirmationDefinitions(final ConfirmationPage confirmationPage) {
        this.confirmationPage = confirmationPage;
    }

    @Then("^following appointment is scheduled:$")
    public void verifyAppointmentParameters(@Transpose final List<AppointmentDto> appointments) {
        final AppointmentDto expectedAppointmentDetails = appointments.get(0);
        final AppointmentDto actualAppointmentDetails = new AppointmentDto();
        BeanUtilHelper.copyProperties(actualAppointmentDetails, confirmationPage, "Failed to get appointment details");
        assertThat(actualAppointmentDetails).as("Appointment details differs from expected")
                .isEqualToIgnoringNullFields(expectedAppointmentDetails);
    }

    @Then("^following contact information is saved:$")
    public void verifyContactInfo(final List<ContactInfoDto> contacts) {
        final ContactInfoDto expectedContactDetails = contacts.get(0);
        final ContactInfoDto actualContactDetails = new ContactInfoDto();
        BeanUtilHelper.copyProperties(actualContactDetails, confirmationPage, "Failed to get contact details");
        assertThat(actualContactDetails).as("Contact info differs from expected")
                .isEqualToIgnoringNullFields(expectedContactDetails);
    }
}
