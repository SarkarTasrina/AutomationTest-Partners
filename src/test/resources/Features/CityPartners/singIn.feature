Feature: Singup functionality
  " I want to singup without any error
  so that I can access the city partners singin with successfully"
  Feature: singin functionality
  " I want to singin without any error
  so that I can access the userDashboard with successfully"
  Scenario: User can sing in with successfully
    Given I am in the home page
    When I click on the sing In menu
    When I click on singIn btn
    When I click on the city partner Sing in menu
    Then I fill the emailid
    And I fill password
    Then I click on the singin submit btn
