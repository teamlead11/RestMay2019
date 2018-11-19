#Author: Greens
@tag
Feature: To Test create new user functionality

  @tag1
  Scenario: Create new user
    Given user is using the baseURI
    When The user makes POST call for the endpoint "/user"
      | id  | username | firstname | lastname | phoneno | email           | password | userstatus |
      | 124 | greens2  | greens    | tech     |   12345 | test@greens.com | test@123 |         23 |
    Then user need to get a response code: 200
