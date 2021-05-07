$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("checkDriver.feature");
formatter.feature({
  "line": 1,
  "name": "check Driver fengzhuang",
  "description": "",
  "id": "check-driver-fengzhuang",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Validate driver",
  "description": "",
  "id": "check-driver-fengzhuang;validate-driver",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@1209"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I input baidu url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I input \"\u003ckeyword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I submit it 1",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I should be able to see related information 1",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "check-driver-fengzhuang;validate-driver;",
  "rows": [
    {
      "cells": [
        "keyword"
      ],
      "line": 9,
      "id": "check-driver-fengzhuang;validate-driver;;1"
    },
    {
      "cells": [
        "web automation test"
      ],
      "line": 10,
      "id": "check-driver-fengzhuang;validate-driver;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "Validate driver",
  "description": "",
  "id": "check-driver-fengzhuang;validate-driver;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@1209"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I input baidu url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I input \"web automation test\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I submit it 1",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I should be able to see related information 1",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckDriverStep.goToBaiduHomePage()"
});
formatter.result({
  "duration": 15708895101,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "web automation test",
      "offset": 9
    }
  ],
  "location": "CheckDriverStep.inputKeyWords(String)"
});
formatter.result({
  "duration": 3235782600,
  "status": "passed"
});
formatter.match({
  "location": "CheckDriverStep.submitAction()"
});
formatter.result({
  "duration": 3093553500,
  "status": "passed"
});
formatter.match({
  "location": "CheckDriverStep.seeResults()"
});
formatter.result({
  "duration": 986645400,
  "status": "passed"
});
});