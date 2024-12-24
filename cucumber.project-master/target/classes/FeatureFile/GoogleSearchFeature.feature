@GlobalTag
Feature: Google search validate

  @Sanity @Regression @Smoke @GoogleSearch
  Scenario: Validate Google Seach
    Given I am on google main page
    When I enter text in search text field and click on seach button
    Then I should see search results

  @Regression @Smoke @GoogleSearch
  Scenario Outline: Validate Google Seach with multiple data
    Given I am on google main page "<url>"
    When I enter "<text>" in search text field and click on seach button
    Then I should see search results

    Examples: 
      | url                      | text  |
      | https://www.google.co.in | gmail |
      | https://www.google.co.in | Hello |
	  | https://www.google.co.in | Hello |
	  | https://www.google.co.in | Hello |
      
  @Regression @Smoke @GoogleSearch
  Scenario: Validate Google Seach Fail
    Given I am on google main page
    When I enter text in search text field and click on seach button
    Then I should able to click on link "Gmail-Home"
