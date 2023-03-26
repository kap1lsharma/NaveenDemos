
@All
Feature: Uber booking feature.

@smoke
  Scenario: Booking Cab Sedan
    Given User wants to select a car type "Sedan" from uber application
    When User selects car "sedan" and pick point "Bangalore" and drop location "Pune"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1000 USD

@Regression @smoke
  Scenario: Booking Cab suv
    Given User wants to select a car type "SUV" from uber application
    When User selects car "SUV" and pick point "Bangalore" and drop location "Hydrabad"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1000 USD

@Prod
  Scenario: Booking Cab mini
    Given User wants to select a car type "mini" from uber application
    When User selects car "mini" and pick point "Pune" and drop location "Mumbai"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1000 USD
