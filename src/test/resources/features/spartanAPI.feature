Feature: To Test Spartan API Connection

  Scenario: Get One Spartan and DeSerialize With Custom POJO
    When User sends a GET request to spartan API with "11" id number
    Then At the response body "Nona" name should be verfied