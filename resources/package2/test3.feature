#Author: your.email@your.domain.com
@tag
Feature: Gmail login
  I want to use this template for my feature file

  @tag1
  Scenario Outline:Valid password
    Given Launch Gmail site
    When enter userid with "<userName>" value
    And Click next button
    And enter password with "<password>" value
    And click password next button
    
    Examples: 
      | userName  |    password      | 
      | ghouseak  |    ghouse@786    |