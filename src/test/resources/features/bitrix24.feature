Feature: login feature
  Agile story:User should be able to login with correct credentials


  @smoke
  Scenario: Help desk user should able to login with help desk credentials
    Given User is on the login page
    Then  User types in username
    And User types in password
    Then User is logged in as a helpDesk
