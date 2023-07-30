@login
Feature: Login
#  @login-success-with-email
#  Scenario: login - Success login with email
#    Given user open to "mister-aladin-login"
#    When user input email "fakhrichod@gmail.com"
#    And  user input password "123456"
#    And user click login button with valid email and password
#    Then user should be at the home page

  @login-success-with-phone-number
  Scenario: login - Success login with phone number
    Given user open to "mister-aladin-login"
    And user click to login with phone number
    When user input phone number "81313559122"
    And user click login button with valid phone number
    Then user should be at the OTP verification page