Feature: loading marriot website

Scenario: performing actions on website

Given navigate to the Marriot website
And click on Member Benifits under Marriot Bonvoy
When address of first hotel as city name
Then  verify Mobile Check-In and Mobile Key in the benefits page.
