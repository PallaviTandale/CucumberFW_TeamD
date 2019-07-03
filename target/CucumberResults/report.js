$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/MAYUR/eclipse-workspace/AutomationPoCCucumber/src/test/resources/eCommerce/CsCartSearch.feature");
formatter.feature({
  "name": "Check the Search Functionality for multiple products",
  "description": "  Iterate Search for multiple products",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@cscart"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Search multiple products from feature file",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@cscart_search"
    }
  ]
});
formatter.step({
  "name": "As a user when I launch application in \"chrome\"",
  "keyword": "Given "
});
formatter.step({
  "name": "navigate to url as \"https://demo.cs-cart.com\"",
  "keyword": "And "
});
formatter.step({
  "name": "I enter \"\u003cProduct\u003e\" in top search box",
  "keyword": "When "
});
formatter.step({
  "name": "click on search submit button",
  "keyword": "And "
});
formatter.step({
  "name": "page navigates to product search results",
  "keyword": "Then "
});
formatter.step({
  "name": "proudct results are displayed",
  "keyword": "And "
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Product"
      ]
    },
    {
      "cells": [
        "Computer"
      ]
    },
    {
      "cells": [
        "Mobile"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Search multiple products from feature file",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@cscart"
    },
    {
      "name": "@cscart_search"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "As a user when I launch application in \"chrome\"",
  "keyword": "Given "
});
formatter.match({
  "location": "STEPS_Common.as_a_user_launch_application(String)"
});
formatter.write("Chrome Driver Invoked");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to url as \"https://demo.cs-cart.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "STEPS_Common.navigate_to_url(String)"
});
formatter.write("Navigated to URL: https://demo.cs-cart.com");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"Computer\" in top search box",
  "keyword": "When "
});
formatter.match({
  "location": "STEPS_CsCartHomeSearch.i_enter_product_in_top_search_box(String)"
});
formatter.write("Product entered in the Search box: Computer");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search submit button",
  "keyword": "And "
});
formatter.match({
  "location": "STEPS_CsCartHomeSearch.click_on_search_submit_button()"
});
formatter.write("Clicked on Search Button");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page navigates to product search results",
  "keyword": "Then "
});
formatter.match({
  "location": "STEPS_CsCartHomeSearch.page_navigates_to_product_search_results()"
});
formatter.write("validation of the page title is successfull");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "proudct results are displayed",
  "keyword": "And "
});
formatter.match({
  "location": "STEPS_CsCartHomeSearch.proudct_results_are_displayed()"
});
formatter.write("validating the Search results");
formatter.write("validation of the Search results is successfull");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "STEPS_Common.close_the_browser()"
});
formatter.write("Browser Closed");
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search multiple products from feature file",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@cscart"
    },
    {
      "name": "@cscart_search"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "As a user when I launch application in \"chrome\"",
  "keyword": "Given "
});
formatter.match({
  "location": "STEPS_Common.as_a_user_launch_application(String)"
});
formatter.write("Chrome Driver Invoked");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to url as \"https://demo.cs-cart.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "STEPS_Common.navigate_to_url(String)"
});
formatter.write("Navigated to URL: https://demo.cs-cart.com");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"Mobile\" in top search box",
  "keyword": "When "
});
formatter.match({
  "location": "STEPS_CsCartHomeSearch.i_enter_product_in_top_search_box(String)"
});
formatter.write("Product entered in the Search box: Mobile");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on search submit button",
  "keyword": "And "
});
formatter.match({
  "location": "STEPS_CsCartHomeSearch.click_on_search_submit_button()"
});
formatter.write("Clicked on Search Button");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page navigates to product search results",
  "keyword": "Then "
});
formatter.match({
  "location": "STEPS_CsCartHomeSearch.page_navigates_to_product_search_results()"
});
formatter.write("validation of the page title is successfull");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "proudct results are displayed",
  "keyword": "And "
});
formatter.match({
  "location": "STEPS_CsCartHomeSearch.proudct_results_are_displayed()"
});
formatter.write("validating the Search results");
formatter.write("validation of the Search results is successfull");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "STEPS_Common.close_the_browser()"
});
formatter.write("Browser Closed");
formatter.result({
  "status": "passed"
});
});