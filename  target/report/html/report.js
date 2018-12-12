$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/FeatureFiles/pet/findByID.feature");
formatter.feature({
  "line": 1,
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Title of your scenario",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is using the baseURI",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "The user makes a GET call to the resource \"pet/1919\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user need to get a response code: 200",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "The user validates the response body",
  "keyword": "And "
});
formatter.match({
  "location": "CommonScenarioSteps.i_am_using_the_baseURI()"
});
formatter.result({
  "duration": 3771813537,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pet/1919",
      "offset": 43
    }
  ],
  "location": "FindPet.the_user_makes_a_GET_call_to_the_resource(String)"
});
formatter.result({
  "duration": 7923162691,
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
  "duration": 177613383,
  "status": "passed"
});
formatter.match({
  "location": "FindPet.the_user_validates_the_response_body()"
});
formatter.result({
  "duration": 553588606,
  "status": "passed"
});
});