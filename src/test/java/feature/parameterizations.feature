Feature: login with different users

  Scenario Outline: login with given users
    Given open Login window
    When login with username <username> and password <password>
    Then able to login
    And will land on Home page of Applications
    Examples:
      | username   | password    |
      | admin1     | admin       |
      | manager    | manager1    |
      | supervisor | supervisor1 |
      | Labor      | Labor1      |
