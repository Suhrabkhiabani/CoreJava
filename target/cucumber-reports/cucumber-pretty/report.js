$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/DataBaseFeature.feature");
formatter.feature({
  "line": 1,
  "name": "DataBase SQL Query Feature",
  "description": "",
  "id": "database-sql-query-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2592135300,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Execute all information from Actor table",
  "description": "",
  "id": "database-sql-query-feature;execute-all-information-from-actor-table",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@testingdatabase"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User Connects to PostgreSql DataBase",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User send query \u0027select description from public.film\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should get all information from that table",
  "keyword": "Then "
});
formatter.match({
  "location": "DataBaseStepDefinition.user_Connects_to_PostgreSql_DataBase()"
});
formatter.result({
  "duration": 480472500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "select description from public.film",
      "offset": 17
    }
  ],
  "location": "DataBaseStepDefinition.user_send_query_select_from_public_actor(String)"
});
formatter.result({
  "duration": 24160400,
  "status": "passed"
});
formatter.match({
  "location": "DataBaseStepDefinition.user_should_get_all_information_from_that_table()"
});
formatter.result({
  "duration": 18580300,
  "status": "passed"
});
formatter.after({
  "duration": 762264800,
  "status": "passed"
});
});