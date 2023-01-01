@wip
Feature: Pay Bills Page Test

  Background: Go to home page
    Given The user is on the login page
    When The user enters with "username" and "password" credentials
    And The user selects the "Pay Bills" menu
    And The user should be able to see as a page header "Zero - Pay Bills"

  Scenario: Positive -Payment scenario
    And The user selects "Bank of America" in Payee menu
    And The user selects "Savings" in Account menu
    And The user enters amount
    And The user enters date
    And The user enters "House rent" to description box
    When The user pay submit
    Then The user should be able to see "The payment was successfully submitted."