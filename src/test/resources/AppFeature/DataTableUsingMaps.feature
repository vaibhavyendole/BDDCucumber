Feature: Maps Opening Bank Account
Scenario: Maps Opening bank account with nominee
Given Maps User is at the account page
When Maps user enters the following data
| Name | Env | Email | Phone |
| Vaibhav | QA | Vaibhav@gmail.com | 8888888888 |
| Ruchi | Stage | Ruchi@gmail.com | 9999999999 |
And Maps user click on submit button
Then Maps user should get confirmation message