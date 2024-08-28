Feature: Placing order feature2
Scenario: Order confirmation2
Given I should be at product page2
When I click on add to cart button2
Then Product should get added2
When I click on place order2
Then Order should get placed2

Scenario: title confirmation
Given I should be at product page2
Then page title should get contains "productpage2"