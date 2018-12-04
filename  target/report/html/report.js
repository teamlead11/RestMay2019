$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/FeatureFiles/user/CreateUser.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Arunkumar"
    }
  ],
  "line": 3,
  "name": "To test create user functionality",
  "description": "",
  "id": "to-test-create-user-functionality",
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
  "name": "Create new user",
  "description": "",
  "id": "to-test-create-user-functionality;create-new-user",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
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
  "name": "The user makes the post call for the endpoint \"/user\" with \"\u003cid\u003e\",\"\u003cusername\u003e\",\"\u003cfirstname\u003e\",\"\u003clastname\u003e\",\"\u003cemail\u003e\",\"\u003cpassword\u003e\",\"\u003cphone\u003e\",\"\u003cuserstatus\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user need to get a response code: 200",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "The user validates the \"\u003cid\u003e\",\"\u003cusername\u003e\",\"\u003cfirstname\u003e\",\"\u003clastname\u003e\",\"\u003cemail\u003e\",\"\u003cpassword\u003e\",\"\u003cphone\u003e\",\"\u003cuserstatus\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "to-test-create-user-functionality;create-new-user;",
  "rows": [
    {
      "cells": [
        "id",
        "username",
        "firstname",
        "lastname",
        "email",
        "password",
        "phone",
        "userstatus"
      ],
      "line": 13,
      "id": "to-test-create-user-functionality;create-new-user;;1"
    },
    {
      "cells": [
        "123",
        "guru87",
        "guru",
        "m",
        "guru@gmail.com",
        "guru87",
        "9087654321",
        "23"
      ],
      "line": 14,
      "id": "to-test-create-user-functionality;create-new-user;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Create new user",
  "description": "",
  "id": "to-test-create-user-functionality;create-new-user;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    },
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
  "name": "The user makes the post call for the endpoint \"/user\" with \"123\",\"guru87\",\"guru\",\"m\",\"guru@gmail.com\",\"guru87\",\"9087654321\",\"23\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5,
    6,
    7
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
  "name": "The user validates the \"123\",\"guru87\",\"guru\",\"m\",\"guru@gmail.com\",\"guru87\",\"9087654321\",\"23\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5,
    6,
    7
  ],
  "keyword": "And "
});
formatter.match({
  "location": "CommonScenarioSteps.i_am_using_the_baseURI()"
});
formatter.result({
  "duration": 1505647435,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "/user",
      "offset": 47
    },
    {
      "val": "123",
      "offset": 60
    },
    {
      "val": "guru87",
      "offset": 66
    },
    {
      "val": "guru",
      "offset": 75
    },
    {
      "val": "m",
      "offset": 82
    },
    {
      "val": "guru@gmail.com",
      "offset": 86
    },
    {
      "val": "guru87",
      "offset": 103
    },
    {
      "val": "9087654321",
      "offset": 112
    },
    {
      "val": "23",
      "offset": 125
    }
  ],
  "location": "CreateNewUser.the_user_makes_the_post_call_for_the_endpoint_with(String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 3466458303,
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
  "duration": 145659151,
  "error_message": "java.lang.AssertionError: 1 expectation failed.\nExpected status code \u003c200\u003e doesn\u0027t match actual status code \u003c500\u003e.\n\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.codehaus.groovy.reflection.CachedConstructor.invoke(CachedConstructor.java:83)\r\n\tat org.codehaus.groovy.reflection.CachedConstructor.doConstructorInvoke(CachedConstructor.java:77)\r\n\tat org.codehaus.groovy.runtime.callsite.ConstructorSite$ConstructorSiteNoUnwrap.callConstructor(ConstructorSite.java:84)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCallConstructor(CallSiteArray.java:60)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callConstructor(AbstractCallSite.java:235)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callConstructor(AbstractCallSite.java:247)\r\n\tat io.restassured.internal.ResponseSpecificationImpl$HamcrestAssertionClosure.validate(ResponseSpecificationImpl.groovy:451)\r\n\tat io.restassured.internal.ResponseSpecificationImpl$HamcrestAssertionClosure$validate$1.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:48)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:113)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:125)\r\n\tat io.restassured.internal.ResponseSpecificationImpl.validateResponseIfRequired(ResponseSpecificationImpl.groovy:613)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoMetaMethodSite$PogoCachedMethodSiteNoUnwrapNoCoerce.invoke(PogoMetaMethodSite.java:210)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoMetaMethodSite.callCurrent(PogoMetaMethodSite.java:59)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCallCurrent(CallSiteArray.java:52)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callCurrent(AbstractCallSite.java:154)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callCurrent(AbstractCallSite.java:166)\r\n\tat io.restassured.internal.ResponseSpecificationImpl.statusCode(ResponseSpecificationImpl.groovy:120)\r\n\tat io.restassured.specification.ResponseSpecification$statusCode$0.callCurrent(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCallCurrent(CallSiteArray.java:52)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callCurrent(AbstractCallSite.java:154)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callCurrent(AbstractCallSite.java:166)\r\n\tat io.restassured.internal.ResponseSpecificationImpl.statusCode(ResponseSpecificationImpl.groovy:128)\r\n\tat io.restassured.internal.ValidatableResponseOptionsImpl.statusCode(ValidatableResponseOptionsImpl.java:117)\r\n\tat com.common.StepDefinitionHelper.validateResponseCode(StepDefinitionHelper.java:97)\r\n\tat com.common.CommonScenarioSteps.i_need_to_get_a_response_code(CommonScenarioSteps.java:24)\r\n\tat ✽.Then user need to get a response code: 200(src/test/resources/FeatureFiles/user/CreateUser.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 24
    },
    {
      "val": "guru87",
      "offset": 30
    },
    {
      "val": "guru",
      "offset": 39
    },
    {
      "val": "m",
      "offset": 46
    },
    {
      "val": "guru@gmail.com",
      "offset": 50
    },
    {
      "val": "guru87",
      "offset": 67
    },
    {
      "val": "9087654321",
      "offset": 76
    },
    {
      "val": "23",
      "offset": 89
    }
  ],
  "location": "CreateNewUser.the_user_validates_the(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
});