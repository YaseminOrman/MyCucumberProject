@data_tables_1
Feature: data_tables

  Scenario: customer_login
    Given user is on "http://www.bluerentalcars.com/login"
    When user enters customer email and customer password
      | username       | password |
      | jack@gmail.com | 12345    |
    Then verify application login is successful
    Then close the application