#Author: your.email@your.domain.com
@tag
Feature: To test pet servcice 

  @tag1
  Scenario: find by sold status
    Given user is using the baseURI
    When The user makes a get call to the resource "/pet/findByStatus?status=sold" to find the sold status
    Then user need to get a response code: 200
    And The user should see only the sold pet in the response
