
Feature: Account Activity page testing

  Background: Go to home page
    Given The user is on the login page
    When The user enters with "username" and "password" credentials
    And The user selects the "Account Activity" menu

  Scenario: The user should be able to see following menu
    And The user should be able to see as a page header "Zero - Account Activity"
    And The user should be see "Savings" is selected in the Account menu
    And The user should be able to see following options in the account box
      | Savings     |
      | Checking    |
      | Savings     |
      | Loan        |
      | Credit Card |
      | Brokerage   |


  Scenario Outline: The user should be able to see following menu
    Then The user should be able to see "<TransactionsTableHeaders>" with <TransactionTableLocNumber>
    Examples:
      | TransactionsTableHeaders | TransactionTableLocNumber |
      | Date                     | 1                         |
      | Description              | 2                         |
      | Deposit                  | 3                         |
      | Withdrawal               | 4                         |



