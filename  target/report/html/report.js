$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/FeatureFiles/pet/FindByStatus.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    }
  ],
  "line": 3,
  "name": "To test pet servcice",
  "description": "",
  "id": "to-test-pet-servcice",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "find by sold status",
  "description": "",
  "id": "to-test-pet-servcice;find-by-sold-status",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is using the baseURI",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "The user makes a get call to the resource \"/pet/findByStatus?status\u003dsold\" to find the sold status",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user need to get a response code: 200",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "The user should see only the sold pet in the response",
  "keyword": "And "
});
formatter.match({
  "location": "CommonScenarioSteps.i_am_using_the_baseURI()"
});
formatter.result({
  "duration": 505444581,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "/pet/findByStatus?status\u003dsold",
      "offset": 43
    }
  ],
  "location": "FindByStatus.the_user_makes_a_get_call_to_the_resource_to_find_the_status(String)"
});
formatter.result({
  "duration": 1503877905,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 34
    }
  ],
  "location": "CommonScenarioSteps.i_need_to_get_a_response_code(int)"
});
formatter.result({
  "duration": 2612538,
  "status": "passed"
});
formatter.match({
  "location": "FindByStatus.the_user_should_see_only_the_sold_pet_in_the_response()"
});
formatter.result({
  "duration": 334013531,
  "status": "passed"
});
});