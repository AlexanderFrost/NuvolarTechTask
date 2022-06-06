Feature: Add products to cart

  @wip
  Scenario: Add Two Products to Cart
    Given user on the home page
    When user search "hats for men"
    Then click the first product
    And verify the product page
    Then select the product quantity "2"
    And add to shopping cart
    Then go to cart page
    And verify total price and quantity "2"
    When user search "hats for women"
    Then click the first product
    Then select the product quantity "2"
    And add to shopping cart
    Then go to cart page
    And verify total price and quantity "4"
    Then change quantity of first product to "1"
    And verify total price and quantity "3"
