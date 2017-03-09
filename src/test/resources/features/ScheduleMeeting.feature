Feature: Schedule an appointment

  Scenario: Schedule an appointment
    Given user is navigated to url 'https://nc1stage01.timetradesystems.com/app/app2devauto/workflows/automationqa/schedule'
    When user looks for locations near 'Boxborough, MA, United States'
    And selects location 'westford-test'
    And selects following parameters:
    | programType      | appointmentType | resource         |
    | 20th Century Fox | Alien           | Sigourney Weaver |
    And fills in following contact info:
    | firstName | lastName | email            |
    | John      | Densmore | user@example.com |
    And selects tomorrow date and earliest time
    Then following appointment is scheduled:
    | location          | westford-test    |
    | appointmentType   | Alien            |
    | programType       | 20th Century Fox |
    | resource          | Sigourney Weaver |
    And following contact information is saved:
    | firstName | lastName | email            |
    | John      | Densmore | user@example.com |