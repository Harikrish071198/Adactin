Feature: To Verify Bookswagon Page

Scenario: To Verify Bookswagon Page using Credentials and Details

Given User Should be in Login  Page
When User Should Enter Valid Credentials 
When User Should Click Login button
When User Should Validate Fiction book page  and Select Bihar diaries Book
And User Should Add Bihar Diaries book to Cart
And User Should Enter Again LoginPage and Add Two Books to Cart
And User Should Enter Cart Page
And User Should Fill the Personal details for Shipping
Then  User Should be back to LoginPage and Logout

