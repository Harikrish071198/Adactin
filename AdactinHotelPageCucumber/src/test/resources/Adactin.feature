Feature: To Verify Adactin Hotel Page
 
 Scenario: To Verify Whole Adactin Hotel Page Using Credentials and Details
 
 Given User Should be in Login Page
 When User Should Enter Valid Credentials
 When User Should Login button
 And User Should Validate Login successfull
 And User should Validate Search Hotel Page
 And User Should Select Hotel & Enter Details
 And User Should Click Selected Hotel
 And User Should Validate Book Hotel Page
 And  User Should Enter Personal Details to Book Hotel
 And User Should Click My Itinerary To enter Book Itinerary Page
 And User Should Cancel the Booking Order & Logout
 Then User Should Again Login

