Feature: Login with data functionality
Scenario: Login with valid credentials
Given user should be at loginpage
When user enters username as "testuser"
And user enters password as "Test@1234"
And user click on submit
Then user should get logged into application