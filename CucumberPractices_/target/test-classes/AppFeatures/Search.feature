
Feature: Amazon Search 
Scenario: Search a Product  
Given I have a search field on Amazon Page
When I search for a product with name "Apple MacBook Pro" and price 1000
Then Product with n	ame "Apple MacBook Pro" should be displayed