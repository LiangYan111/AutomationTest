Feature: check Driver fengzhuang
  @1209
  Scenario Outline: Validate driver
    Given I input baidu url
    When I input "<keyword>"
    And I submit it 1
    Then I should be able to see related information 1
    Examples:
      |keyword|
      |web automation test|

