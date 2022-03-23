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
Feature: Login page
	As a user I should be able to log into the page.

  @registeredUser
  Scenario Outline: Registered user can access with his profile and last configurations
    Given User is in login page
    When User send an email "<user>"
    And User send a password "<password>"
    And User click on log in sign in button
    Then User should be in profile page
    Examples: 
    | user     | password |
    | monicasl | DSdsbfG! |
    | edilsl   | Hdbjvf!  |
    
    @nonRegisteredUser
  Scenario: Non registered user can access with a default profile
    Given User is in login page
    When User click on log in sign in button
    Then User should be in default page
    

    
  
    
    