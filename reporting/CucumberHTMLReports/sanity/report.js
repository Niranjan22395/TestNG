$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/FeatureTest/SearchProduct.feature");
formatter.feature({
  "name": "Search functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validate search functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User in home Page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enter \"\u003cproduct\u003e\" in search field",
  "keyword": "When "
});
formatter.step({
  "name": "User click on search button",
  "keyword": "And "
});
formatter.step({
  "name": "Product \"\u003cproduct\u003e\" should display",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "product"
      ]
    },
    {
      "cells": [
        "iPhone"
      ]
    },
    {
      "cells": [
        "Mackbook Air"
      ]
    },
    {
      "cells": [
        "Mackbook Pro"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate search functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "error_message": "java.lang.IllegalStateException: The driver executable does not exist: C:\\Users\\05457U744\\Downloads\\chromedriver-win64\\chromedriver.exe\r\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:199)\r\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:121)\r\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:116)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$0(ChromeDriverService.java:1)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:137)\r\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:296)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:88)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:116)\r\n\tat stepDefinitions.SearchPage.StartBrowser(SearchPage.java:23)\r\n",
  "status": "failed"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "User in home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.SearchPage.UserinhomePage()"
});
formatter.result({
  "status": "skipped"
});
formatter.afterstep({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "User enter \"iPhone\" in search field",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.SearchPage.Userenterinsearchfield(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.afterstep({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "User click on search button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.SearchPage.Userclickonsearchbutton()"
});
formatter.result({
  "status": "skipped"
});
formatter.afterstep({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "Product \"iPhone\" should display",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.SearchPage.Productshoulddisplay(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.afterstep({
  "status": "skipped"
});
formatter.after({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.WebDriver.quit()\" because \"this.driver\" is null\r\n\tat stepDefinitions.SearchPage.closebrowser(SearchPage.java:57)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate search functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "error_message": "java.lang.IllegalStateException: The driver executable does not exist: C:\\Users\\05457U744\\Downloads\\chromedriver-win64\\chromedriver.exe\r\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:199)\r\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:121)\r\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:116)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$0(ChromeDriverService.java:1)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:137)\r\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:296)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:88)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:116)\r\n\tat stepDefinitions.SearchPage.StartBrowser(SearchPage.java:23)\r\n",
  "status": "failed"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "User in home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.SearchPage.UserinhomePage()"
});
formatter.result({
  "status": "skipped"
});
formatter.afterstep({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "User enter \"Mackbook Air\" in search field",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.SearchPage.Userenterinsearchfield(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.afterstep({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "User click on search button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.SearchPage.Userclickonsearchbutton()"
});
formatter.result({
  "status": "skipped"
});
formatter.afterstep({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "Product \"Mackbook Air\" should display",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.SearchPage.Productshoulddisplay(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.afterstep({
  "status": "skipped"
});
formatter.after({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.WebDriver.quit()\" because \"this.driver\" is null\r\n\tat stepDefinitions.SearchPage.closebrowser(SearchPage.java:57)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate search functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "error_message": "java.lang.IllegalStateException: The driver executable does not exist: C:\\Users\\05457U744\\Downloads\\chromedriver-win64\\chromedriver.exe\r\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:199)\r\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:121)\r\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:116)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$0(ChromeDriverService.java:1)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:137)\r\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:296)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:88)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:116)\r\n\tat stepDefinitions.SearchPage.StartBrowser(SearchPage.java:23)\r\n",
  "status": "failed"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "User in home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.SearchPage.UserinhomePage()"
});
formatter.result({
  "status": "skipped"
});
formatter.afterstep({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "User enter \"Mackbook Pro\" in search field",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.SearchPage.Userenterinsearchfield(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.afterstep({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "User click on search button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.SearchPage.Userclickonsearchbutton()"
});
formatter.result({
  "status": "skipped"
});
formatter.afterstep({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "Product \"Mackbook Pro\" should display",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.SearchPage.Productshoulddisplay(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.afterstep({
  "status": "skipped"
});
formatter.after({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.WebDriver.quit()\" because \"this.driver\" is null\r\n\tat stepDefinitions.SearchPage.closebrowser(SearchPage.java:57)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/FeatureTest/Tests.feature");
formatter.feature({
  "name": "Tests",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate Tests entering functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "error_message": "java.lang.IllegalStateException: The driver executable does not exist: C:\\Users\\05457U744\\Downloads\\chromedriver-win64\\chromedriver.exe\r\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:199)\r\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:121)\r\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:116)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$0(ChromeDriverService.java:1)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:137)\r\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:296)\r\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:88)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:116)\r\n\tat stepDefinitions.SearchPage.StartBrowser(SearchPage.java:23)\r\n",
  "status": "failed"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user in Tests page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Tests.userinTestspage()"
});
formatter.result({
  "status": "skipped"
});
formatter.afterstep({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "user enter data in search filed",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Tests.userenterdatainsearchfiled()"
});
formatter.result({
  "status": "skipped"
});
formatter.afterstep({
  "status": "skipped"
});
formatter.beforestep({
  "status": "skipped"
});
formatter.step({
  "name": "data should appear in search field",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Tests.datashouldappearinsearchfield()"
});
formatter.result({
  "status": "skipped"
});
formatter.afterstep({
  "status": "skipped"
});
formatter.after({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.WebDriver.quit()\" because \"this.driver\" is null\r\n\tat stepDefinitions.SearchPage.closebrowser(SearchPage.java:57)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});