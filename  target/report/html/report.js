$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/FeatureFiles/user/UpdateUser.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    }
  ],
  "line": 3,
  "name": "Update user details",
  "description": "",
  "id": "update-user-details",
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
  "name": "update the user with valid details",
  "description": "",
  "id": "update-user-details;update-the-user-with-valid-details",
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
  "name": "The user makes the put call to the resource to update user \"/user/gopiselenium\"",
  "rows": [
    {
      "cells": [
        "91782",
        "gopiselenium",
        "gopi",
        "tester",
        "gopi@gmail.com",
        "pass@123",
        "98765",
        "0"
      ],
      "line": 9
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user need to get a response code: 200",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "The user should see the updated values",
  "rows": [
    {
      "cells": [
        "91782",
        "gopiselenium",
        "gopi",
        "tester",
        "gopi@gmail.com",
        "pass@123",
        "98765",
        "0"
      ],
      "line": 12
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "CommonScenarioSteps.i_am_using_the_baseURI()"
});
formatter.result({
  "duration": 840105926,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "/user/gopiselenium",
      "offset": 60
    }
  ],
  "location": "UpdateUserSteps.the_user_makes_the_put_call_to_the_resource_to_update_user(String,DataTable)"
});
formatter.result({
  "duration": 2259875738,
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
  "duration": 130664259,
  "status": "passed"
});
formatter.match({
  "location": "UpdateUserSteps.the_user_should_see_the_updated_values(DataTable)"
});
formatter.result({
  "duration": 167626917354,
  "status": "passed"
});
});