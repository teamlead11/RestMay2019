#Author: your.email@your.domain.com
@tag
Feature: Update user details

  @tag1
  Scenario: update the user with valid details
    Given user is using the baseURI
    When The user makes the put call to the resource to update user "/user/user1"
      | 123 | user1 | gopi | nath | gopi@gmail.com | pass@123 | 98765 | 0 |
    Then user need to get a response code: 200
   
Scenario: update the user with valid details
    Given user is using the baseURI
    When The user makes the put call to the resource to update user "/user/abc"
      | 999 | abcd | gopi | nath | gopi@gmail.com | pass@123 | 98765 | 0 |
    Then user need to get a response code: 404