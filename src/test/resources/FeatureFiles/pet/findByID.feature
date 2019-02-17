Feature: Title of your feature
  I want to use this template for my feature file

  Background: 
    Given user is using the baseURI
    When user make GET call on the pet status endpoint for available pets "/pet/findByStatus?status=available"
    Then user need to get a response code: 200

  @tag1
  Scenario: Title of your scenario
    Given user is using the baseURI
    When The user makes a GET call to the resource "pet/1919"
    Then user need to get a response code: 200
    And The user validates the response body
