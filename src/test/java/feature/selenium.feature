Feature: search and add product to cart

  Scenario Outline: search for product
    Given open browser and got to web
    When search for <vegetable> vegetable
    Then verify vegetable <vegetable> is showing
    And click on add quantity
    And Close the browser
    Examples:
      | vegetable |
      | cucumber  |
      | brinjil   |




