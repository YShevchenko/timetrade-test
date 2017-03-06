package com.example.tt.steps;

import com.example.tt.pages.CalendarPage;

public class CalendarSteps {

    private CalendarPage calendarPage;

    public CalendarSteps (final CalendarPage calendarPage) {
        this.calendarPage = calendarPage;
    }

    public void selectAppointmentDateTime(final String date, final String time) {
        calendarPage.setDateTime(date, time);
        calendarPage.clickNextButton();
    }

}
