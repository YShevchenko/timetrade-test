package com.example.tt.steps;

import com.example.tt.dto.AppointmentDto;
import com.example.tt.dto.ContactInfoDto;
import com.example.tt.pages.ConfirmationPage;
import com.example.tt.util.BeanUtilHelper;

public class ConfirmationSteps {

    private ConfirmationPage confirmationPage;

    public ConfirmationSteps(final ConfirmationPage confirmationPage) {
        this.confirmationPage = confirmationPage;
    }

    public AppointmentDto getAppointmentDetails() {
        AppointmentDto appointment = new AppointmentDto();
        BeanUtilHelper.copyProperties(appointment, confirmationPage, "Failed to get appointment details");
        return appointment;
    }

    public ContactInfoDto getContactDetails() {
        ContactInfoDto contact = new ContactInfoDto();
        BeanUtilHelper.copyProperties(contact, confirmationPage, "Failed to get contact details");
        return contact;
    }

}
