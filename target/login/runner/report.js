$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "name": "login - Success login with phone number",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@login-success-with-phone-number"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user open to \"mister-aladin-login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.LoginSteps.userNavigates(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click to login with phone number",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginSteps.userClickPhoneNumberLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user input phone number \"81313559122\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginSteps.userInputPhoneNumber(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click login button with valid phone number",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginSteps.userClickLoginWithPhoneNumber()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be at the OTP verification page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.LoginSteps.userAtOTPVerificationPage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});