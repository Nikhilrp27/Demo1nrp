Feature: Test Sauce Demo application

  Scenario Outline: Test Sauce Demo Application
    Given user is on login page
    Then user enters "<userid>" , "<password>" and click on login button

    Examples: 
      | userid        | password     |
      | standard_user | secret_sauce |
      | visual_user   | secret_sauce |
