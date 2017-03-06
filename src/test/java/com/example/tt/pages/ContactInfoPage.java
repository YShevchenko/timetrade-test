package com.example.tt.pages;

import org.openqa.selenium.By;

public class ContactInfoPage extends CommonAppointmentPage {

    private By firstName = By.id("attendee_person_firstName");
    private By lastName = By.id("attendee_person_lastName");
    private By email = By.id("attendee_email");

    public void setFirstName(final String firstNameValue) {
        scrollToElementAndType(firstName, firstNameValue);
    }

    public void setLastName(final String lastNameValue) {
        scrollToElementAndType(lastName, lastNameValue);
    }

    public void setEmail(final String emailValue) {
        scrollToElementAndType(email, emailValue);
    }
}
