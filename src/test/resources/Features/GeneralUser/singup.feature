Feature: Singup functionality
  " I want to singup without any error
  so that I can access the G-user singin with successfully"

  Scenario Outline: User can singup  with successfully
    Given I am in the home page
    When I click on the sing In menu
    When I click on the singup menu
    Then I click on the G-user Sing up menu
    And I fill the first name
    And I fill the last name
    And I fill the user name
    And I fill the email id
    And I fill the phone number
    And I fill the whatsapp number
    And I fill the district name
    And I fill the area name
    And I fill the password
    Then hen I fill  the confirm password
    And I click on the  agree to partners checkbox
    Then I click on the singup submit btn
    Examples:
      |  |


