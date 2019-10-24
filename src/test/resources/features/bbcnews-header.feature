@second
Feature: BBC News header navigation

  @smoke
  Scenario: First user on the BBC page navigates to the local weather via the topbar
    Given The user is in the BBC Homepage
    When The user selects Weather
    Then The local weather is displayed

  @smoke
  Scenario: Second user on the BBC page navigates to the local weather via the topbar
    Given The user is in the BBC Homepage
    When The user selects Weather
    Then The local weather is displayed