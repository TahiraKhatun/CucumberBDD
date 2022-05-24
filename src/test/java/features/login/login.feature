
Feature: TalentTEK sign In feature test suite

  @signIn @regression @smoke @prod
  Scenario: User should be able to sign In with valid credentials
    Given I am at TalentTEK home page
    And I enter student  email address
    And I enter student password
    When  I click log in button
#    Then I should be successfully log in



  @signIn @regression @smoke @prod
    Scenario: User should be able to sign In with valid credentials
    Given I am at TalentTEK home page
    And I enter student  email address as "Tahirakhatun101@gmail.com"
    And I enter student password as "Rahaman12"
    When  I click log in button
#    Then I should be successfully log in