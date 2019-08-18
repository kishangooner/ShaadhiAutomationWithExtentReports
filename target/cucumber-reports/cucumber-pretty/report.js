$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Shaadi.feature");
formatter.feature({
  "line": 3,
  "name": "Scenario to verify the Mother tongue matches the community",
  "description": "",
  "id": "scenario-to-verify-the-mother-tongue-matches-the-community",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@ShaadiFirstPage"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Title of your scenario outline",
  "description": "",
  "id": "scenario-to-verify-the-mother-tongue-matches-the-community;title-of-your-scenario-outline",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@Community"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Login into Shaadi.com page with \"\u003cDomainName\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Verify that mother tongue matches the community",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "scenario-to-verify-the-mother-tongue-matches-the-community;title-of-your-scenario-outline;",
  "rows": [
    {
      "cells": [
        "DomainName"
      ],
      "line": 11,
      "id": "scenario-to-verify-the-mother-tongue-matches-the-community;title-of-your-scenario-outline;;1"
    },
    {
      "cells": [
        "MARATHI"
      ],
      "line": 12,
      "id": "scenario-to-verify-the-mother-tongue-matches-the-community;title-of-your-scenario-outline;;2"
    },
    {
      "cells": [
        "GUJARATHI"
      ],
      "line": 13,
      "id": "scenario-to-verify-the-mother-tongue-matches-the-community;title-of-your-scenario-outline;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Title of your scenario outline",
  "description": "",
  "id": "scenario-to-verify-the-mother-tongue-matches-the-community;title-of-your-scenario-outline;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@ShaadiFirstPage"
    },
    {
      "line": 5,
      "name": "@Community"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Login into Shaadi.com page with \"MARATHI\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Verify that mother tongue matches the community",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "MARATHI",
      "offset": 33
    }
  ],
  "location": "ShaadiStepDefinition.i_am_on_the_page_on_URL(String)"
});
formatter.result({
  "duration": 18208663800,
  "status": "passed"
});
formatter.match({
  "location": "ShaadiStepDefinition.verify_the_mother_tongue()"
});
formatter.result({
  "duration": 132287900,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Title of your scenario outline",
  "description": "",
  "id": "scenario-to-verify-the-mother-tongue-matches-the-community;title-of-your-scenario-outline;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@ShaadiFirstPage"
    },
    {
      "line": 5,
      "name": "@Community"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Login into Shaadi.com page with \"GUJARATHI\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Verify that mother tongue matches the community",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "GUJARATHI",
      "offset": 33
    }
  ],
  "location": "ShaadiStepDefinition.i_am_on_the_page_on_URL(String)"
});
formatter.result({
  "duration": 15737954700,
  "status": "passed"
});
formatter.match({
  "location": "ShaadiStepDefinition.verify_the_mother_tongue()"
});
formatter.result({
  "duration": 75800,
  "status": "passed"
});
});