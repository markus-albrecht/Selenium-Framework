@deleteBooking
Feature: Delete bookings
  As an employee of the hotel I want to be able to delete bookings.
  So that guests are no longer booked in at the hotel.

  Scenario:
    Given I delete a hotel booking
    Then the booking no longer displays on the site