Feature: Login feature for pos manager and sales manager

  @FIDEX-357 @Fidexio
  Scenario: Verify that pos manager enters the login page with valid credentials.
    Given user is on the login page
    When user enters the "posmanager10@info.com" and password "posmanager"
    Then user is on the homepage

  @FIDEX-358 @Fidexio
  Scenario: Verify that sales manager enters the login page with valid credentials.
    Given user is on the login page
    When user enters the "salesmanager10@info.com" and password "salesmanager"
    Then user is on the homepage

  @FIDEX-359 @Fidexio
    Scenario: Wrong login/password" should be displayed for invalid (valid username-invalid password) credentials
      Given user is on the login page
      When user enters the "salesmanager10@info.com" and password "salesmanager10"
      Then user see the error message

