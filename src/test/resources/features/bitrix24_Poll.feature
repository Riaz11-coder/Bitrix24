Feature: Creating poll
  User Story 4: As a user, I should be able to create a
  poll by clicking on Poll tab under Active Stream."

  Background: User is on Portal page.
    Given User should loged in and user is on the Portal page.
    Then User clicks on Poll tab under Active Stream.


  @Poll
  Scenario: 1. User should be able to click on upload files icon to upload files and pictures from local disks,
                download from external drive,
                select documents from bixtrix24,
                and create files to upload.
    Given User should be able to click on Upload icon
    When  User should clicks Upload files and images


    @SelectingContacts
    Scenario: 2.  User should be able to add users from selecting contact from E-mail user,
                  Employees and Departments and Recent contact lists.
      Given User should be able to click on Add more link
      When User should be able to click on E-mail users link
      Then User should be able click on Employees and Departments
      And  User should be able click on one selected element (on email name)
