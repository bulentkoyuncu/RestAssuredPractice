Feature: Verify the info all environment

  Scenario: Get the info from UI
    Given User logs in with "sbirdbj@fc2.com" and "asenorval"
    When User navigates to mySelf page
    Then User gets the UI info

  @wip
  Scenario: Get info from API
    When User logs in BookIT API using "sbirdbj@fc2.com" and "asenorval"
    Then User gets API information