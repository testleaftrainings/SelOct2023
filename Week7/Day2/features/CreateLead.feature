Feature: CreateLead functionality of Leaftaps Application

Background:
Given Launch the browser
And Load the url

Scenario Outline: CreateLead with multiple data
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login Button
Then HomePage should be displayed
When Click on crmsfa link
And Click on Leads Link
And Click on CreateLead Link
Given Enter the companyname as <companyname>
And Enter the firstname as <firstname>
And Enter the lastname as <lastname>
When Click on Submit button
Then ViewLeadsPage should be displayed as <companyname>

Examples:
|companyname|firstname|lastname|
|TestLeaf|Subraja|S|
|Qaegle|Vidhya|R|

