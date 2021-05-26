Feature: IRCTC Flight Booking Functionality

Scenario: No flights available

Given User is in IRCTC flight landing page
And User Clicks on Ok button of informational alert
And User select one way trip
And User selects From and To city
And User enter departure date to travel
And User clicks on traveller and economy to choose class and airlines to travel
When User clicks on search button it is redirected to list of available flights page
But a page with no flights is displayed