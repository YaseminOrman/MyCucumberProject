@MedunnaRoom
Feature: Medunna Room Creation

  Background: Sign In Medunna
    Given user is on "https://medunna.com/"
    When click on user icon
    And click on Sign In option
    And enter "john_doe" in Username input
    And enter "John.123" in Password input
    And click on Remember Me checkbox
    And click on Sign In submit button
  
 Scenario Outline: Create Room

   And click on Items&Titles
   And click on Room option
   And click on Create a new room button
   And enter "<room_number>" room number input
   And select Suite option Room Type dropdown
   And click on Status checkbox
   And enter "<price>" in Price input
   And enter "<description>" in Description input
   And click on Save button
   And click on Created Date
   Then assert that room is created via "<room_number>"
   And close the application
   Examples:
     | room_number | price | description |
     | 12534768 | 1234 | Good |
     | 65345090 | 500 | well |


