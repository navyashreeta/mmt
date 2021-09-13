Feature: loading marriot website

Scenario: performing actions on website
Given navigate to the Marriot website
And navigate to ourbrands
And select destination feild
And select hotel
When address is given
Then verify
