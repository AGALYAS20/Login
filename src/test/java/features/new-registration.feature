Feature: ArenaCX New Account Registration Functionality 

Scenario Outline: Successful registration with Multiple valid details 
	Given Launch the browser and click the registration link
	When Enter the First Name as <FirstName> 
	And Enter the Last Name as <LastName> 
	And Enter the Email id as <YourEmailAddress> 
	And Enter the Job Title as <JobTitle> 
	And Enter the Phone Number as <PhoneNumber> 
	And Enter the Company Name as <CompanyName> 
	And Enter the Website URL as <WebsiteURL> 
	And select any industry from the drop-down as <Industry> 
	And select the check box 
	And click on Continue Registration 
	And The system generates a dynamic password
	And The user enter the password and reconfirm the same  
	Then Account should be created 
	
	Examples: 
		|FirstName |LastName  |YourEmailAddress |JobTitle |PhoneNumber  |CompanyName |WebsiteURL    |Industry |
		|'Maya'      |'Santhosh'  |'maya02@gmail.com'  |'CTO'      | '9856253654'  |'msan'        |'www.msan.com'  |'IT Services'   |
		|'Arjun'     |'Raj'       |'araj20@gmail.com'  |'CTO'      | '9625321452'  |'aric'        |'www.aric.com'  |'Banking'      |