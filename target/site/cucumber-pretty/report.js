$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("BaiduLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Test Baidu search fuction",
  "description": "",
  "id": "test-baidu-search-fuction",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "User should be able to search wanted information",
  "description": "",
  "id": "test-baidu-search-fuction;user-should-be-able-to-search-wanted-information",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@test1"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User input baidu url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User input \"\u003ckeyword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "submit it",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user should be able to see related information",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "test-baidu-search-fuction;user-should-be-able-to-search-wanted-information;",
  "rows": [
    {
      "cells": [
        "keyword"
      ],
      "line": 9,
      "id": "test-baidu-search-fuction;user-should-be-able-to-search-wanted-information;;1"
    },
    {
      "cells": [
        "selenium"
      ],
      "line": 10,
      "id": "test-baidu-search-fuction;user-should-be-able-to-search-wanted-information;;2"
    },
    {
      "cells": [
        "English"
      ],
      "line": 11,
      "id": "test-baidu-search-fuction;user-should-be-able-to-search-wanted-information;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "User should be able to search wanted information",
  "description": "",
  "id": "test-baidu-search-fuction;user-should-be-able-to-search-wanted-information;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@test1"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User input baidu url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User input \"selenium\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "submit it",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user should be able to see related information",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginBaiduStep.goToBaiduHomePage()"
});
