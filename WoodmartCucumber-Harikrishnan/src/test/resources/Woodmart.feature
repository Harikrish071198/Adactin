Feature: To Verify Woodmart Page in the Shopping Page

Scenario: To Verify the Woodmart Page Using Credentials and  Details
Given User Should be in Login Page
When User Should Enter valid Credentials 
When User Should Validate Login Succesfull
And User Should Enter Shopping Page
And User Should click Watch to Buy
And User Should validate Watch Page
And User Should Comeback To Shop Page
And User Should Enter Checkout Page
Then User Should Confirm Order and Logout

