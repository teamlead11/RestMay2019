@petstore
Feature: pet store

  @petstatus
  Scenario: find a pet by status
    Given user is using the baseURI
    When user make GET call on the pet status endpoint for available pets "/pet/findByStatus?status=available"
    Then user need to get a response code: 200

  @newpetcreation
  Scenario: Create a new pet Using Post Method
    Given user is using the baseURI
    When user make POST call on the pet status endpoint for available pets "/pet"
    Then user need to get a response code: 200

  @updatepet
  Scenario: Update a pet using Put method
    Given user is using the baseURI
    When user make PUT call on the pet status endpoint for available pets "/pet"
    Then user need to get a response code: 200
