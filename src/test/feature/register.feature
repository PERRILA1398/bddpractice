
Feature: = Register

  @register
    Scenario : As a user I should be able to register successsfully
  Given User is on HomePage

  When User clicks on Register button and  types in their details

    Then User should be able to register successfully