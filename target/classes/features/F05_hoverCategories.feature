@smoke
Feature: F05_Hover Categories | user could hover any main category in Home Page
  Scenario: user Hover Random Category
    When user hover random category
    And Select Random Subcategory
    Then verify Subcategories is displayed & the title is correct