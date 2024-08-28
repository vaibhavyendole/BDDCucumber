Feature: Opening Bank Account
Scenario: Opening bank account with nominee
Given User is at the account page
When user enters the following data
| Vaibhav | QA | Vaibhav@gmail.com | 8888888888 |
| Ruchi | Stage | Ruchi@gmail.com | 9999999999 |
And user click on submit button
Then user should get confirmation message