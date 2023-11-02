Feature: Search functionality

  Scenario Outline: Validate search functionality
    Given User in home Page
    When User enter "<product>" in search field
    And User click on search button
    Then Product "<product>" should display
    
    Examples:
    |product| 
    |iPhone | 
    |Mackbook Air|
    |Mackbook Pro|

