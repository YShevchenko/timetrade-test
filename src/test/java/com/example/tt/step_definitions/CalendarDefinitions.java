package com.example.tt.step_definitions;

import java.time.LocalDate;

import com.example.tt.pages.CalendarPage;

import cucumber.api.java.en.When;

public class CalendarDefinitions {

    private CalendarPage calendarPage;

    public CalendarDefinitions(final CalendarPage calendarPage) {
        this.calendarPage = calendarPage;
    }

    @When("^(?:user |)selects tomorrow date and earliest time$")
    public void selectDateTime() {
        final String tomorrow = LocalDate.now().plusDays(1).toString();
        calendarPage.setDateAndEarliestTime(tomorrow);
        calendarPage.clickNextButton();
    }
}
