@login
Feature: Login to Jubelio Website
  Background:
    Given User opens Jubelio website page "https://app.jubelio.com/login"

  @valid-data
  Scenario Outline: Login with valid data
    When User input valid "<email>" and "<password>"
    Then User redirected to homepage

    Examples:
    | email                        | password     |
    | qa.rakamin.jubelio@gmail.com | Jubelio123!  |

  @invalid-data
  Scenario Outline: Login with invalid data
    When User input invalid "<email>" and "<password>"
    Then User should got error message

    Examples:
      | email                        | password     |
      | qa.rakamin.jubelio@gmail.com | Jubelio1234  |
      | qa.rakamin@gmail.com         | Jubelio123!  |

