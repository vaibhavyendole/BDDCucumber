Feature: sending email campain
Scenario: create campain
Given user should be on campain page
When user click on create campain
And user enters the information
Then campaign should be created

Scenario: delete campain
Given: user should be on campain page 
When user click on delete button
Then campain should get deleted