@smoke
Feature: F08_Wishlist | user add a product to wishlist
  Scenario: user Add any product to wishlist
    When user clicks on wishButton of any product
    Then verify that success msg bar and it's color appeared
    Scenario: user Add Same product to wishlist
    When user clicks on wishButton of any product
    And User clicks on Wishlist Button
    Then verify that product is displayed in wishlist page