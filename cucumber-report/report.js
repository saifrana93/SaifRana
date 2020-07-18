$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "user login mechanism",
  "description": "As a user in order to get all benefits from gmail account  \r\nI want to login successfully",
  "id": "user-login-mechanism",
  "keyword": "Feature"
});
formatter.background({
  "line": 5,
  "name": "Landing on gmail home page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I land on gmail account page",
  "keyword": "And "
});
formatter.match({
  "location": "Main_steps_login.i_open_browser()"
});
formatter.result({
  "duration": 10746785391,
  "status": "passed"
});
formatter.match({
  "location": "Main_steps_login.iLandOnGmailAccountPage()"
});
formatter.result({
  "duration": 5774767768,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "login successfully",
  "description": "",
  "id": "user-login-mechanism;login-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@nr"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I complete Login With nr nr",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 13,
      "value": "#And I expect to see profile name as nr nr"
    },
    {
      "line": 14,
      "value": "#And I want to look for desired email"
    }
  ],
  "line": 15,
  "name": "I expect to select specific email by name and delete them",
  "keyword": "Then "
});
formatter.match({
  "location": "Main_steps_login.iCompleteLoginWithNrNr()"
});
formatter.result({
  "duration": 6422543768,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\"identifierNext\"]/span\"}\n  (Session info: chrome\u003d83.0.4103.116)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027DESKTOP-NEIBPHL\u0027, ip: \u0027192.168.217.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.116, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\SAIFUR~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:61615}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 3e93040991f4ace0f6d5e53c15e4c69b\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"identifierNext\"]/span}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat steps_PageObjectModel.MasterPage.clickOnElement(MasterPage.java:21)\r\n\tat steps_PageObjectModel.HomePage.Dologin(HomePage.java:29)\r\n\tat steps_Main.Main_steps_login.iCompleteLoginWithNrNr(Main_steps_login.java:48)\r\n\tat ✽.When I complete Login With nr nr(login.feature:12)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Main_steps_login.iExpectToSelectSpecificEmailByNameAndDeleteThem()"
});
formatter.result({
  "status": "skipped"
});
});