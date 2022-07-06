@FIDEX-450
Feature: As a user i want to logout.

  @FIDEX-431
  Scenario: Sales Manager can log out and ends up in login page.
    Given Sales Manager enters the username and password
    And user is on the homepage
    When user hits the logout button
    Then verify that user is outside the page

  @FIDEX-432
  Scenario: Pos Manager can log out and ends up in login page.
    Given Pos Manager enters the username and password
    And user is on the homepage
    When user hits the logout button
    Then verify that user is outside the page

  @FIDEX-448
  Scenario: Sales Manager can not go to the home page again by clicking the step back button after successfully logged out.
    Given Sales Manager enters the username and password
    And user is on the homepage
    When user hits the logout button
    Then verify that user is outside the page
    Then verify that user cannot go back to the homepage

  @FIDEX-449
  Scenario: Pos Manager can not go to the home page again by clicking the step back button after successfully logged out.
    Given Pos Manager enters the username and password
    And user is on the homepage
    When user hits the logout button
    Then verify that user is outside the page
    Then verify that user cannot go back to the homepage




