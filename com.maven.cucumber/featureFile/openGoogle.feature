@VerifyTheSearchBar
Feature: VerifyTheSearchBar
Scenario: Open google website and search
    Given user is entering the google.co.in
    When select the search box
    When Enters the search term as "salem"
    And Enters the returns key
    Then User able to see the search results