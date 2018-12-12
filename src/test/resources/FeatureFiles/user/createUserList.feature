#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given user is using the baseURI
    When the user makes post call to the endpoint "/user/createWithArray"
      | id  | username | fname | lname | email          | password | phone     | userstatus |
      | 123 | user1    | user  | one   | user1@test.com | pass1    | 123456789 |          0 |
      | 124 | user2    | user  | two   | user2@test.com | pass2    | 123456781 |          0 |
    Then user need to get a response code: 200
