#Author: your.email@your.domain.com
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given user is using the baseURI
    When The user makes a get call to the resource "/pet/findByStatus?status=sold" to find the sold status
    Then user need to get a response code: 200
    And The user should see only the sold pet in the response
