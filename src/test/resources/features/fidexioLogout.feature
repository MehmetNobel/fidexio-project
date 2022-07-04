@FidexioLogout
Feature: As a user i want to logout.

  @FidexioLogout-1
  Scenario: Sales Manager can log out and ends up in login page.
    Given Sales Manager enters the username and password
    And user is on the homepage
    When user hits the logout button
    Then verify that user is outside the page

  @FidexioLogout-2
  Scenario: Pos Manager can log out and ends up in login page.
    Given Pos Manager enters the username and password
    And user is on the homepage
    When user hits the logout button
    Then verify that user is outside the page


