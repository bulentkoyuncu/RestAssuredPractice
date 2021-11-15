Feature: To test HR Database connection
  @wip @db
  Scenario: Printing a List of Query Results
    When User send a query "select * from employees" to "HR" database
    Then Result should be written to console