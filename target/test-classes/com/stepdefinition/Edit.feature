Feature: To Verify, Page is updating for second time
Scenario:  To validate login by using valid email and valid password
Given Open the Seedlive login page through Chrome Browser
When Login using Valid Seedlive credentials
And Enter the login button
Then Seedlive Home page displayed.

Scenario: To Edit the customer Details for first time
Given User click on administration tab 
When User select edit customer and Give customer name in "Customer Name" field
And Click on Search button
And select the Customer name and Edit the details
And click on Save Changes button
Then Customer detail updated for first time

Scenario: To Edit the customer Details for Second time
Given Refresh the page
When Edit the customer details for second times
And click on Save Changes button
Then Customer detail Updated for second time