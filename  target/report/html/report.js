$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/FeatureFiles/user/createUserList.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 3,
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Title of your scenario",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user is using the baseURI",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "the user makes post call to the endpoint \"/user/createWithArray\"",
  "rows": [
    {
      "cells": [
        "id",
        "username",
        "fname",
        "lname",
        "email",
        "password",
        "phone",
        "userstatus"
      ],
      "line": 10
    },
    {
      "cells": [
        "123",
        "user1",
        "user",
        "one",
        "user1@test.com",
        "pass1",
        "123456789",
        "0"
      ],
      "line": 11
    },
    {
      "cells": [
        "124",
        "user2",
        "user",
        "two",
        "user2@test.com",
        "pass2",
        "123456781",
        "0"
      ],
      "line": 12
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user need to get a response code: 200",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonScenarioSteps.i_am_using_the_baseURI()"
});
formatter.result({
  "duration": 3902552327,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "/user/createWithArray",
      "offset": 42
    }
  ],
  "location": "CreateNewUserList.the_user_makes_post_call_to_the_endpoint(String,DataTable)"
});
formatter.result({
  "duration": 9595282003,
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
  "duration": 215937346,
  "status": "passed"
});
});