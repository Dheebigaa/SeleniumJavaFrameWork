Feature: IRCTC Flight Booking Functionality

Background: User loads landing page and clickson flight options
Given User is in IRCTC flight landing page
And User Clicks on Ok button of informational alert
And User click on flight options
@SmokeTest
Scenario: Booking flight for one way trip

Given User select one way trip
And User selects From and To city
And User enters departure date to travel
And User clicks on traveller and economy to select no of travellers and class to travel
When User clicks on search button it is redirected to list of available flights page
Then User selects flight and view price before booking
And User clicks on Book now option for booking flight
And user select No option for GST details informational popup
And User asserts entered details
And User clicks on add traveller information
And User login as guest User
And User fills traveller information and select agree checkbox
When User cicks on continue button it is redirected to payment page.

Scenario: Booking flight for Round trip
Given User select Round trip
And User selects From and To city
And User enters departure date and return date to travel
And User clicks on traveller and economy to select no of travellers and class to travel
When User clicks on search button it is redirected to list of available flights page
Then User selects flight and view price before booking
And User clicks on Book now option for booking flight
And user select No option for GST details informational popup
And User asserts entered details
And User clicks on add traveller information
And User login as guest User
And User fills traveller information and select agree checkbox
When User cicks on continue button it is redirected to payment page.

Scenario: Booking flight for Multi city trip
Given User select Multicity trip
When User clicks on Multi city informational message is displayed 
And User clicks on continue button
And User selects From and To city
And User enters departure date to travel
Then USer clicks on Add city button
And User selects From and To city
And User enters departure date to travel
And User clicks on traveller and economy to select no of travellers and class to travel
When User clicks on search button it is redirected to list of available flights page
Then User selects flight and view price before booking
And User clicks on Book now option for booking flight
And user select No option for GST details informational popup
And User asserts entered details
And User clicks on add traveller information
And User login as guest User
And User fills traveller information and select agree checkbox
When User cicks on continue button it is redirected to payment page.