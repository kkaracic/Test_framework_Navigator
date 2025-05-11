@login
Feature: Search testing
  User should be able to do the search once the site is opened

  Scenario Outline: Search testing
    Given the user opens Navigator site
    When the user clicks on the input field and writes <SearchTerm>
    When the user presses the RETURN key
    Then the user verifies that the city hall of Sarajevo is shown as the search result on the screen

  Examples:
    | SearchTerm |
    | Vijećnica |