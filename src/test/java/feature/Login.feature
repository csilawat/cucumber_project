Feature: Application login

  Scenario: Application login with valid username and passwords
    Given open Login window
    When enter valid user name and passwords
    Then will land on Home page of Applications

  Scenario: Application login with valid username and passwords
    Given open Login window
    When enter valid user "admin" and passwords "adminPass"
    Then will land on Home page of Applications
    And your name will be display as "Chaitanya"

  Scenario: Application login with valid username and passwords
    Given open Login window
    When enter valid user "testAdmin" and passwords "TestPass"
    Then will land on Home page of Applications
    And your name will be display as "Silawat"