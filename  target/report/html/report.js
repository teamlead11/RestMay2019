$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/FeatureFiles/Order/CreateOrder.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 3,
  "name": "To create new order",
  "description": "",
  "id": "to-create-new-order",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Title of your scenario outline",
  "description": "",
  "id": "to-create-new-order;title-of-your-scenario-outline",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@tag2"
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
  "name": "The user makes the post call to the endpoint \"/store/order\" with \"\u003cid\u003e\",\"\u003cpetId\u003e\",\"\u003cquantity\u003e\",\"\u003cshipdate\u003e\",\"\u003cstatus\u003e\" and \"\u003ccomplete\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user need to get a response code: 200",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "The user validates the \"\u003cid\u003e\",\"\u003cpetId\u003e\",\"\u003cquantity\u003e\",\"\u003cshipdate\u003e\",\"\u003cstatus\u003e\" and \"\u003ccomplete\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "to-create-new-order;title-of-your-scenario-outline;",
  "rows": [
    {
      "cells": [
        "id",
        "petId",
        "quantity",
        "shipdate",
        "status",
        "complete"
      ],
      "line": 13,
      "id": "to-create-new-order;title-of-your-scenario-outline;;1"
    },
    {
      "cells": [
        "123",
        "193849",
        "1",
        "2018-12-04T05:00:07.538Z",
        "placed",
        "false"
      ],
      "line": 14,
      "id": "to-create-new-order;title-of-your-scenario-outline;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Title of your scenario outline",
  "description": "",
  "id": "to-create-new-order;title-of-your-scenario-outline;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    },
    {
      "line": 5,
      "name": "@tag2"
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
  "name": "The user makes the post call to the endpoint \"/store/order\" with \"123\",\"193849\",\"1\",\"2018-12-04T05:00:07.538Z\",\"placed\" and \"false\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user need to get a response code: 200",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "The user validates the \"123\",\"193849\",\"1\",\"2018-12-04T05:00:07.538Z\",\"placed\" and \"false\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "And "
});
formatter.match({
  "location": "CommonScenarioSteps.i_am_using_the_baseURI()"
});
formatter.result({
  "duration": 3663068103,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "/store/order",
      "offset": 46
    },
    {
      "val": "123",
      "offset": 66
    },
    {
      "val": "193849",
      "offset": 72
    },
    {
      "val": "1",
      "offset": 81
    },
    {
      "val": "2018-12-04T05:00:07.538Z",
      "offset": 85
    },
    {
      "val": "placed",
      "offset": 112
    },
    {
      "val": "false",
      "offset": 125
    }
  ],
  "location": "CreateNewOrder.the_user_makes_the_post_call_to_the_endpoint_with_and(String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 7034988736,
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
  "duration": 205468470,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 24
    },
    {
      "val": "193849",
      "offset": 30
    },
    {
      "val": "1",
      "offset": 39
    },
    {
      "val": "2018-12-04T05:00:07.538Z",
      "offset": 43
    },
    {
      "val": "placed",
      "offset": 70
    },
    {
      "val": "false",
      "offset": 83
    }
  ],
  "location": "CreateNewOrder.the_user_validates_the_and(String,String,String,String,String,String)"
});
formatter.result({
  "duration": 182487483,
  "status": "passed"
});
});