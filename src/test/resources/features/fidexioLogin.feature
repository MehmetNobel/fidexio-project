@FIDEX-365
Feature: Login feature for pos manager and sales manager

  @FIDEX-357 @Fidexio
  Scenario Outline: Verify that pos manager enters the login page with valid credentials.
    Given user is on the login page
    When user enters the "<username>" and password "<password>"
    Then user is on the homepage

    Examples:
      | username              |  | password   |
      | posmanager15@info.com |  | posmanager |
      | posmanager16@info.com |  | posmanager |


  @FIDEX-358 @Fidexio
  Scenario Outline: Verify that sales manager enters the login page with valid credentials.
    Given user is on the login page
    When user enters the "<username>" and password "<password>"
    Then user is on the homepage

    Examples:
      | username                |  | password     |
      | salesmanager15@info.com |  | salesmanager |
      | salesmanager16@info.com |  | salesmanager |

  @FIDEX-359 @Fidexio
  Scenario: Wrong login/password" should be displayed for invalid (valid username-invalid password) credentials
    Given user is on the login page
    When user enters the "salesmanager10@info.com" and password "salesmanager10"
    Then user see the error message

  @FIDEX-360 @Fidexio
  Scenario: Verify that "Please fill out this field" message should be displayed if the password or username is empty
    Given user is on the login page
    When user enters the "" and password ""
    Then user see the message

  @FIDEX-361 @Fidexio
  Scenario: User land on the ‘reset password’ page after clicking on the "Reset password" link
    Given user is on the login page
    When user clicks the reset password button
    Then user see email input page

  @FIDEX-362 @Fidexio
  Scenario:Verify if the ‘Enter’ key of the keyboard is working correctly on the login page.
    Given user is on the login page
    When user enters the "salesmanager10@info.com" and password "salesmanager" and hits the Enter Key
    Then user is on the homepage

  @FIDEX-363 @Fidexio
  Scenario:Verify that user should see the password in bullet signs by default
    Given user is on the login page
    When user enters the "salesmanager10@info.com" and password "salesmanager10"
    Then user see that password is in bullet signs by default

  @FIDEX-364 @Fidexio
  Scenario: Wrong login/password" should be displayed for invalid (invalid username-valid password) credentials
    Given user is on the login page
    When user enters the "salesmanagerr@info.com" and password "salesmanager"
    Then user see the error message





