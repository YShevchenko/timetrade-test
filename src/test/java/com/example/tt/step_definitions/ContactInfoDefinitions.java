package com.example.tt.step_definitions;

import java.util.List;

import com.example.tt.dto.ContactInfoDto;
import com.example.tt.pages.ContactInfoPage;
import com.example.tt.util.BeanUtilHelper;

import cucumber.api.java.en.When;

public class ContactInfoDefinitions {

    ContactInfoPage contactInfoPage;

    public ContactInfoDefinitions(final ContactInfoPage contactInfoPage) {
        this.contactInfoPage = contactInfoPage;
    }

    @When("^(?:user |)fills in following contact info:$")
    public void setContactInfo(final List<ContactInfoDto> contacts) {
        BeanUtilHelper.copyProperties(contactInfoPage, contacts.get(0), "Failed to fill in contact info");
        contactInfoPage.clickNextButton();
    }
}
