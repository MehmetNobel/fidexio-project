@FIDEX-525
Feature:As a POSMANAGER, I should be able to enter a new Fuel Log for the vehicle

  Background: login should be performed for valid credentials
    Given user is on the login page
    When user enters the "posmanager10@info.com" and password "posmanager"
    Then user is on the homepage


  @FIDEX-524
  Scenario: Pos manager can create new Vehicles Fuel Logs
    Given user hits the more and fleet button
    And user hits the Vehicles Fuel Logs
    And user hits the Create Button
    And user enters vehicle informations
    Then user saves the datas successfully
