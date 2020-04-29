@Account
 Feature: Account feature
   as a user i want to navigate to employee page and adding an employee successfully
@Sanity
   Scenario: User should navigate to add employee page successfully
     Given I am on Home  page
     Then I enter username  "Admin"
     And I enter password "admin123"
     And I click on login link
     And I click on Pin button
     And I click on add employee buton
     Then I should see employee id "Add Employee"




