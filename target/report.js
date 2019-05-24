$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/D/Automation/GmailBDD/resources/package2/test3.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    }
  ],
  "line": 3,
  "name": "Gmail login",
  "description": "I want to use this template for my feature file",
  "id": "gmail-login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Valid password",
  "description": "",
  "id": "gmail-login;valid-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Launch Gmail site",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "enter userid with \"\u003cuserName\u003e\" value",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Click next button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "enter password with \"\u003cpassword\u003e\" value",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "click password next button",
  "keyword": "And "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "gmail-login;valid-password;",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ],
      "line": 15,
      "id": "gmail-login;valid-password;;1"
    },
    {
      "cells": [
        "ghouseak",
        "ghouse@786"
      ],
      "line": 16,
      "id": "gmail-login;valid-password;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 9517582049,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Valid password",
  "description": "",
  "id": "gmail-login;valid-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    },
    {
      "line": 6,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Launch Gmail site",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "enter userid with \"ghouseak\" value",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Click next button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "enter password with \"ghouse@786\" value",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "click password next button",
  "keyword": "And "
});
formatter.match({
  "location": "GamilMethods.method2()"
});
formatter.result({
  "duration": 20097491731,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ghouseak",
      "offset": 19
    }
  ],
  "location": "GamilMethods.method5(String)"
});
formatter.result({
  "duration": 5164588588,
  "status": "passed"
});
formatter.match({
  "location": "GamilMethods.method6()"
});
formatter.result({
  "duration": 9861346302,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ghouse@786",
      "offset": 21
    }
  ],
  "location": "GamilMethods.method8(String)"
});
formatter.result({
  "duration": 5114303514,
  "status": "passed"
});
formatter.match({
  "location": "GamilMethods.method9()"
});
formatter.result({
  "duration": 5222346362,
  "status": "passed"
});
});