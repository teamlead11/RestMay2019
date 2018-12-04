#Sample Feature Definition Template
@tag
Feature: To create new order

  @tag2
  Scenario Outline: Title of your scenario outline
    Given user is using the baseURI
    When The user makes the post call to the endpoint "/store/order" with "<id>","<petId>","<quantity>","<shipdate>","<status>" and "<complete>"
    Then user need to get a response code: 200
    And The user validates the "<id>","<petId>","<quantity>","<shipdate>","<status>" and "<complete>"

    Examples: 
      | id  | petId  | quantity | shipdate                 | status | complete |
      | 123 | 193849 |        1 | 2018-12-04T05:00:07.538Z | placed | false    |
