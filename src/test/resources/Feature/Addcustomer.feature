#Author: NaveenKumar15

Feature: To test addcustomer

Scenario: Add Customer scenario
    Given The user is in add customer page
    When The user fill in the Customer details
    And The user clicks the submit button
    Then The user should see the success message
    And The user should see the customer ID
