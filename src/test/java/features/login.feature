Feature: ArenaCX Login Functionality
Scenario: Login with valid credentials 
Given Launch the browser and ArenaCX login page is loaded
When Enter the username as sankar.govindharaj@qeagle.com
And Enter the password as Qeagle@123
And Click on the login button
Then The user should successfully logged in
