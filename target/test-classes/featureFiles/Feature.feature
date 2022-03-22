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
Feature: Feature page
	As a user I should be able to log into the page and open articles.

  @registeredUser
  Scenario: Registered user can access with his profile and last configurations
    Given User is in login page
    When User send an email 
    And User send a password 
    And User click on log in sign in button
    Then User should be in profile page
    
    @nonRegisteredUser
  Scenario: Non registered user can access with a default profile
    Given User is in login page
    When User click on log in sign in button
    Then User should be in default page

    @premiumPlanUser
  Scenario: User with premium plan can see the most relevant global news and local news
    Given User is in login page
    When User send an email
    And User send a password
    And User click on log in sign in button
    Then User should be in news page with access to all news
    
    @freePlanUser
  Scenario: User with free plan can see limited local news and not global news
    Given User is in login page
    When User send an email
    And User send a password
    And User click on log in sign in button
    Then User should be in news page with limited access to local news 
    But User should not have access to global news

     @premiumPlanUser
  Scenario: User with premium plan can see the full article with no ads
    Given User is in articles page
    When User opens an article
    Then User should see the full article with no ads
    
     @freePlanUser
  Scenario: User with free plan can see the full article with at least five adds
    Given User is in articles page
    When User opens an article
    Then User should see the entire article with at least five adds
    
     @nonRegisteredUser
  Scenario: Non registered user should not be able to see entire article
    Given User is in articles page
    When User opens an article
    Then User should see access denied 
    
    @freePlanUser
  Scenario: A registered user should be able to change his membership
    Given User is membership page
    When User selects a plan
    Then User should be able to change to the plan selected
    
    