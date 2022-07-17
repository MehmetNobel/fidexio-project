@FIDEX-523
Feature: Pos manager can create new Vehicle Model

  Background: login should be performed for valid credentials
    Given user is on the login page
    When user enters the "posmanager10@info.com" and password "posmanager"
    Then user is on the homepage

    @FIDEX-522
    Scenario: user hits the more button
      Given user hits the more and fleet button
      And user hits the Vehicle Model
      And user enters the Model Name
      Then edit Button is visible






















