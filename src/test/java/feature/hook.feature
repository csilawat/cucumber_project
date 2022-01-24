Feature: Application login

  @Reg
  Scenario: Application login with valid username and passwords
    Given open Login window
    When enter valid user name and passwords
    Then will land on Home page of Applications

  @Smoke
  Scenario: Application login with valid username and passwords
    Given open Login window
    When enter valid user "admin" and passwords "adminPass"
    Then will land on Home page of Applications
    And your name will be display as "Chaitanya"

  @Sanity
  Scenario: Application login with valid username and passwords
    Given open Login window
    When enter valid user "testAdmin" and passwords "TestPass"
    Then will land on Home page of Applications
    And your name will be display as "Silawat"

  @Reg
  Scenario: Application login with valid username and passwords
    Given open Login window
    When enter valid user name and passwords
    Then will land on Home page of Applications

  @Sanity
  Scenario: Application login with valid username and passwords
    Given open Login window
    When enter valid user "admin111" and passwords "adminPass111"
    Then will land on Home page of Applications
    And your name will be display as "Chaitanya111"

  @Smoke
  Scenario: Application login with valid username and passwords
    Given open Login window
    When enter valid user "testAdmin1111" and passwords "TestPass111"
    Then will land on Home page of Applications
    And your name will be display as "Silawat111"

  @Smoke @Reg
  Scenario: Application login with valid username and passwords
    Given open Login window
    When enter valid user "testAdmin1111" and passwords "TestPass111"
    Then will land on Home page of Applications
    And your name will be display as "Silawat111"