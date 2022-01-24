Feature: create account

  Scenario: create account with all details
    Given open signup page
    When click on signup button and fill following details
      | chaitanya | silawat | Ratlam | 457001 | Hashedin By Deloitte | QA Automation I | 3 year |
      | Aayushi   | silawat | Ratlam | 457001 | TCS                  | HREx            | 2 year |
    Then click on create account button
    And got success message