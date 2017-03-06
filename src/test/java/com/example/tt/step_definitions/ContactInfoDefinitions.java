package com.example.tt.step_definitions;

import java.util.List;

import com.example.tt.dto.ContactInfoDto;
import com.example.tt.steps.ContactInfoSteps;

import cucumber.api.java.en.When;

public class ContactInfoDefinitions {

    ContactInfoSteps contactInfoSteps;

    public ContactInfoDefinitions(final ContactInfoSteps contactInfoSteps) {
        this.contactInfoSteps = contactInfoSteps;
    }

    @When("^(?:user |)fills in following contact info:$")
    public void setContactInfo(final List<ContactInfoDto> contacts) {
        contactInfoSteps.setContactInfo(contacts.get(0));
    }
}
