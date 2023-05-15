Feature: This is practice feature to solve broweser issues

  Background: Given I launch the web browser

  Scenario: Working with first instance
    Then I navigate to google search page

  Scenario: Working with second instance
    When I navigate to google search page
    Then I navigate to google about page
   # Then I navigate to google search page

  Scenario: Working with third instance
    When I navigate to google search page
    Then I navigate to google store
  #  Then I navigate to google search page



