@Login
Feature: Login feature
  As a user I want to login into orange hrm website

  @Sanity
  Scenario: User should navigate to login page successfully
    Given I am on Home  page
    When I enter username  "Admin"
    And I enter password "admin123"
    And I click on login link
    Then I should login successfully

@Sanity
  Scenario: verify text on the Home page when user logout successfully
    Given I am on Home  page
    When I enter username  "Admin"
    And I enter password "admin123"
    And I click on login link
    And I click on welcome admin link and logout link
    Then I should see login pannel "LOGIN Panel"


#  Scenario: verify the error message when user login with invalid crendentials
#    Given I am on Home page
#    When I enter email username "Admi"
#    And I enter password "abc123"
#    And I click on login link
#    Then I should see the error message "Invalid credentials"
#
