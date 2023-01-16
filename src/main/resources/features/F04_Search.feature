@smoke
Feature: F04_Search | User could search for any product
  Scenario: user could search by product name
  When user search by product name "book" and click search button
  Then verify that number of results more than one & create for loop to check each product name and assert it contains the word used in search

  Scenario: user could search by sku number
  When user search by sku "AP_MBP_13" and click search button
  Then verify that number of results equal one & open this only search result and assert that sku already exist after opening product detail page
