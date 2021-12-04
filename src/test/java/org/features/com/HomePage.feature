Feature: Homepage Scenarios


#Common steps in scenarios
Background:
 Given User is on homepage

@Regression
  #Scenario: Initiate Search - OneWay
  #Then User select oneway
  #Then User enter from
  #And User enter to
  #And select depart date
  #Then Click on Search
  #And Listing page should open
  
  #Can I pass data in test from a feature file?
  #Scenario: Initiate Search - RoundTrip
  #Then User select roundTrip
  #Then User enter from "DEL"
  #And User enter to "NYC"
  #And select depart date "10"
  #Then Click on Search
  #And Listing page should open	
  
  
  @Smoke
  Scenario Outline: Initiate Search - RoundTrip with different set of data
    Then User select roundTrip
    Then User enter from "<FROM>"
    And User enter to "<TO>"
    And select depart date "<DepartDate>"
    * select return date "<ReturnDate>"
    Then Click on Search
    And Listing page should open

    Examples: 
      | FROM | TO  | DepartDate | ReturnDate |
      | DEL  | NYC |         10 |         15 |
      | LAS  | LAX |         18 |         25 |
      | MNL  | LON |         12 |         17 |