Feature:first feature file
  Scenario: TC_01_first_scenario
    Given user is on the google home page
    When user search for iPhone
    Then verify page title contains iPhone
    Then close the page

  Scenario: TC_02_teapot_search
    Given user is on the google home page
    When user search for TeaPot
    Then verify page title contains TeaPot
    Then close the page