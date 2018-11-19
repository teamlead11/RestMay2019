@edit
Feature: To test update pet functionality

  @edit
  Scenario: update pet
    Given user is using the baseURI
    When The user makes the put call to the resource "/pet"
      | id       | 1234567892878 |
      | catName  | toy           |
      | name     | doggie 125    |
      | photoUrl | url1          |
      | tagname  | tag1          |
      | status   | pending       |
    Then user need to get a response code: 200
    And The user validates the updated pet details
      | id       | 1234567892878 |
      | catName  | toy           |
      | name     | doggie 125    |
      | photoUrl | url1          |
      | tagname  | tag1          |
      | status   | pending       |
