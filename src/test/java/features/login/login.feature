


@signIn @regression @smoke @prod
Feature: TalentTEK sign In feature test suite
  Scenario: User should be able to sign In with valid credentials
    Given I am at TalentTEK home page
    And I enter student  email address
    And I enter student password
    When  I click log in button
    Then I should be successfully log in