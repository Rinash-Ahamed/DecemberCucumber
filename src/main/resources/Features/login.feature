Feature: Login feature

  @regression
  Scenario: to test the posiitve login of my portal
    Given user is on the login page
    Then user enter his valid username and password
    And user clicks on the login button
    Then user verify whether he is successfully logged in

  @smoke @regression
  Scenario: to test the negative login of my portal
    Given user is on the login page
    Then user enter his invalid username and password
    And user clicks on the login button
    Then user verify whether he is successfully logged in
