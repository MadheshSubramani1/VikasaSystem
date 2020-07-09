$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("dataTableWithExamble.feature");
formatter.feature({
  "line": 1,
  "name": "Login Test of Orange HRM",
  "description": "",
  "id": "login-test-of-orange-hrm",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "Verify With Valid Credentials",
  "description": "",
  "id": "login-test-of-orange-hrm;verify-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Launch the Application In Local Evnironment",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Enterd the  \"\u003cUserName\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Click the Returns Key",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User could see the Home page",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "login-test-of-orange-hrm;verify-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ],
      "line": 9,
      "id": "login-test-of-orange-hrm;verify-with-valid-credentials;;1"
    },
    {
      "cells": [
        "Admin",
        "admin123456"
      ],
      "line": 10,
      "id": "login-test-of-orange-hrm;verify-with-valid-credentials;;2"
    },
    {
      "cells": [
        "Admin",
        "admin12345"
      ],
      "line": 11,
      "id": "login-test-of-orange-hrm;verify-with-valid-credentials;;3"
    },
    {
      "cells": [
        "Admin",
        "admin1234"
      ],
      "line": 12,
      "id": "login-test-of-orange-hrm;verify-with-valid-credentials;;4"
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ],
      "line": 13,
      "id": "login-test-of-orange-hrm;verify-with-valid-credentials;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "Verify With Valid Credentials",
  "description": "",
  "id": "login-test-of-orange-hrm;verify-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Launch the Application In Local Evnironment",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Enterd the  \"Admin\" and \"admin123456\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Click the Returns Key",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User could see the Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "dataTableWithExamble.launch_the_Application_In_Local_Evnironment()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 13
    },
    {
      "val": "admin123456",
      "offset": 25
    }
  ],
  "location": "dataTableWithExamble.enterd_the_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "dataTableWithExamble.click_the_Returns_Key()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "dataTableWithExamble.user_could_see_the_Home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 11,
  "name": "Verify With Valid Credentials",
  "description": "",
  "id": "login-test-of-orange-hrm;verify-with-valid-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Launch the Application In Local Evnironment",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Enterd the  \"Admin\" and \"admin12345\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Click the Returns Key",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User could see the Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "dataTableWithExamble.launch_the_Application_In_Local_Evnironment()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 13
    },
    {
      "val": "admin12345",
      "offset": 25
    }
  ],
  "location": "dataTableWithExamble.enterd_the_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "dataTableWithExamble.click_the_Returns_Key()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "dataTableWithExamble.user_could_see_the_Home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 12,
  "name": "Verify With Valid Credentials",
  "description": "",
  "id": "login-test-of-orange-hrm;verify-with-valid-credentials;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Launch the Application In Local Evnironment",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Enterd the  \"Admin\" and \"admin1234\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Click the Returns Key",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User could see the Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "dataTableWithExamble.launch_the_Application_In_Local_Evnironment()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 13
    },
    {
      "val": "admin1234",
      "offset": 25
    }
  ],
  "location": "dataTableWithExamble.enterd_the_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "dataTableWithExamble.click_the_Returns_Key()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "dataTableWithExamble.user_could_see_the_Home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 13,
  "name": "Verify With Valid Credentials",
  "description": "",
  "id": "login-test-of-orange-hrm;verify-with-valid-credentials;;5",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Launch the Application In Local Evnironment",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Enterd the  \"Admin\" and \"admin123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Click the Returns Key",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User could see the Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "dataTableWithExamble.launch_the_Application_In_Local_Evnironment()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 13
    },
    {
      "val": "admin123",
      "offset": 25
    }
  ],
  "location": "dataTableWithExamble.enterd_the_and(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "dataTableWithExamble.click_the_Returns_Key()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "dataTableWithExamble.user_could_see_the_Home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("dataTableWithHeader.feature");
formatter.feature({
  "line": 1,
  "name": "Login Test of Orange HRM",
  "description": "",
  "id": "login-test-of-orange-hrm",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Verify With Valid Credentials",
  "description": "",
  "id": "login-test-of-orange-hrm;verify-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Launch the Application In Test Evnironment",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Enter the  userName and Password",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ],
      "line": 5
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ],
      "line": 6
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Click the Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User can see the Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "SendTheValuesWithHeaderDef.launch_the_Application_In_Test_Evnironment()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SendTheValuesWithHeaderDef.enter_the_userName_and_Password(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SendTheValuesWithHeaderDef.click_the_Login_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SendTheValuesWithHeaderDef.user_can_see_the_Home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("dataTableWithOutHeader.feature");
formatter.feature({
  "line": 1,
  "name": "Login Test of Orange HRM",
  "description": "",
  "id": "login-test-of-orange-hrm",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Verify With Valid Credentials",
  "description": "",
  "id": "login-test-of-orange-hrm;verify-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Launch the Orange HRM Application",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Enter the below userName and Password",
  "rows": [
    {
      "cells": [
        "Admin",
        "admin123"
      ],
      "line": 5
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Enter the Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User able to see the Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "SendTheValueWithOutHeaderDef.launch_the_Orange_HRM_Application()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SendTheValueWithOutHeaderDef.enter_the_below_userName_and_Password(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SendTheValueWithOutHeaderDef.enter_the_Login_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SendTheValueWithOutHeaderDef.user_able_to_see_the_Home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("expressions.feature");
formatter.feature({
  "line": 1,
  "name": "Learning Regular Expressions",
  "description": "",
  "id": "learning-regular-expressions",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Expression Scenario",
  "description": "",
  "id": "learning-regular-expressions;expression-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I have 10 rupees",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I got 6.0 CGPA",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Iam is Yunger than \"Revathi\" and elder than \"guna\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 7
    }
  ],
  "location": "expressionsStepDefinitions.I_have_rupees(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "6.0",
      "offset": 6
    }
  ],
  "location": "expressionsStepDefinitions.I_got_CGPA(float)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Revathi",
      "offset": 20
    },
    {
      "val": "guna",
      "offset": 45
    }
  ],
  "location": "expressionsStepDefinitions.Iam_is_Yunger_than_and_elder_than(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("loginTest.feature");
formatter.feature({
  "line": 1,
  "name": "VerifyTheLoginPage",
  "description": "",
  "id": "verifytheloginpage",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 16,
  "name": "Verify With InValid Credentials",
  "description": "",
  "id": "verifytheloginpage;verify-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@NegatvieScenario"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "user is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "user Entered the \"Admin\" and \"admin123\"",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "Clicks On the Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User Should navigate to Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_Test_Definitions.user_is_on_Login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 18
    },
    {
      "val": "admin123",
      "offset": 30
    }
  ],
  "location": "Login_Test_Definitions.user_Entered_the_Username_and_Password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login_Test_Definitions.clicks_On_the_Login_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login_Test_Definitions.user_Should_navigate_to_Home_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("openGoogle.feature");
formatter.feature({
  "line": 2,
  "name": "VerifyTheSearchBar",
  "description": "",
  "id": "verifythesearchbar",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@VerifyTheSearchBar"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "Open google website and search",
  "description": "",
  "id": "verifythesearchbar;open-google-website-and-search",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is entering the google.co.in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "select the search box",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Enters the search term as \"salem\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Enters the returns key",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User able to see the search results",
  "keyword": "Then "
});
formatter.match({
  "location": "openGoogleDefinitions.user_is_entering_the_google_co_in()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "openGoogleDefinitions.select_the_search_box()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "salem",
      "offset": 27
    }
  ],
  "location": "openGoogleDefinitions.enters_the_search_term_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "openGoogleDefinitions.enters_the_returns_key()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "openGoogleDefinitions.user_able_to_see_the_search_results()"
});
formatter.result({
  "status": "skipped"
});
});