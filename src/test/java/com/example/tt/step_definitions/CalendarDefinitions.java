package com.example.tt.step_definitions;

import java.time.LocalDate;

import com.example.tt.steps.CalendarSteps;

import cucumber.api.java.en.When;

public class CalendarDefinitions {

    private CalendarSteps calendarSteps;

    public CalendarDefinitions(final CalendarSteps calendarSteps) {
        this.calendarSteps = calendarSteps;
    }

    @When("^(?:user |)selects tomorrow date and earliest time$")
    public void selectDateTime() {
        final String tomorrow = LocalDate.now().plusDays(1).toString();
        calendarSteps.selectAppointmentDate(tomorrow);
    }
}
