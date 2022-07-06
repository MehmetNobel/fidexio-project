@FIDEX-450
Feature: As a user i want to logout.

  @FIDEX-431
  Scenario Outline: Sales Manager can log out and ends up in login page.
    Given user enters the "<username>" and password "<password>"
    And user is on the homepage
    When user hits the logout button
    Then verify that user is outside the page

    Examples:
      | username                |  | password     |
      | salesmanager15@info.com |  | salesmanager |
      | salesmanager16@info.com |  | salesmanager |


  @FIDEX-432
  Scenario Outline: Pos Manager can log out and ends up in login page.
    Given user enters the "<username>" and password "<password>"
    And user is on the homepage
    When user hits the logout button
    Then verify that user is outside the page

    Examples:
      | username              |  | password   |
      | posmanager15@info.com |  | posmanager |
      | posmanager16@info.com |  | posmanager |


  @FIDEX-448
  Scenario Outline: Sales Manager can not go to the home page again by clicking the step back button after successfully logged out.
    Given user enters the "<username>" and password "<password>"
    And user is on the homepage
    When user hits the logout button
    Then verify that user is outside the page
    Then verify that user cannot go back to the homepage

    Examples:
      | username                |  | password     |
      | salesmanager15@info.com |  | salesmanager |
      | salesmanager16@info.com |  | salesmanager |



  @FIDEX-449
  Scenario Outline: Pos Manager can not go to the home page again by clicking the step back button after successfully logged out.
    Given user enters the "<username>" and password "<password>"
    And user is on the homepage
    When user hits the logout button
    Then verify that user is outside the page
    Then verify that user cannot go back to the homepage

    Examples:
      | username              |  | password   |
      | posmanager15@info.com |  | posmanager |
      | posmanager16@info.com |  | posmanager |



