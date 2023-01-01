
Feature: Account Summary page testing
  Background: Go to home page
    Given The user is on the login page
    When The user enters with "username" and "password" credentials

  Scenario: The user should be able to see following menu
    Then The user should be able to see as a page header "Zero - Account Summary"
    Then The user should be able to see account types, under the Account Summary
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |

 # Scenario Outline: Account Summary pages issues
  #  Then The user should be able to see as a page header "Zero - Account Summary"
  #  Then  The user should be able to see "<AccountTypes>" in Account Summary page

  #  Examples:
   #   | AccountTypes        |
   #   | Cash Accounts       |
   #   | Investment Accounts |
    #  | Credit Accounts     |
    #  | Loan Accounts       |

  Scenario Outline:
    Then  The user should be able to see with <CreditAccountNumber> this "<CreditAccountName>"
    Examples:
      | CreditAccountNumber | CreditAccountName |
      | 1                   | Account           |
      | 2                   | Credit Card       |
      | 3                   | Balance           |

