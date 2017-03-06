Feature: Schedule an event

  Scenario: Schedule am event
    Given user is navigated to url 'https://nc1stage01.timetradesystems.com/app/app2devauto/workflows/automationqa/schedule'
    When user looks for locations near 'Boxborough, MA, United States'
    And selects location 'westford-test'
    And selects following parameters:
    | programType      | appointmentType | resource         |
    | 20th Century Fox | Alien           | Sigourney Weaver |
    And fills in following contact info:
    | firstName | lastName | email            |
    | John      | Densmore | user@example.com |
    And selects tomorrow date and '9:00 AM' time
    Then following appointment is scheduled:
    | programType      | appointmentType | resource         | firstName | lastName | email            |
    | 20th Century Fox | Alien           | Sigourney Weaver | John      | Densmore | user@example.com |