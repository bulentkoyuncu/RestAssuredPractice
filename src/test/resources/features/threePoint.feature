Feature: Verify the info from all environment

  Scenario: Get the info from UI
    Given User logs in with "sbirdbj@fc2.com" and "asenorval"
    When User navigates to mySelf page
    Then User gets the UI info


  Scenario: Get the info from API
    When User logs in BookIT API using "sbirdbj@fc2.com" and "asenorval"
    Then User gets API information


  Scenario: Get the info from DB
    When User sends a query to DataBase with "sbirdbj@fc2.com"
    Then User gets DataBase information


  Scenario: Verify all environments
    Given User logs in with "sbirdbj@fc2.com" and "asenorval"
    When User navigates to mySelf page
    Then User gets the UI info
    When User logs in BookIT API using "sbirdbj@fc2.com" and "asenorval"
    Then User gets API information
    When User sends a query to DataBase with "sbirdbj@fc2.com"
    Then User gets DataBase information
    Then All information from environments must match