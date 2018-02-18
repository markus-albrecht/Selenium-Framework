@createBooking
Feature: Create bookings
  As an employee of the hotel I want to be able to create bookings.
  So that guest can stay in the hotel

  Scenario: Create a successful booking
    Given I enter common first name
    And I enter common last name
    And I add a price of 100.00
    And they have a deposit type of paid
    And And a check-in value of today
    And And a check-in value of tomorrow
    When I click save
    Then the booking displays on the site
