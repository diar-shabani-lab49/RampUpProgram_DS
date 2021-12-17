Feature: Nike Home Page
  Scenario: As a user I want to navigate to mens basketball shoes
    Given User is on Nike homePage
    Then page title should be "Nike. Just Do It. Nike.com"
    When User hovers "Men" tab on NavBar
    Then User should be able to click "Basketball" under "Shoes" section from "Men" dropdown UI
    And User is redirected to "Men's Basketball Shoes. Nike.com"