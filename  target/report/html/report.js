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
  "name": "The user makes the put call to the resource to update user \"/user/user1\"",
  "rows": [
    {
      "cells": [
        "123",
        "user1",
        "gopi",
        "nath",
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
formatter.match({
  "location": "CommonScenarioSteps.i_am_using_the_baseURI()"
});
formatter.result({
  "duration": 3780858627,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "/user/user1",
      "offset": 60
    }
  ],
  "location": "UpdateUserSteps.the_user_makes_the_put_call_to_the_resource_to_update_user(String,DataTable)"
});
formatter.result({
  "duration": 7286421438,
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
  "duration": 172112163,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "update the user with valid details",
  "description": "",
  "id": "update-user-details;update-the-user-with-valid-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "user is using the baseURI",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "The user makes the put call to the resource to update user \"/user/abc\"",
  "rows": [
    {
      "cells": [
        "999",
        "abcd",
        "gopi",
        "nath",
        "gopi@gmail.com",
        "pass@123",
        "98765",
        "0"
      ],
      "line": 15
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user need to get a response code: 404",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonScenarioSteps.i_am_using_the_baseURI()"
});
formatter.result({
  "duration": 17672055,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "/user/abc",
      "offset": 60
    }
  ],
  "location": "UpdateUserSteps.the_user_makes_the_put_call_to_the_resource_to_update_user(String,DataTable)"
});
formatter.result({
  "duration": 660889087,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "404",
      "offset": 34
    }
  ],
  "location": "CommonScenarioSteps.i_need_to_get_a_response_code(int)"
});
formatter.result({
  "duration": 51457678,
  "error_message": "java.lang.AssertionError: 1 expectation failed.\nExpected status code \u003c404\u003e doesn\u0027t match actual status code \u003c200\u003e.\n\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.codehaus.groovy.reflection.CachedConstructor.invoke(CachedConstructor.java:83)\r\n\tat org.codehaus.groovy.reflection.CachedConstructor.doConstructorInvoke(CachedConstructor.java:77)\r\n\tat org.codehaus.groovy.runtime.callsite.ConstructorSite$ConstructorSiteNoUnwrap.callConstructor(ConstructorSite.java:84)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCallConstructor(CallSiteArray.java:60)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callConstructor(AbstractCallSite.java:235)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callConstructor(AbstractCallSite.java:247)\r\n\tat io.restassured.internal.ResponseSpecificationImpl$HamcrestAssertionClosure.validate(ResponseSpecificationImpl.groovy:451)\r\n\tat io.restassured.internal.ResponseSpecificationImpl$HamcrestAssertionClosure$validate$1.call(Unknown Source)\r\n\tat io.restassured.internal.ResponseSpecificationImpl.validateResponseIfRequired(ResponseSpecificationImpl.groovy:613)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoMetaMethodSite$PogoCachedMethodSiteNoUnwrapNoCoerce.invoke(PogoMetaMethodSite.java:210)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoMetaMethodSite.callCurrent(PogoMetaMethodSite.java:59)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callCurrent(AbstractCallSite.java:166)\r\n\tat io.restassured.internal.ResponseSpecificationImpl.statusCode(ResponseSpecificationImpl.groovy:120)\r\n\tat io.restassured.specification.ResponseSpecification$statusCode$0.callCurrent(Unknown Source)\r\n\tat io.restassured.internal.ResponseSpecificationImpl.statusCode(ResponseSpecificationImpl.groovy:128)\r\n\tat io.restassured.internal.ValidatableResponseOptionsImpl.statusCode(ValidatableResponseOptionsImpl.java:117)\r\n\tat com.common.StepDefinitionHelper.validateResponseCode(StepDefinitionHelper.java:97)\r\n\tat com.common.CommonScenarioSteps.i_need_to_get_a_response_code(CommonScenarioSteps.java:24)\r\n\tat ✽.Then user need to get a response code: 404(src/test/resources/FeatureFiles/user/UpdateUser.feature:16)\r\n",
  "status": "failed"
});
});