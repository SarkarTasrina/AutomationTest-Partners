Feature: Singup functionality
  " I want to singup without any error
  so that I can access the City Partners singin with successfully"

  Scenario Outline: User can singup  with successfully
    Given I am in the home page
    When I click on the sing In menu
    When I click on the singup menu
    Then I click on the city partner Sing in menu
    And I fill the last name
    And I fill the Nid number
    And I fill the user name
    And I fill the email id
    And I fill the profession
    And I fill the phone number
    And I fill the whatsapp number
    And I fill the district name
    And I fill the area name
    And I fill the password
    Then I fill  the confirm password
    And I upload the nid card photo
    And I upload the profile photo
    And I upload the Trade Licence photo

    And I click on the  agree to partners checkbox
    Then I click on the singup submit btn
    Examples:
      |  |