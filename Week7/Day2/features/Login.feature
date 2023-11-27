Feature: Login functionality of Leaftaps Application

Background:
Given Launch the browser
And Load the url

Scenario: Login with Positive Credentials
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login Button
Then HomePage should be displayed

Scenario: Login with Negative Credentials
Given Enter the username as 'Demosales'
And Enter the password as 'crmsfa'
When Click on the Login Button
But ErrorMessage should be displayed



