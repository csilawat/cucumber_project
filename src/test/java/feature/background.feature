Feature: background test

  Background:
    Given open Login window
# by using Background keyword this will perform as BeforeTest, mean will perform
# before every test of that feature file

  Scenario: Application login with valid username and passwords
    When enter valid user "admin" and passwords "adminPass"
    Then will land on Home page of Applications
    And your name will be display as "Chaitanya"

  Scenario: Application login with valid username and passwords
    When enter valid user "testAdmin" and passwords "TestPass"
    Then will land on Home page of Applications
    And your name will be display as "Silawat"