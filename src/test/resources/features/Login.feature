@bitrix24
Feature: Login
  As a user, I should be able to interact with employees on the posts that I have access to.

  Scenario:
    Given User should be able to access url and be able see home page
    When User should be able to make a comment, like, or unfollow on other employees' posts.
    Then  User should be able to view, like, or make comments on all other reviewers's comments.
    Then  User should be able to click on reviewers' name and visit their profiles.
    Then  User should be able to add others' posts to favorate by clicking on the Star icon."