package com.example.tt.steps;

import com.example.tt.util.BeanUtilHelper;
import com.example.tt.dto.ContactInfoDto;
import com.example.tt.pages.ContactInfoPage;

public class ContactInfoSteps {

    private ContactInfoPage contactInfoPage;

    public ContactInfoSteps(final ContactInfoPage contactInfoPage) {
        this.contactInfoPage = contactInfoPage;
    }

    public void setContactInfo(ContactInfoDto contactInfo) {
        BeanUtilHelper.copyProperties(contactInfoPage, contactInfo, "Failed to fill in contact info");
        contactInfoPage.clickNextButton();
    }
}
