@TC_0001
Feature: GMI_Bank


  Background:
    Given Go to GMIBank website

  Scenario:
    And  Navigate to registration page
    Then Click on SSN textbook
    Then Provide the SNN of the applicant
    Then I should not see the error message


  @Error
  Scenario Outline:
    And  Navigate to registration page
    Then Click on SSN textbook
    Then Provide the wrong  "<SNN>" of the applicant
    Then I should see the error message

    Examples:
      | SNN        |
      | 123-45-678 |

  @Password
  Scenario Outline:
    And  Navigate to registration page
    Then Click on Password textbook
    Then Enter the "<password>"
    Then Assert the test

    Examples:
      | password |
      | Abc1!    |


  @SignIn
  Scenario Outline:
    Then Click Sign In
    Then Fill "<username>" and "<password>"
    Then Click on sign in button
    Then Click on Team35 GmiBankProject
    Then Click on User Info
    Then Verify your firstname
    Then Verify your lastname
    Then Verify your email
    Then Verify your language

    Examples:
      | username  |  | password  |
      | Team35Gmi |  | Team35Gmi |


  @TC0002
  Scenario Outline:
    Then Click Sign In
    Then Fill "<username>" and "<password>"
    Then Click on sign in button
    Then Click on Team35 GmiBankProject
    Then Click on User Info
    Then Click on language's dropdown arrow
    Then Change your language
    Then Click on save button
    Then Verify it has changed
    Examples:
      | username  |  | password  |
      | Team35Gmi |  | Team35Gmi |

  @TC0004
  Scenario Outline:
    Then Click Sign In
    Then Fill "<username>" and "<password>"
    Then Click on sign in button
    Then Click on Team35 GmiBankProject
    Then Click on User Info
    Then Click on First Name text box
    Then Change your firstname with test data
    Then Click on save button
    Then Verify firstname has changed
    Examples:
      | username  |  | password  |
      | Team35Gmi |  | Team35Gmi |
















