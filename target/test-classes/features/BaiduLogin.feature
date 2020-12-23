Feature: Test Baidu search fuction
@test1
  Scenario Outline: User should be able to search wanted information
  Given User input baidu url
  When User input "<keyword>"
  And submit it
  Then user should be able to see related information
  Examples:
  |keyword|
  |selenium|
  |English|
