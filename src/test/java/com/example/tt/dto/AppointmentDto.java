package com.example.tt.dto;

public class AppointmentDto {

    private String programType;
    private String appointmentType;
    private String resource;
    private String location;

    public String getProgramType() {
        return programType;
    }

    public void setProgramType(final String programType) {
        this.programType = programType;
    }

    public String getAppointmentType() {
        return appointmentType;
    }

    public void setAppointmentType(final String appointmentType) {
        this.appointmentType = appointmentType;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(final String resource) {
        this.resource = resource;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(final String location) {
        this.location = location;
    }
}
