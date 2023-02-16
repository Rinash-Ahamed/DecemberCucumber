Feature: This is a form filling feature

  @sanity
  Scenario: User trying to fill the form in the webpage
    Given User is on the form page
    Then User is filling the forms with valid data
    And User trying to click on the submit button
