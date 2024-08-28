@campain5
Feature: Sending email campaign5
@sanity5
Scenario: Create campaign5
Given user should be at campaign page5
When user clicks on create campaign5
And user enters the information5
Then campaign should get created5

@regression5
Scenario: update campaign5
Given user should be at campaign page5
When user click on edit campaign button5
And user update the details5
Then campaign should get updated5

@functional5
Scenario: delete campaign
Given user should be at campaign page5
When user click on delete button5
Then campaign should get deleted5
