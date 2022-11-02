#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Search
Feature: Search Google
  As a user I want to search for any terms using the single search bar on screen.
  After submitting any search users should be able to see how many results were found
  After submitting any search users should be able to see how long the search took
  If the searched term does not match any results, the system should present an error message
  Our search results page should always include links to Settings

  @SearchWithResults
  Scenario Outline: Search with results
    Given I navigate to Google <Url>
    When I want to search for any terms
    Then I should be able to search for a term <Term> using the single search bar 
    And I should be able to see how many results were found and how long the search took

    Examples: 
      | 					Url 			    |  Term  |   How many	  | How long |
      | https://www.google.com  | Prueba |  10.700.000 	|   0,56   |
 
 @SearchWithoutResults
  Scenario Outline: Search without results
    Given I navigate to Google <Url>
    When I want to search for any terms
    Then I should be able to search for a term <Term> using the single search bar 
    And The system should present an error message

    Examples: 
      | 					Url 			    |  Term  |   Message	  |
      | https://www.google.com  |  ----  |    Error   	|
 