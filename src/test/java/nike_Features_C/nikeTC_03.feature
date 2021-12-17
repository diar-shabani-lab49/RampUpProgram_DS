Feature: test
  Scenario: As a user I want to color wave and size for my shoe and proceed to add it to bag.
    Given User is now on "Kyrie 7 Basketball Shoes. Nike.com"
    Then User selects color wave option 1
    Then User selects size "M 3.5 / W 5"
    Then User selects Add to Bag button
    And User clicks checkout from View Bag popup
    And User is redirected to "Nike Store. Cart.