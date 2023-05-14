@inventory
Feature: Edit Inventory Stock
  Background:
    Given the user is already login
    Given the user on the inventory page

  Scenario Outline: Edit inventory stock successful
    When the user clicks on Edit inventory button
    And the user input "<itemName>", "<quantity>", and "<price>"
    And the user clicks save button
    Then the inventory is successfully edited

    Examples:
    | itemName              | quantity | price    |
    | BLU-XX-APP - iMac M1  | 5        | 20000000 |
