#Author: your.email@your.domain.com

@tag
Feature: Gmail login
  I want to use this template for my feature file

  @tag1
  Scenario Outline:Valid password
    Given Launch Gmail site
    And Click next button
    And enter password with "<p>" value
    And click password next button
    Then Validate password with "<PC>" criteria
    And close site
  Examples: 
      | p  				| PC			|	
      | testadmin | valid		|	
      | testuser	| invalid	|	
									|	blank		|