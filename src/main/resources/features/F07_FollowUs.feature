@smoke
Feature: F07_followUs | users could open followUs links
  Scenario: user opens facebook link
    When user clicks on Facebook Icon
    Then Facebook Tab is opened
  Scenario: user opens Twitter link
    When user clicks on Twitter Icon
    Then Twitter Tab is opened
  Scenario: user opens Rss link
    When user clicks on Rss Icon
    Then rss Tab is opened
  Scenario: user opens Youtube link
    When user clicks on Youtube Icon
    Then Youtube Tab is opened
