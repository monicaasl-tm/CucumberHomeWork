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
@tag
Feature: Free user
  	As a free user I should be able to see articles depending on my account.

  Background: User logins with credentials
    Given User is in login page
    When User send an email "edilsl"
    And User send a password "Hdbjvf!"
    And User click on log in sign in button
    Then User should be logged in as "edilsl"
    
     @freePlanUser
  Scenario: User with free plan can see limited local news and not global news
    Given User is logged in as "edilsl"
    But User should not have access to global news
    
      @freePlanUser
  Scenario: User with free plan can see the full article with at least five adds
    Given User is logged in as "edilsl"
    When User opens an article
    Then User should see the entire article with at least five adds
    
     @freePlanUser
  Scenario: A registered user should be able to change his membership
    Given User is logged in as "edilsl"
    When User is membership page
    And User selects a plan 
    Then User should be able to change to the plan selected
    
    
    