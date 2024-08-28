Feature: Signup functionality
Background: I have logged in to the application
And I am at Home page


Scenario Outline: signup to application
Given user at the signup page
When user enter name as "<name>"
And user select gender as "<gender>"
And user select the slotnumber as <slotnumber>
And user select the priority as <priority>

Examples:
| name | gender | slotnumber | priority |
| Vaibhav | male | 1 | true |
| Sagar | male | 2 | true |
| Lara | female | 3 | false |
| Anand | male | 4 | true |