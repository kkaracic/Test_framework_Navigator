$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("input.feature");
formatter.feature({
  "line": 2,
  "name": "Search testing",
  "description": "User should be able to do the search once the site is opened",
  "id": "search-testing",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Search testing",
  "description": "",
  "id": "search-testing;search-testing",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "the user opens Navigator site",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user clicks on the input field and writes \u003cSearchTerm\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the user presses the RETURN key",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the user verifies that the city hall of Sarajevo is shown as the search result on the screen",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "search-testing;search-testing;",
  "rows": [
    {
      "cells": [
        "SearchTerm"
      ],
      "line": 12,
      "id": "search-testing;search-testing;;1"
    },
    {
      "cells": [
        "Vijećnica"
      ],
      "line": 13,
      "id": "search-testing;search-testing;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 11845584900,
  "status": "passed"
});
formatter.before({
  "duration": 12127739400,
  "status": "passed"
});
formatter.before({
  "duration": 5135772700,
  "status": "passed"
});
formatter.before({
  "duration": 6363133900,
  "status": "passed"
});
formatter.before({
  "duration": 6543386200,
  "status": "passed"
});
formatter.before({
  "duration": 11600249800,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Search testing",
  "description": "",
  "id": "search-testing;search-testing;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the user opens Navigator site",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user clicks on the input field and writes Vijećnica",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the user presses the RETURN key",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the user verifies that the city hall of Sarajevo is shown as the search result on the screen",
  "keyword": "Then "
});
formatter.match({
  "location": "input.the_user_opens_Navigator_site()"
});
formatter.result({
  "duration": 28217209500,
  "status": "passed"
});
formatter.match({
  "location": "input.the_user_clicks_on_the_input_field_and_writes_Vijećnica()"
});
formatter.result({
  "duration": 13867297900,
  "status": "passed"
});
formatter.match({
  "location": "input.the_user_presses_the_RETURN_key()"
});
formatter.result({
  "duration": 2435741200,
  "status": "passed"
});
formatter.match({
  "location": "input.the_user_verifies_that_the_city_hall_of_Sarajevo_is_shown_as_the_search_result_on_the_screen()"
});
formatter.result({
  "duration": 4045630500,
  "status": "passed"
});
formatter.after({
  "duration": 5452297100,
  "status": "passed"
});
formatter.after({
  "duration": 1091638700,
  "status": "passed"
});
formatter.after({
  "duration": 1421742500,
  "status": "passed"
});
formatter.after({
  "duration": 1741163200,
  "status": "passed"
});
formatter.after({
  "duration": 4866252700,
  "status": "passed"
});
formatter.after({
  "duration": 1012814300,
  "status": "passed"
});
});