@smoke
Feature: F01_Register | users could register with new accounts
  Scenario: guest user could register with valid data successfully
  Given user go to register page
  When user select gender type
  And user enter first name "mohamed" and last name "reda"
  And user enter date of birth
  And user enter email "test156546@example.com" field
  And user fills Password fields "16464fsffsfX@!@" "16464fsffsfX@!@"
  And user clicks on register button
  Then success message is displayed