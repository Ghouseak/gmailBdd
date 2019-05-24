 #Author: ghouseak@gmail.com

## (Comments)
#Sample Feature Definition Template
@tag
Feature: gmail login feature
  I want to use this template for my feature file

  @tag1
  Scenario: validate gmail title
    Given Launch Gmail site
    Then title is "Gmail" value
    And close site

  @tag2
  Scenario Outline: Title of your scenario outline
 Given: Launch Gmail site
	 When: ente ruserid with "<x>" value
   And: click next button
   Then: validate userid field with "<y>" criteria
   And: close site

    Examples: 
      | x             | y       | 
      | abcmtestemail | valid   |
      | abcdtestemail | invalid |
