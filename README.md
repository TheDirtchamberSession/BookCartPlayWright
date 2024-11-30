# ⭐️  Playwright Java ⭐

## 📖 Introduction

Playwright was created specifically to accommodate the needs of end-to-end testing. 
Playwright supports all modern rendering engines including Chromium, WebKit, and Firefox. Test on Windows, Linux, and macOS, locally or on CI, headless or headed with native mobile emulation.

## ✨ Prerequisites
1. Java Development Kit (JDK) installed
2. Maven (for project dependency management)
3. Allure (for test reporting)

## 🗂️ Project Structure
1. src/test/java/cart/book/test - Contain the TestExample class and BeforeAll class.
2. src/test/java/search/utility - contains classes for Function and Page Object.
3. src/test/suite - Contains the XML file to run the Smoke test.

## 🤹 Usage and Test Execution

```
mvn clean test
```
You can also choose to run a specific .xml file using the command below
```
mvn clean test -DsuiteFile="src/test/suite/smoke_tests/HighPriority_SmokeTest.xml"
```
## 📄Test Result reporting
In this project, Allure Report is used as the test reporting tool.

The Allure serve command below creates a report, puts it into a temporary directory and starts a local web server configured to show this directory's contents. The command then automatically opens the main page of the report in a web browser. Use this command if you need to view the report for yourself and do not need to save it.
```
allure serve target\allure-results\
```
```
allure generate --single-file target\allure-results\
```
This .html file can be viewed in any browser or using the Allure open command below.
```
allure open
```
Before running another set of tests, be sure to create a copy of the .html file as it will be overwritten by the results of a new execution.