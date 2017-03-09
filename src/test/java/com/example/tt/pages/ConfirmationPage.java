package com.example.tt.pages;

import org.openqa.selenium.By;

public class ConfirmationPage extends AbstractPage {

    private By location = By.xpath("//table[@id='location']//td[text()]");
    private By programType = By.xpath("//table[@id='appointment-type-group']//td[text()]");
    private By appointmentType = By.xpath(".//table[@id='appointment-type']//td[text()]");
    private By resource = By.xpath("//table[@id='resource']//li[text()]");
    private By name = By.xpath("//table[@id='attendee']//ul[@class='list']/li[1]");
    private By email = By.xpath("//table[@id='attendee']//ul[@class='list']/li[2]");

    public String getLocation() {
        return getElementText(location).substring(0, getElementText(location).indexOf("\n"));
    }

    public String getProgramType() {
        return getElementText(programType);
    }

    public String getAppointmentType() {
        return getElementText(appointmentType);
    }

    public String getResource() {
        return getElementText(resource);
    }

    public String getFirstName() {
        String fullName = getElementText(name);
        return fullName.substring(0, fullName.indexOf(" "));
    }

    public String getLastName() {
        String fullName = getElementText(name);
        return fullName.substring(fullName.indexOf(" ") + 1);
    }

    public String getEmail() {
        return getElementText(email);
    }
}
