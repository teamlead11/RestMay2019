#Author: Arunkumar
@tag
Feature: To test create user functionality

  @tag1
  Scenario Outline: Create new user
    Given user is using the baseURI
    When The user makes the post call for the endpoint "/user" with "<id>","<username>","<firstname>","<lastname>","<email>","<password>","<phone>","<userstatus>"
    Then user need to get a response code: 200
    And The user validates the "<id>","<username>","<firstname>","<lastname>","<email>","<password>","<phone>","<userstatus>"

    Examples: 
      | id  | username | firstname | lastname | email          | password | phone      | userstatus |
      | 123 | guru87   | guru      | m        | guru@gmail.com | guru87   | 9087654321 |          0 |
