Feature: login feature
  Agile story:User should be able to login with correct credentials


  Background: User logs in with correct credentials
  Given User is on the login page
  Then  User types in "helpdesk5@cybertekschool.com"
  And User types in the "UserUser"
  Then User is logged in as a "helpDesk"


  @helpDesk
  Scenario: Help desk user should able to send message by clicking on "Message" tap under "Active Stream.


    When User click on Message tap to send a message
    Then User click on upload link to be able to upload a file
   # And User clicks on Upload Files And Image link
    Then User clicks on Select Docs From Bitrix link
    When User clicks on Download From External Drive link
    When User clicks on Create using Office




