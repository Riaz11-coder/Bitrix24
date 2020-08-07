Feature: As a user, I should be able to send
	appreciation by clicking on Appreciation subheading from ""More"" tab under Activity Stream

	Background: User is logged in and on Appreciation Module
		Given User is logged in and on Activity Stream Page
		When User clicks on more tab
		And User clicks on Appreciation tab
		Then User is on Appreciation module
	
	@smoke
	Scenario: User should be able to Upload files and images under  "Appreciation" Module 
		 Given User is logged in as a helpDesk
		 When User clicks on Upload files icon
		 Then User should see Upload files and Images box
		 When User Uploads file or image locally
		 Then User should be able to see it has been Uploaded


