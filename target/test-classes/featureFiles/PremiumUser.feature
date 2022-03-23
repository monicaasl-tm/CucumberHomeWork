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
Feature: Premium user
  	As a premium user I should be able to see articles depending on my account.

  Background: User logins with credentials
    Given User is in login page
    When User send an email "monicasl"
    And User send a password "DSdsbfG!"
    And User click on log in sign in button
    Then User should be logged in as "monicasl"

  @premiumPlanUser
  Scenario: User with premium plan can see the most relevant global news and local news
    Given User is logged in as "monicasl"
    Then User should be in news page with access to all news
    
  @premiumPlanUser
  Scenario: User with premium plan can see the full article with no ads
    Given User is logged in as "monicasl"
    When User opens an article
    Then User should see the full article with no ads


